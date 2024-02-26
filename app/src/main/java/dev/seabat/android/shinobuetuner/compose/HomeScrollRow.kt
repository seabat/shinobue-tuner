package dev.seabat.android.shinobuetuner.compose

import android.util.Log
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.platform.LocalDensity
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import dev.seabat.android.shinobuetuner.R
import dev.seabat.android.shinobuetuner.ui.theme.RobotTextStyle
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScaleType

@Composable
fun HomeScrollRow(scaleInfo: ScaleInfo) {
    BoxWithConstraints {
        // 端末の画面幅
        val screenWidth = LocalConfiguration.current.screenWidthDp
        // コンテンツの幅
        val contentWidth = with(LocalDensity.current) { constraints.maxWidth.toDp() }

        val offsetBlock = contentWidth.value / (17f)
        val offsetDp = calcurateOffset(scaleInfo.scaleType, offsetBlock)
        Log.d(
            "shinobue",
            "scale=${scaleInfo.scaleType.scaleType.tuneScale}、" +
                    "screenWidth=$screenWidth、" +
                    "contentWidth=$contentWidth、" +
                    "offsetDp=$offsetDp"
        )

        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {
            val resourceId = getResourceId(scaleInfo.scaleType)
            if (resourceId == R.drawable.transparent_no) {
                Text(
                    modifier = Modifier.padding(start = offsetDp.dp),
                    text = scaleInfo.scaleType.scaleType.tuneScale,
                    textAlign = TextAlign.Left,
                    style = RobotTextStyle.regular18Black
                )
            } else {
                Image(
                    modifier = Modifier.padding(start = offsetDp.dp).height(21.dp),
                    painter = painterResource(resourceId),
                    contentDescription = ""
                )
            }
            GoodBadImage(scaleInfo = scaleInfo) {
                if (it == GoodBadType.NORMAL) {
                    Text(text = "")
                } else {
                    Image(
                        modifier = Modifier.height(19.dp).padding(0.dp).alpha(0.6f),
                        painter = painterResource(
                            id = if (it == GoodBadType.GOOD) {
                                R.drawable.like
                            } else {
                                R.drawable.unlike
                            }
                        ),
                        contentDescription = ""
                    )
                }
            }
        } // Row
    }
}

private fun calcurateOffset(scaleType: ShinobueScaleType, offsetBlock: Float): Float {
    return when (scaleType) {
        // 低ド
        ShinobueScaleType.As4 -> {offsetBlock * 16}
        ShinobueScaleType.C5 -> {offsetBlock * 15}
        ShinobueScaleType.D5 -> {offsetBlock * 14}
        ShinobueScaleType.Ds5 -> {offsetBlock * 13}
        ShinobueScaleType.F5 -> {offsetBlock * 12}
        ShinobueScaleType.G5 -> {offsetBlock * 11}
        ShinobueScaleType.A5 -> {offsetBlock * 10}
        // 中ド
        ShinobueScaleType.As5 -> {offsetBlock * 9}
        ShinobueScaleType.C6 -> {offsetBlock * 8}
        ShinobueScaleType.D6 -> {offsetBlock * 7}
        ShinobueScaleType.Ds6 -> {offsetBlock * 6}
        ShinobueScaleType.F6 -> {offsetBlock * 5}
        ShinobueScaleType.G6 -> {offsetBlock * 4}
        ShinobueScaleType.A6 -> {offsetBlock * 3}
        //中のド
        ShinobueScaleType.As6 -> {offsetBlock * 2}
        ShinobueScaleType.C7 -> {offsetBlock * 1}
        ShinobueScaleType.D7 -> {offsetBlock * 0}
        else -> offsetBlock * 17
    }
}

private fun getResourceId(scaleType: ShinobueScaleType): Int {
    return when (scaleType) {
        // 低ド
        ShinobueScaleType.As4 -> { R.drawable.transparent_do }
        ShinobueScaleType.C5 -> { R.drawable.transparent_re }
        ShinobueScaleType.D5 -> { R.drawable.transparent_mi }
        ShinobueScaleType.Ds5 -> { R.drawable.transparent_fa }
        ShinobueScaleType.F5 -> { R.drawable.transparent_so }
        ShinobueScaleType.G5 -> { R.drawable.transparent_ra }
        ShinobueScaleType.A5 -> { R.drawable.transparent_shi }
        // 中ド
        ShinobueScaleType.As5 -> { R.drawable.transparent_do }
        ShinobueScaleType.C6 -> { R.drawable.transparent_re }
        ShinobueScaleType.D6 -> { R.drawable.transparent_mi }
        ShinobueScaleType.Ds6 -> { R.drawable.transparent_fa }
        ShinobueScaleType.F6 -> { R.drawable.transparent_so }
        ShinobueScaleType.G6 -> { R.drawable.transparent_ra }
        ShinobueScaleType.A6 -> { R.drawable.transparent_shi }
        //中のド
        ShinobueScaleType.As6 -> { R.drawable.transparent_do }
        ShinobueScaleType.C7 -> { R.drawable.transparent_re }
        ShinobueScaleType.D7 -> { R.drawable.transparent_mi }
        else ->  R.drawable.transparent_no
    }
}