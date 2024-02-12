package dev.seabat.android.shinobuetuner.utils.MusicalScale

class ShinobueScale : MusicalScaleContract {
    override fun invoke(pitchInHz: Float): Pair<MusicalScaleType, Float> {
        return if(pitchInHz >= 127.666f && pitchInHz < 135.258f) {
            MusicalScaleType.C3 to (pitchInHz - 131.407f)
        }
        else if(pitchInHz >= 135.258f && pitchInHz < 143.301f) {
            MusicalScaleType.Cs3 to (pitchInHz - 139.221f)
        }
        else if(pitchInHz >= 143.301 && pitchInHz < 151.822) {
            MusicalScaleType.D3 to (pitchInHz - 147.500f)
        }
        else if(pitchInHz >= 151.822 && pitchInHz < 160.850) {
            MusicalScaleType.Ds3  to (pitchInHz - 156.271f)
        }
        else if(pitchInHz >= 160.850 && pitchInHz < 170.414) {
            MusicalScaleType.E3  to (pitchInHz - 165.563f)
        }
        else if(pitchInHz >= 170.414 && pitchInHz < 180.548) {
            MusicalScaleType.F3 to (pitchInHz - 175.408f)
        }
        else if(pitchInHz >= 180.548 && pitchInHz < 191.284) {
            MusicalScaleType.Fs3 to (pitchInHz - 185.838f)
        }
        else if(pitchInHz >= 191.284 && pitchInHz < 202.658) {
            MusicalScaleType.G3 to (pitchInHz - 196.889f)
        }
        else if(pitchInHz >= 202.658 && pitchInHz < 214.709) {
            MusicalScaleType.Gs3 to (pitchInHz - 208.596f)
        }
        else if(pitchInHz >= 214.709 && pitchInHz < 227.476) {
            MusicalScaleType.A3 to (pitchInHz - 221.000f)
        }
        else if(pitchInHz >= 227.476 && pitchInHz < 241.002) {
            MusicalScaleType.As3 to (pitchInHz - 234.141f)
        }
        else if(pitchInHz >= 241.002 && pitchInHz < 255.333) {
            MusicalScaleType.B3 to (pitchInHz - 248.064f)
        }
        else if(pitchInHz >= 255.333 && pitchInHz < 270.516) {
            MusicalScaleType.C4 to (pitchInHz - 262.815f)
        }
        else if(pitchInHz >= 270.516 && pitchInHz < 286.602) {
            MusicalScaleType.Cs4 to (pitchInHz - 278.443f)
        }
        else if(pitchInHz >= 286.602 && pitchInHz < 303.644) {
            MusicalScaleType.D4 to (pitchInHz - 295.000f)
        }
        else if(pitchInHz >= 303.644 && pitchInHz < 321.699) {
            MusicalScaleType.Ds4 to (pitchInHz - 312.541f)
        }
        else if(pitchInHz >= 321.699 && pitchInHz < 340.829) {
            MusicalScaleType.E4 to (pitchInHz - 331.126f)
        }
        else if(pitchInHz >= 340.829 && pitchInHz < 361.095) {
            MusicalScaleType.F4 to (pitchInHz - 350.816f)
        }
        else if(pitchInHz >= 361.095 && pitchInHz < 382.567) {
            MusicalScaleType.Fs4 to (pitchInHz - 371.676f)
        }
        else if(pitchInHz >= 382.567 && pitchInHz < 405.316) {
            MusicalScaleType.G4 to (pitchInHz - 393.777f)
        }
        else if(pitchInHz >= 405.316 && pitchInHz < 429.417) {
            MusicalScaleType.Gs4 to (pitchInHz - 417.192f)
        }
        else if(pitchInHz >= 429.417 && pitchInHz < 454.952) {
            MusicalScaleType.A4 to (pitchInHz - 442.000f)
        }
        else if(pitchInHz >= 454.952 && pitchInHz < 482.004) {
            MusicalScaleType.As4 to (pitchInHz - 468.283f)
        }
        else if(pitchInHz >= 482.004 && pitchInHz < 510.666) {
            MusicalScaleType.B4 to (pitchInHz - 496.128f)
        }
        else if(pitchInHz >= 510.666 && pitchInHz < 541.032) {
            MusicalScaleType.C5 to (pitchInHz - 525.630f)
        }
        else if(pitchInHz >= 541.032 && pitchInHz < 573.203) {
            MusicalScaleType.Cs5 to (pitchInHz - 556.885f)
        }
        else if(pitchInHz >= 573.203 && pitchInHz < 607.288) {
            MusicalScaleType.D5 to (pitchInHz - 589.999f)
        }
        else if(pitchInHz >= 607.288 && pitchInHz < 643.399) {
            MusicalScaleType.Ds5 to (pitchInHz - 625.082f)
        }
        else if(pitchInHz >= 643.399 && pitchInHz < 681.657) {
            MusicalScaleType.E5 to (pitchInHz - 662.252f)
        }
        else if(pitchInHz >= 681.657 && pitchInHz < 722.191) {
            MusicalScaleType.F5 to (pitchInHz - 701.631f)
        } else {
            MusicalScaleType.UNKNOWN to (0.0f)
        }
    }
}