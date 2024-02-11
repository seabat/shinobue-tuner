package dev.seabat.android.shinobuetuner

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.result.contract.ActivityResultContracts
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import be.tarsos.dsp.AudioProcessor
import be.tarsos.dsp.io.android.AudioDispatcherFactory
import be.tarsos.dsp.pitch.PitchDetectionHandler
import be.tarsos.dsp.pitch.PitchProcessor
import be.tarsos.dsp.pitch.PitchProcessor.PitchEstimationAlgorithm
import dev.seabat.android.shinobuetuner.ui.theme.ShinobueTunerTheme
import kotlinx.coroutines.flow.MutableStateFlow


class MainActivity : ComponentActivity() {

    private val pitchInHzStateFlow = MutableStateFlow(0.0f)
    private val noteStateFlow = MutableStateFlow("")

    private val requestPermissionLauncher = registerForActivityResult(
        ActivityResultContracts.RequestPermission()
    ) { granted ->
        if (granted) {
            initTarsosDsp()
        } else {
            //TODO: エラーダイアログを表示する
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        requestPermissionLauncher.launch(android.Manifest.permission.RECORD_AUDIO)

        setContent {
            val pitchInHzState by pitchInHzStateFlow.collectAsState()
            val noteState by noteStateFlow.collectAsState()

            ShinobueTunerTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Greeting(hz = pitchInHzState, note = noteState)
                }
            }
        }
    }

    private fun initTarsosDsp() {
        val dispatcher = AudioDispatcherFactory.fromDefaultMicrophone(22050, 1024, 0)

        val pdh = PitchDetectionHandler { res, e ->
            val pitchInHz = res.pitch
            runOnUiThread { processPitch(pitchInHz) }
        }
        val pitchProcessor: AudioProcessor =
            PitchProcessor(PitchEstimationAlgorithm.FFT_YIN, 22050f, 1024, pdh)
        dispatcher.addAudioProcessor(pitchProcessor)

        val audioThread = Thread(dispatcher, "Audio Thread")
        audioThread.start()
    }

    private fun processPitch(pitchInHz: Float) {
        pitchInHzStateFlow.value = pitchInHz
        if(pitchInHz >= 110 && pitchInHz < 123.47) {
            //A
            noteStateFlow.value = "A"
        }
        else if(pitchInHz >= 123.47 && pitchInHz < 130.81) {
            //B
            noteStateFlow.value = "B"
        }
        else if(pitchInHz >= 130.81 && pitchInHz < 146.83) {
            //C
            noteStateFlow.value = "C"
        }
        else if(pitchInHz >= 146.83 && pitchInHz < 164.81) {
            //D
            noteStateFlow.value = "D"
        }
        else if(pitchInHz >= 164.81 && pitchInHz < 174.61) {
            //E
            noteStateFlow.value = "E"
        }
        else if(pitchInHz >= 174.61 && pitchInHz < 185) {
            //F
            noteStateFlow.value = "F"
        }
        else if(pitchInHz >= 185 && pitchInHz < 196) {
            //G
            noteStateFlow.value = "G"
        }
    }
}

@Composable
fun Greeting(
    modifier: Modifier = Modifier,
    hz: Float,
    note: String
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row {
            Text(text = "ノート：")
            Text(text = "${note}")
        }
        Row {
            Text(text = "周波数：")
            Text(text = "${hz.toString()}")
        }
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ShinobueTunerTheme {
        Greeting(hz = 130.81f, note = "A")
    }
}