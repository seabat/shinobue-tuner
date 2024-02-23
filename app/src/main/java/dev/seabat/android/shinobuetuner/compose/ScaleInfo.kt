package dev.seabat.android.shinobuetuner.compose

import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScaleType

data class ScaleInfo(
    val hz: Float,
    val diffRate: Int,
    val scaleType: ShinobueScaleType,
    val count: Long
)