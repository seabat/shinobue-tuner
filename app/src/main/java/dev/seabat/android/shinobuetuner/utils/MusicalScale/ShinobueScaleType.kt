package dev.seabat.android.shinobuetuner.utils.MusicalScale

/**
 * 以下を参考に周波数と音階の対応表を作成
 *
 * https://www.aihara.co.jp/~taiji/browser-security/js/equal_temperament.html
 */
enum class ShinobueScaleType(
    val scaleType: MusicalScaleType,
    val hz: Float,
    val startHz: Float,
    val endHz: Float)
{
    B2(MusicalScaleType.B2, 124.032f, 120.501f, 127.666f),
    C3(MusicalScaleType.C3, 131.407f, 127.666f, 135.258f),
    Cs3(MusicalScaleType.Cs3,139.221f, 135.258f, 143.301f),
    D3(MusicalScaleType.D3, 147.500f,143.301f, 151.822f),
    Ds3(MusicalScaleType.Ds3, 156.271f, 151.822f, 160.850f),
    E3(MusicalScaleType.E3, 165.563f,160.850f, 170.414f),
    F3(MusicalScaleType.F3, 175.408f, 170.414f, 180.548f),
    Fs3(MusicalScaleType.Fs3, 185.838f, 180.548f, 191.284f),
    G3(MusicalScaleType.G3, 196.889f, 191.284f, 202.658f),
    Gs3(MusicalScaleType.Gs3,  208.596f, 202.658f, 214.709f),
    A3(MusicalScaleType.A3, 221.000f ,214.709f, 227.476f),
    As3(MusicalScaleType.As3, 234.141f ,227.476f, 241.002f),
    B3(MusicalScaleType.B3, 248.064f, 241.002f, 255.333f),
    C4(MusicalScaleType.C3, 262.815f ,255.333f, 270.516f),
    Cs4(MusicalScaleType.Cs4, 278.443f, 270.516f, 286.602f),
    D4(MusicalScaleType.D4, 295.000f, 286.602f, 303.644f),
    Ds4(MusicalScaleType.Ds4, 312.541f, 303.644f, 321.699f),
    E4(MusicalScaleType.E4, 331.126f, 321.699f, 340.829f),
    F4(MusicalScaleType.F4, 350.816f, 340.829f, 361.095f),
    Fs4(MusicalScaleType.Fs4,371.676f, 361.095f, 382.567f),
    G4(MusicalScaleType.G4, 393.777f, 382.567f, 405.316f),
    Gs4(MusicalScaleType.Gs4, 417.192f, 405.316f, 429.417f),
    A4(MusicalScaleType.A4, 442.000f, 429.417f, 454.952f),
    As4(MusicalScaleType.As4, 468.283f, 454.952f, 482.004f),
    B4(MusicalScaleType.B4, 496.128f, 482.004f, 510.666f),

    // ド5
    C5(MusicalScaleType.C5, 525.630f, 510.666f, 541.032f),
    Cs5(MusicalScaleType.Cs5, 556.885f, 541.032f, 573.203f),
    D5(MusicalScaleType.D5, 589.999f, 573.203f, 607.288f),
    Ds5(MusicalScaleType.Ds5, 625.082f, 607.288f, 643.399f),
    E5(MusicalScaleType.E5, 662.252f, 643.399f, 681.657f),
    F5(MusicalScaleType.F5, 701.631f, 681.657f, 722.191f),
    Fs5(MusicalScaleType.Fs5, 743.352f, 722.191f, 765.134f),
    G5(MusicalScaleType.G5, 787.554f, 765.134f, 810.632f),
    Gs5(MusicalScaleType.Gs5, 834.385f, 810.632f, 858.834f),
    A5(MusicalScaleType.A5, 884.000f, 858.834f, 909.903f),
    As5(MusicalScaleType.As5, 936.565f, 909.903f, 964.009f),
    B5(MusicalScaleType.B5, 992.256f, 964.009f, 1021.332f),

    // ド6
    C6(MusicalScaleType.C6, 1051.259f, 1021.332f, 1082.063f),
    Cs6(MusicalScaleType.Cs6, 1113.770f, 1082.063f, 1146.406f),
    D6(MusicalScaleType.D6, 1179.998f, 1146.406f, 1214.575f),
    Ds6(MusicalScaleType.Ds6, 1250.165f, 1214.575f, 1286.797f),
    E6(MusicalScaleType.E6, 1324.503f, 1286.797f, 1363.314f),
    F6(MusicalScaleType.F6, 1403.263f, 1363.314f, 1444.381f),
    Fs6(MusicalScaleType.Fs6, 1486.705f, 1444.381f, 1530.269f),
    G6(MusicalScaleType.G6, 1575.109f, 1530.269f, 1621.263f),
    Gs6(MusicalScaleType.Gs6, 1668.770f, 1621.263f, 1717.668f),
    A6(MusicalScaleType.A6, 1768.000f, 1717.668f, 1819.806f),
    As6(MusicalScaleType.As6, 1873.131f, 1819.806f, 1928.018f),
    B6(MusicalScaleType.B6, 1984.513f, 1928.018f, 2042.664f),

    // ド7
    C7(MusicalScaleType.C7, 2102.518f, 2042.664f, 2164.127f),
    Cs7(MusicalScaleType.Cs7, 2227.540f, 2164.127f, 2292.812f),
    D7(MusicalScaleType.D7, 2359.997f, 2292.812f, 2429.150f),
    Ds7(MusicalScaleType.Ds7,	2500.330f, 2429.150f, 	2573.595f),
    E7(MusicalScaleType.E7, 2649.007f, 2573.595f, 2726.629f),

    // TODO: 必要であれば追加

    UNKNOWN(MusicalScaleType.UNKNOWN, 0.0f, 0.0f, 0.0f),
}