package dev.seabat.android.shinobuetuner.compose

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.lazy.rememberLazyListState
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateListOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.rotate
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import dev.seabat.android.shinobuetuner.ui.theme.ShinobueTunerTheme
import dev.seabat.android.shinobuetuner.R
import dev.seabat.android.shinobuetuner.ui.theme.RobotTextStyle
import dev.seabat.android.shinobuetuner.utils.MusicalScale.ShinobueScaleType

@Composable
fun HomeScreen(
    modifier: Modifier = Modifier,
    scaleInfo: ScaleInfo
) {
    var recording by remember { mutableStateOf(false) }
    var speed by remember { mutableStateOf(20L) }

    val scales = remember { mutableStateListOf<ScaleInfo>() }
    var lastScale by remember {
        mutableStateOf(ScaleInfo(0.0f, 0, ShinobueScaleType.UNKNOWN, 0L))
    }

    if (recording && (scaleInfo.count != lastScale.count) && ((scaleInfo.count % speed) == 0L)) {
//        Log.d("shinobue", "Add List: scale=${scaleInfo.scaleType.scaleType.tuneScale}, count=${scaleInfo.count}")
        scales.add(scaleInfo)
        lastScale = scaleInfo
    }

    Box(
        modifier = modifier
            .fillMaxSize()
            .background(color = Color.White)
    ) {
        Image(
            modifier = Modifier
                .align(Alignment.Center)
                .padding(30.dp)
                .rotate(25f)
                .fillMaxHeight(),
            contentScale = ContentScale.FillHeight,
            alpha = 0.2f,
            painter = painterResource(id = R.drawable.clef_a07), contentDescription = ""
        )
        Column(
            modifier = Modifier
                .align(Alignment.TopCenter)
                .fillMaxSize()
                .padding(10.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            MeterLayout(
                hz = scaleInfo.hz,
                diffRate = scaleInfo.diffRate,
                scaleType = scaleInfo.scaleType
            )
            Row {
                Button(onClick = { recording = !recording }) {
                    Text(
                        text= if (recording) {
                            "記録終了"
                        } else {
                            "記録開始"
                        },
                        style = RobotTextStyle.bold16Black
                    )
                }
                Button(
                    modifier = Modifier.padding(start = 15.dp),
                    onClick = {
                        when(speed) {
                            5L -> speed = 20L
                            10L -> speed = 5L
                            20L -> speed = 10L
                        }
                        scales.clear()
                    }
                ) {
                    Text(
                        text= when(speed) {
                        5L -> "超高速"
                        10L -> "高速"
                        20L -> "低速"
                            else -> {""}
                        },
                        style = RobotTextStyle.bold16Black
                    )
                }
                Button(
                    modifier = Modifier.padding(start = 15.dp),
                    onClick = { scales.clear() }
                ) {
                    Text(
                        text= "クリア",
                        style = RobotTextStyle.bold16Black
                    )
                }
            }

            val listState = rememberLazyListState()
            LaunchedEffect(scales.size) {
                if (scales.size > 1) {
                    listState.animateScrollToItem(scales.size - 1)
                }
            }

            LazyColumn(
                state = listState,
                modifier = Modifier.padding(top = 10.dp),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                items(items = scales) {
                    Row(verticalAlignment = Alignment.CenterVertically) {
                        Text(
                            modifier = Modifier.padding(end = 10.dp),
                            text = it.scaleType.scaleType.tuneScale,
                            style = RobotTextStyle.regular18Black
                        )
                        GoodBadImage(scaleInfo = it) {
                            if (it == GoodBadType.NORMAL) {
                                Text(text = "")
                            } else {
                                Image(
                                    modifier = Modifier
                                        .size(16.dp)
                                        .padding(0.dp)
                                        .alpha(0.8f)
                                    ,
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
                } // item
            }
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



@Preview(showBackground = true)
@Composable
fun HomeScreenPreview() {
    ShinobueTunerTheme {
        HomeScreen(
            scaleInfo = ScaleInfo(
                hz = 130.81f,
                diffRate = 10,
                scaleType = ShinobueScaleType.A4,
                count = 1L
            )
        )
    }
}