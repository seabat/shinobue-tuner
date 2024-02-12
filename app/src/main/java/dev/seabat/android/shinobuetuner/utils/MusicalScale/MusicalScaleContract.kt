package dev.seabat.android.shinobuetuner.utils.MusicalScale

interface MusicalScaleContract {
    operator fun invoke(pitchInHz: Float): Pair<ShinobueScaleType, Int>
}