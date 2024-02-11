package dev.seabat.android.shinobuetuner.utils.MusicalScale

class ShinobueScale : MusicalScaleContract {
    override fun invoke(pitchInHz: Float): MusicalScaleType {
        return if(pitchInHz >= 127.666 && pitchInHz < 135.258) {
            MusicalScaleType.C3
        }
        else if(pitchInHz >= 135.258 && pitchInHz < 143.301) {
            MusicalScaleType.Cs3
        }
        else if(pitchInHz >= 143.301 && pitchInHz < 151.822) {
            MusicalScaleType.D3
        }
        else if(pitchInHz >= 151.822 && pitchInHz < 160.850) {
            MusicalScaleType.Ds3
        }
        else if(pitchInHz >= 160.850 && pitchInHz < 170.414) {
            MusicalScaleType.E3
        }
        else if(pitchInHz >= 170.414 && pitchInHz < 180.548) {
            MusicalScaleType.F3
        }
        else if(pitchInHz >= 180.548 && pitchInHz < 191.284) {
            MusicalScaleType.Fs3
        }
        else if(pitchInHz >= 191.284 && pitchInHz < 202.658) {
            MusicalScaleType.G3
        }
        else if(pitchInHz >= 202.658 && pitchInHz < 214.709) {
            MusicalScaleType.Gs3
        }
        else if(pitchInHz >= 214.709 && pitchInHz < 227.476) {
            MusicalScaleType.A3
        }
        else if(pitchInHz >= 227.476 && pitchInHz < 241.002) {
            MusicalScaleType.As3
        }
        else if(pitchInHz >= 241.002 && pitchInHz < 255.333) {
            MusicalScaleType.B3
        }
        else if(pitchInHz >= 255.333 && pitchInHz < 270.516) {
            MusicalScaleType.C4
        }
        else if(pitchInHz >= 270.516 && pitchInHz < 286.602) {
            MusicalScaleType.Cs4
        }
        else if(pitchInHz >= 286.602 && pitchInHz < 303.644) {
            MusicalScaleType.D4
        }
        else if(pitchInHz >= 303.644 && pitchInHz < 321.699) {
            MusicalScaleType.Ds4
        }
        else if(pitchInHz >= 321.699 && pitchInHz < 340.829) {
            MusicalScaleType.E4
        }
        else if(pitchInHz >= 340.829 && pitchInHz < 361.095) {
            MusicalScaleType.F4
        }
        else if(pitchInHz >= 361.095 && pitchInHz < 382.567) {
            MusicalScaleType.Fs4
        }
        else if(pitchInHz >= 382.567 && pitchInHz < 405.316) {
            MusicalScaleType.G4
        }
        else if(pitchInHz >= 405.316 && pitchInHz < 429.417) {
            MusicalScaleType.Gs4
        }
        else if(pitchInHz >= 429.417 && pitchInHz < 454.952) {
            MusicalScaleType.A4
        }
        else if(pitchInHz >= 454.952 && pitchInHz < 482.004) {
            MusicalScaleType.As4
        }
        else if(pitchInHz >= 482.004 && pitchInHz < 510.666) {
            MusicalScaleType.B4
        }
        else if(pitchInHz >= 510.666 && pitchInHz < 541.032) {
            MusicalScaleType.C5
        }
        else if(pitchInHz >= 541.032 && pitchInHz < 573.203) {
            MusicalScaleType.Cs5
        }
        else if(pitchInHz >= 573.203 && pitchInHz < 607.288) {
            MusicalScaleType.D5
        }
        else if(pitchInHz >= 607.288 && pitchInHz < 643.399) {
            MusicalScaleType.Ds5
        }
        else if(pitchInHz >= 643.399 && pitchInHz < 681.657) {
            MusicalScaleType.E5
        }
        else if(pitchInHz >= 681.657 && pitchInHz < 722.191) {
            MusicalScaleType.F5
        } else {
            MusicalScaleType.UNKNOWN
        }
    }
}