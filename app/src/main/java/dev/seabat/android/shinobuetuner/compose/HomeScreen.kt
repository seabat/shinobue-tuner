package dev.seabat.android.shinobuetuner.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import dev.seabat.android.shinobuetuner.ui.theme.ShinobueTunerTheme
import kotlin.math.roundToInt
import dev.seabat.android.shinobuetuner.R
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScaleType

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    hz: Float,
    diffRate: Int,
    scaleType: ShinobueScaleType
) {
    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(30.dp)
                .fillMaxHeight(),
            contentScale = ContentScale.FillHeight,
            alpha = 0.2f,
            painter = painterResource(id = R.drawable.clef_a07), contentDescription = ""
        )
        Column(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(30.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Row(verticalAlignment = Alignment.Bottom) {
                if (scaleType == ShinobueScaleType.UNKNOWN) {
                    Text(
                        text = "",
                        color = Color.Black,
                        fontSize =  70.sp
                    )
                    Text(
                        modifier = Modifier.padding(top = 0.dp, bottom = 10.dp),
                        text = "",
                        color = Color.Black,
                        fontSize =  30.sp
                    )
                    Text(
                        modifier = Modifier.padding(top = 0.dp, bottom = 10.dp),
                        text = "",
                        color = Color.Black,
                        fontSize =  30.sp
                    )
                } else {
                    Text(
                        text = scaleType.scaleType.ja,
                        color = Color.Black,
                        fontSize =  70.sp
                    )
                    Text(
                        modifier = Modifier.padding(top = 0.dp, bottom = 10.dp),
                        text = scaleType.scaleType.level.toString(),
                        color = Color.Black,
                        fontSize =  30.sp
                    )
                    Text(
                        modifier = Modifier.padding(top = 0.dp, bottom = 10.dp),
                        text = "(${scaleType.scaleType.en})",
                        color = Color.Black,
                        fontSize =  30.sp
                    )
                }
            }
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
}

@Composable
fun RateBox(color: Color) {
    Box(modifier = Modifier
        .padding(2.0.dp)
        .background(color = color)
        .size(12.dp)
        .border(
            width = 1.5.dp,
            color = Color.DarkGray
        )
    )
}

@Composable
fun RateBar(diffRate: Int) {
    Row(modifier = Modifier.padding(vertical = 30.dp)) {
        when((diffRate/10.0f).roundToInt()) {
            -10 -> {
                for (i in 1..10) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -9 -> {
                for (i in 1..1) {
                    RateBox(Color.White)
                }
                for (i in 1..9) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -8 -> {
                for (i in 1..2) {
                    RateBox(Color.White)
                }
                for (i in 1..8) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -7 -> {
                for (i in 1..3) {
                    RateBox(Color.White)
                }
                for (i in 1..7) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -6 -> {
                for (i in 1..4) {
                    RateBox(Color.White)
                }
                for (i in 1..6) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -5 -> {
                for (i in 1..5) {
                    RateBox(Color.White)
                }
                for (i in 1..5) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -4 -> {
                for (i in 1..6) {
                    RateBox(Color.White)
                }
                for (i in 1..4) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -3 -> {
                for (i in 1..7) {
                    RateBox(Color.White)
                }
                for (i in 1..3) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -2 -> {
                for (i in 1..8) {
                    RateBox(Color.White)
                }
                for (i in 1..2) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            -1 -> {
                for (i in 1..9) {
                    RateBox(Color.White)
                }
                for (i in 1..1) {
                    RateBox(Color.Red)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            0 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..10) {
                    RateBox(Color.White)
                }
            }
            1 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..1) {
                    RateBox(Color.Blue)
                }
                for (i in 1..9) {
                    RateBox(Color.White)
                }
            }
            2 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..2) {
                    RateBox(Color.Blue)
                }
                for (i in 1..8) {
                    RateBox(Color.White)
                }
            }
            3 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..3) {
                    RateBox(Color.Blue)
                }
                for (i in 1..7) {
                    RateBox(Color.White)
                }
            }
            4 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..4) {
                    RateBox(Color.Blue)
                }
                for (i in 1..6) {
                    RateBox(Color.White)
                }
            }
            5 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..5) {
                    RateBox(Color.Blue)
                }
                for (i in 1..5) {
                    RateBox(Color.White)
                }
            }
            6 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..6) {
                    RateBox(Color.Blue)
                }
                for (i in 1..4) {
                    RateBox(Color.White)
                }
            }
            7 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..7) {
                    RateBox(Color.Blue)
                }
                for (i in 1..3) {
                    RateBox(Color.White)
                }
            }
            8 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..8) {
                    RateBox(Color.Blue)
                }
                for (i in 1..2) {
                    RateBox(Color.White)
                }
            }
            9 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..9) {
                    RateBox(Color.Blue)
                }
                for (i in 1..1) {
                    RateBox(Color.White)
                }
            }
            10 -> {
                for (i in 1..10) {
                    RateBox(Color.White)
                }
                for (i in 1..10) {
                    RateBox(Color.Blue)
                }
            }
        }
    }
}

@Preview
@Composable
fun RateBarPreview() {
    RateBar(10)
}

@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ShinobueTunerTheme {
        HomeScreen(hz = 130.81f, diffRate = 10, scaleType = ShinobueScaleType.A4)
    }
}