package dev.seabat.android.shinobuetuner.compose

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.seabat.android.shinobuetuner.ui.theme.OzwaldTextStyle
import dev.seabat.android.shinobuetuner.utils.MusicalScale.MusicalScaleType
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScaleType
import kotlin.math.roundToInt

@Composable
fun MeterLayout(
    modifier: Modifier = Modifier,
    hz: Float,
    diffRate: Int,
    scaleType: ShinobueScaleType
) {
    Column(
        modifier = modifier,
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        // ex. ラ3(A4)
        Row(
            verticalAlignment = Alignment.Bottom
        ) {
                Text(
                    text = scaleType.scaleType.ja,
                    lineHeight = 105.sp,
                    style = OzwaldTextStyle.regular70Black
                )
                Text(
                    modifier = Modifier
                        .padding(top = 0.dp, bottom = 13.dp),
                    text = if (scaleType.scaleType == MusicalScaleType.UNKNOWN) {
                        ""
                    } else {
                        scaleType.scaleType.level.toString()
                    },
                    style = OzwaldTextStyle.regular30Black
                )
                Text(
                    modifier = Modifier.padding(top = 0.dp, bottom = 13.dp),
                    text = if (scaleType.scaleType == MusicalScaleType.UNKNOWN) {
                        ""
                    } else {
                        "(${scaleType.scaleType.en})"
                    },
                    style = OzwaldTextStyle.regular30Black
                )
        }

        // ex. 556Hz
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = if (hz == -1.0f) "0" else hz.roundToInt().toString(),
                style = OzwaldTextStyle.regular40Black
            )
            Text(
                text = "Hz",
                style = OzwaldTextStyle.regular30Black
            )
        }
        RateBar(diffRate)
    }
}


@Preview
@Composable
fun MeterScreenPreview() {
    MeterLayout(
        hz = 555.55f, diffRate = 10, scaleType = ShinobueScaleType.A3
    )
}

@Preview
@Composable
fun MeterScreenKaraPreview() {
    MeterLayout(
        hz = 0.0f, diffRate = 0, scaleType = ShinobueScaleType.UNKNOWN
    )
}
