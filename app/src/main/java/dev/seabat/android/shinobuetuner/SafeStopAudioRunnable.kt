package dev.seabat.android.shinobuetuner

import android.util.Log
import be.tarsos.dsp.AudioDispatcher
import be.tarsos.dsp.io.android.AudioDispatcherFactory
import be.tarsos.dsp.pitch.PitchDetectionHandler
import be.tarsos.dsp.pitch.PitchProcessor
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import kotlin.coroutines.CoroutineContext

class SafeStopAudioRunnable(
    createPitchDetectionHandler: () -> PitchDetectionHandler
) : CoroutineScope {

    private val myJob = Job()
    override val coroutineContext: CoroutineContext
        get() = myJob + Dispatchers.Default
    private val audioDispatcher: AudioDispatcher

    init {
        val dispatcher = AudioDispatcherFactory.fromDefaultMicrophone(22050, 1024, 0)
        dispatcher.addAudioProcessor(
            PitchProcessor(
                PitchProcessor.PitchEstimationAlgorithm.FFT_YIN,
                22050f,
                1024,
                createPitchDetectionHandler()
            )
        )
        this.audioDispatcher = dispatcher
    }
    fun run() {
        launch {
            withContext(Dispatchers.IO) {
                Log.d("shinobue", "PitchProcessor start ")
                audioDispatcher.run()
            }
        }
    }

    fun stop() {
        Log.d("shinobue", "PitchProcessor stop")
        myJob.cancel()
        audioDispatcher.stop()
    }
}