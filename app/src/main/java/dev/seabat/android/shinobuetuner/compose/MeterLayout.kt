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
                    modifier = Modifier,
                    text = scaleType.scaleType.ja,
                    color = Color.Black,
                    fontSize =  70.sp,
                    lineHeight = 105.sp
                )
                Text(
                    modifier = Modifier
                        .padding(top = 0.dp, bottom = 13.dp),
                    text = if (scaleType.scaleType == MusicalScaleType.UNKNOWN) {
                        ""
                    } else {
                        scaleType.scaleType.level.toString()
                    },
                    color = Color.Black,
                    fontSize =  30.sp,
                )
                Text(
                    modifier = Modifier.padding(top = 0.dp, bottom = 13.dp),
                    text = if (scaleType.scaleType == MusicalScaleType.UNKNOWN) {
                        ""
                    } else {
                        "(${scaleType.scaleType.en})"
                    },
                    color = Color.Black,
                    fontSize =  30.sp,
                )
        }

        // ex. 556Hz
        Row(
            modifier = Modifier,
            verticalAlignment = Alignment.Bottom
        ) {
            Text(
                text = if (hz == -1.0f) "0" else hz.roundToInt().toString(),
                color = Color.Black,
                fontSize =  40.sp
            )
            Text(
                text = "Hz",
                color = Color.Black,
                fontSize =  30.sp
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
