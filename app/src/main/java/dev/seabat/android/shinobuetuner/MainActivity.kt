package dev.seabat.android.shinobuetuner

import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.core.content.ContextCompat
import be.tarsos.dsp.pitch.PitchDetectionHandler
import dev.seabat.android.shinobuetuner.compose.HomeScreen
import dev.seabat.android.shinobuetuner.ui.theme.ShinobueTunerTheme
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScale
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {

    private val pitchInHzStateFlow = MutableStateFlow(0.0f)
    private val noteStateFlow = MutableStateFlow("")
    private val diffPitchStateFlow = MutableStateFlow(0)

    private var safeStopAudioRunnable: SafeStopAudioRunnable? = null

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (!granted) {
            //TODO: エラーダイアログを表示する
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        ContextCompat.checkSelfPermission(
            this,
            android.Manifest.permission.RECORD_AUDIO
        ).let {
            if (it != PackageManager.PERMISSION_GRANTED) {
                requestPermissionLauncher.launch(android.Manifest.permission.RECORD_AUDIO)
            }
        }

        setContent {
            val pitchInHzState by pitchInHzStateFlow.collectAsState()
            val noteState by noteStateFlow.collectAsState()
            val diffPitchState by diffPitchStateFlow.collectAsState()

            ShinobueTunerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(hz = pitchInHzState, diffRate = diffPitchState, note = noteState)
                }
            }
        }
    }

    override fun onResume() {
        super.onResume()
        safeStopAudioRunnable = SafeStopAudioRunnable {
            PitchDetectionHandler { res, _ ->
                val pitchInHz = res.pitch
                GlobalScope.launch(Dispatchers.Main) {
                    processPitch(pitchInHz)
                }
            }
        }.apply {
            run()
        }
    }

    override fun onPause() {
        super.onPause()
        safeStopAudioRunnable?.stop()
    }

    private fun processPitch(pitchInHz: Float) {
        pitchInHzStateFlow.value = pitchInHz
        val scale = ShinobueScale()(pitchInHz)
        noteStateFlow.value = "${scale.first.scaleType.ja}/${scale.first.scaleType.en}"
        diffPitchStateFlow.value = scale.second
        Log.d("shinobue", "Hz: $pitchInHz Diff: ${scale.second}")
    }
}

