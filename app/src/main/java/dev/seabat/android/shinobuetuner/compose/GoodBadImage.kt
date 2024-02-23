package dev.seabat.android.shinobuetuner.compose

import android.util.Log
import androidx.compose.runtime.Composable
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScaleType

@Composable
fun GoodBadImage(scaleInfo: ScaleInfo,  imageComposable: @Composable (GoodBadType)->Unit) {
    if ((scaleInfo.diffRate >= -20 && scaleInfo.diffRate <= 20) &&
        (scaleInfo.hz >= ShinobueScaleType.A4.startHz && scaleInfo.hz <= ShinobueScaleType.E7.endHz)
    ) {
        Log.d("shinobue", "GOOD(${scaleInfo.diffRate})")
        imageComposable(GoodBadType.GOOD)
    } else if ((scaleInfo.diffRate >= -100 && scaleInfo.diffRate <= -70) &&
        (scaleInfo.hz >= ShinobueScaleType.A4.startHz && scaleInfo.hz <= ShinobueScaleType.E7.endHz)
    ) {
        Log.d("shinobue", "BAD(${scaleInfo.diffRate})")
        imageComposable(GoodBadType.BAD)
    } else if ((scaleInfo.diffRate in 70..100) &&
        (scaleInfo.hz >= ShinobueScaleType.A4.startHz && scaleInfo.hz <= ShinobueScaleType.E7.endHz)
    ) {
        Log.d("shinobue", "BAD(${scaleInfo.diffRate})")
        imageComposable(GoodBadType.BAD)
    } else {
        Log.d("shinobue", "NORMAL(${scaleInfo.diffRate})")
        imageComposable(GoodBadType.NORMAL)
    }
}

enum class GoodBadType {
    GOOD,
    BAD,
    NORMAL
}