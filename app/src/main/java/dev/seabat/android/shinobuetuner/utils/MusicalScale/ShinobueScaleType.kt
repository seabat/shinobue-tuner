package dev.seabat.android.shinobuetuner.utils.MusicalScale

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
    C5(MusicalScaleType.C5, 525.630f, 510.666f, 541.032f),
    Cs5(MusicalScaleType.Cs5, 556.885f, 541.032f, 573.203f),
    D5(MusicalScaleType.D5, 589.999f, 573.203f, 607.288f),
    Ds5(MusicalScaleType.Ds5, 625.082f, 607.288f, 643.399f),
    E5(MusicalScaleType.E5, 662.252f, 643.399f, 681.657f),
    F5(MusicalScaleType.F5, 701.631f, 681.657f, 722.191f),
    UNKNOWN(MusicalScaleType.UNKNOWN, 0.0f, 0.0f, 0.0f),
}