package dev.seabat.android.shinobuetuner.compose

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import kotlin.math.roundToInt

@Composable
fun RateBar(diffRate: Int) {
    Row(modifier = Modifier.padding(vertical = 10.dp)) {
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

