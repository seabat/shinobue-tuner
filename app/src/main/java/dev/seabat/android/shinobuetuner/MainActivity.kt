package dev.seabat.android.shinobuetuner

import android.content.pm.PackageManager
import android.os.Bundle
import android.util.Log
import android.view.WindowManager
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
import dev.seabat.android.shinobuetuner.compose.ScaleInfo
import dev.seabat.android.shinobuetuner.ui.theme.ShinobueTunerTheme
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScale
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScaleType
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.GlobalScope
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.launch


class MainActivity : ComponentActivity() {

    private val scaleInfoStateFlow = MutableStateFlow(ScaleInfo(0.0f, 0, ShinobueScaleType.UNKNOWN, 0L))

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

        // 画面をオンのままにする
        window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)

        ContextCompat.checkSelfPermission(
            this,
            android.Manifest.permission.RECORD_AUDIO
        ).let {
            if (it != PackageManager.PERMISSION_GRANTED) {
                requestPermissionLauncher.launch(android.Manifest.permission.RECORD_AUDIO)
            }
        }

        setContent {
            val scaleInfoState by scaleInfoStateFlow.collectAsState()

            ShinobueTunerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    HomeScreen(scaleInfo = scaleInfoState)
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
        val scale = ShinobueScale()(pitchInHz)
        scaleInfoStateFlow.value = ScaleInfo(
            hz = pitchInHz,
            diffRate = scale.second,
            scaleType = scale.first,
            count = scaleInfoStateFlow.value.count+1
        )
//        Log.d("shinobue", "Hz: $pitchInHz Diff: ${scale.second}")
    }
}

