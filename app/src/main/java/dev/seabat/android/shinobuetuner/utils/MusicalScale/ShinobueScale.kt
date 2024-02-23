package dev.seabat.android.shinobuetuner.utils.MusicalScale

import android.util.Log
import kotlin.math.roundToInt

class ShinobueScale : MusicalScaleContract {
    override fun invoke(pitchInHz: Float): Pair<ShinobueScaleType, Int> {
        // ド3
        return if (pitchInHz >= ShinobueScaleType.C3.startHz && pitchInHz < ShinobueScaleType.C3.endHz) {
            ShinobueScaleType.C3 to calcDiffRate(pitchInHz, ShinobueScaleType.C3)
        }
        else if (pitchInHz >= ShinobueScaleType.Cs3.startHz && pitchInHz < ShinobueScaleType.Cs3.endHz) {
            ShinobueScaleType.Cs3 to calcDiffRate(pitchInHz, ShinobueScaleType.Cs3)
        }
        else if(pitchInHz >= ShinobueScaleType.D3.startHz && pitchInHz < ShinobueScaleType.D3.endHz) {
            ShinobueScaleType.D3 to calcDiffRate(pitchInHz, ShinobueScaleType.D3)
        }
        else if(pitchInHz >= ShinobueScaleType.Ds3.startHz && pitchInHz < ShinobueScaleType.Ds3.endHz) {
            ShinobueScaleType.Ds3 to calcDiffRate(pitchInHz, ShinobueScaleType.Ds3)
        }
        else if(pitchInHz >= ShinobueScaleType.E3.startHz && pitchInHz < ShinobueScaleType.E3.endHz) {
            ShinobueScaleType.E3 to calcDiffRate(pitchInHz, ShinobueScaleType.E3)
        }
        else if(pitchInHz >= ShinobueScaleType.F3.startHz && pitchInHz < ShinobueScaleType.F3.endHz) {
            ShinobueScaleType.F3 to calcDiffRate(pitchInHz, ShinobueScaleType.F3)
        }
        else if(pitchInHz >= ShinobueScaleType.Fs3.startHz && pitchInHz < ShinobueScaleType.Fs3.endHz) {
            ShinobueScaleType.Fs3 to calcDiffRate(pitchInHz, ShinobueScaleType.Fs3)
        }
        else if(pitchInHz >= ShinobueScaleType.G3.startHz && pitchInHz < ShinobueScaleType.G3.endHz) {
            ShinobueScaleType.G3 to calcDiffRate(pitchInHz, ShinobueScaleType.G3)
        }
        else if(pitchInHz >= ShinobueScaleType.Gs3.startHz && pitchInHz < ShinobueScaleType.Gs3.endHz) {
            ShinobueScaleType.Gs3 to calcDiffRate(pitchInHz, ShinobueScaleType.Gs3)
        }
        else if(pitchInHz >= ShinobueScaleType.A3.startHz && pitchInHz < ShinobueScaleType.A3.endHz) {
            ShinobueScaleType.A3 to calcDiffRate(pitchInHz, ShinobueScaleType.A3)
        }
        else if(pitchInHz >= ShinobueScaleType.As3.startHz && pitchInHz < ShinobueScaleType.As3.endHz) {
            ShinobueScaleType.As3 to calcDiffRate(pitchInHz, ShinobueScaleType.As3)
        }
        else if(pitchInHz >= ShinobueScaleType.B3.startHz && pitchInHz < ShinobueScaleType.B3.endHz) {
            ShinobueScaleType.B3 to calcDiffRate(pitchInHz, ShinobueScaleType.B3)
        }

        // ド4
        else if(pitchInHz >= ShinobueScaleType.C4.startHz && pitchInHz < ShinobueScaleType.C4.endHz) {
            ShinobueScaleType.C4 to calcDiffRate(pitchInHz, ShinobueScaleType.C4)
        }
        else if(pitchInHz >= ShinobueScaleType.Cs4.startHz && pitchInHz < ShinobueScaleType.Cs4.endHz) {
            ShinobueScaleType.Cs4 to calcDiffRate(pitchInHz, ShinobueScaleType.Cs4)
        }
        else if(pitchInHz >= ShinobueScaleType.D4.startHz && pitchInHz < ShinobueScaleType.D4.endHz) {
            ShinobueScaleType.D4 to calcDiffRate(pitchInHz, ShinobueScaleType.D4)
        }
        else if(pitchInHz >= ShinobueScaleType.Ds4.startHz && pitchInHz < ShinobueScaleType.Ds4.endHz) {
            ShinobueScaleType.Ds4 to calcDiffRate(pitchInHz, ShinobueScaleType.Ds4)
        }
        else if(pitchInHz >= ShinobueScaleType.E4.startHz && pitchInHz < ShinobueScaleType.E4.endHz) {
            ShinobueScaleType.E4 to calcDiffRate(pitchInHz, ShinobueScaleType.E4)
        }
        else if(pitchInHz >= ShinobueScaleType.F4.startHz && pitchInHz < ShinobueScaleType.F4.endHz) {
            ShinobueScaleType.F4 to calcDiffRate(pitchInHz, ShinobueScaleType.F4)
        }
        else if(pitchInHz >= ShinobueScaleType.Fs4.startHz && pitchInHz < ShinobueScaleType.Fs4.endHz) {
            ShinobueScaleType.Fs4 to calcDiffRate(pitchInHz, ShinobueScaleType.Fs4)
        }
        else if(pitchInHz >= ShinobueScaleType.G4.startHz && pitchInHz < ShinobueScaleType.G4.endHz) {
            ShinobueScaleType.G4 to calcDiffRate(pitchInHz, ShinobueScaleType.G4)
        }
        else if(pitchInHz >= ShinobueScaleType.Gs4.startHz && pitchInHz < ShinobueScaleType.Gs4.endHz) {
            ShinobueScaleType.Gs4 to calcDiffRate(pitchInHz, ShinobueScaleType.Gs4)
        }
        else if(pitchInHz >= ShinobueScaleType.A4.startHz && pitchInHz < ShinobueScaleType.A4.endHz) {
            ShinobueScaleType.A4 to calcDiffRate(pitchInHz, ShinobueScaleType.A4)
        }
        else if(pitchInHz >= ShinobueScaleType.As4.startHz && pitchInHz < ShinobueScaleType.As4.endHz) {
            ShinobueScaleType.As4 to calcDiffRate(pitchInHz, ShinobueScaleType.As4)
        }
        else if(pitchInHz >= ShinobueScaleType.B4.startHz && pitchInHz < ShinobueScaleType.B4.endHz) {
            ShinobueScaleType.B4 to calcDiffRate(pitchInHz, ShinobueScaleType.B4)
        }

        // ド5
        else if(pitchInHz >= ShinobueScaleType.C5.startHz && pitchInHz < ShinobueScaleType.C5.endHz) {
            ShinobueScaleType.C5 to calcDiffRate(pitchInHz, ShinobueScaleType.C5)
        }
        else if(pitchInHz >= ShinobueScaleType.Cs5.startHz && pitchInHz < ShinobueScaleType.Cs5.endHz) {
            ShinobueScaleType.Cs5 to calcDiffRate(pitchInHz, ShinobueScaleType.Cs5)
        }
        else if(pitchInHz >= ShinobueScaleType.D5.startHz && pitchInHz < ShinobueScaleType.D5.endHz) {
            ShinobueScaleType.D5 to calcDiffRate(pitchInHz, ShinobueScaleType.D5)
        }
        else if(pitchInHz >= ShinobueScaleType.Ds5.startHz && pitchInHz < ShinobueScaleType.Ds5.endHz) {
            ShinobueScaleType.Ds5 to calcDiffRate(pitchInHz, ShinobueScaleType.Ds5)
        }
        else if(pitchInHz >= ShinobueScaleType.E5.startHz && pitchInHz < ShinobueScaleType.E5.endHz) {
            ShinobueScaleType.E5 to calcDiffRate(pitchInHz, ShinobueScaleType.E5)
        }
        else if(pitchInHz >= ShinobueScaleType.F5.startHz && pitchInHz < ShinobueScaleType.F5.endHz) {
            ShinobueScaleType.F5 to calcDiffRate(pitchInHz, ShinobueScaleType.F5)
        }
        else if(pitchInHz >= ShinobueScaleType.Fs5.startHz && pitchInHz < ShinobueScaleType.Fs5.endHz) {
            ShinobueScaleType.Fs5 to calcDiffRate(pitchInHz, ShinobueScaleType.Fs5)
        }
        else if(pitchInHz >= ShinobueScaleType.G5.startHz && pitchInHz < ShinobueScaleType.G5.endHz) {
            ShinobueScaleType.G5 to calcDiffRate(pitchInHz, ShinobueScaleType.G5)
        }
        else if(pitchInHz >= ShinobueScaleType.Gs5.startHz && pitchInHz < ShinobueScaleType.Gs5.endHz) {
            ShinobueScaleType.Gs5 to calcDiffRate(pitchInHz, ShinobueScaleType.Gs5)
        }
        else if(pitchInHz >= ShinobueScaleType.A5.startHz && pitchInHz < ShinobueScaleType.A5.endHz) {
            ShinobueScaleType.A5 to calcDiffRate(pitchInHz, ShinobueScaleType.A5)
        }
        else if(pitchInHz >= ShinobueScaleType.As5.startHz && pitchInHz < ShinobueScaleType.As5.endHz) {
            ShinobueScaleType.As5 to calcDiffRate(pitchInHz, ShinobueScaleType.As5)
        }
        else if(pitchInHz >= ShinobueScaleType.B5.startHz && pitchInHz < ShinobueScaleType.B5.endHz) {
            ShinobueScaleType.B5 to calcDiffRate(pitchInHz, ShinobueScaleType.B5)
        }

        // ド6
        else if(pitchInHz >= ShinobueScaleType.C6.startHz && pitchInHz < ShinobueScaleType.C6.endHz) {
            ShinobueScaleType.C6 to calcDiffRate(pitchInHz, ShinobueScaleType.C6)
        }
        else if(pitchInHz >= ShinobueScaleType.Cs6.startHz && pitchInHz < ShinobueScaleType.Cs6.endHz) {
            ShinobueScaleType.Cs6 to calcDiffRate(pitchInHz, ShinobueScaleType.Cs6)
        }
        else if(pitchInHz >= ShinobueScaleType.D6.startHz && pitchInHz < ShinobueScaleType.D6.endHz) {
            ShinobueScaleType.D6 to calcDiffRate(pitchInHz, ShinobueScaleType.D6)
        }
        else if(pitchInHz >= ShinobueScaleType.Ds6.startHz && pitchInHz < ShinobueScaleType.Ds6.endHz) {
            ShinobueScaleType.Ds6 to calcDiffRate(pitchInHz, ShinobueScaleType.Ds6)
        }
        else if(pitchInHz >= ShinobueScaleType.E6.startHz && pitchInHz < ShinobueScaleType.E6.endHz) {
            ShinobueScaleType.E6 to calcDiffRate(pitchInHz, ShinobueScaleType.E6)
        }
        else if(pitchInHz >= ShinobueScaleType.F6.startHz && pitchInHz < ShinobueScaleType.F6.endHz) {
            ShinobueScaleType.F6 to calcDiffRate(pitchInHz, ShinobueScaleType.F6)
        }
        else if(pitchInHz >= ShinobueScaleType.Fs6.startHz && pitchInHz < ShinobueScaleType.Fs6.endHz) {
            ShinobueScaleType.Fs6 to calcDiffRate(pitchInHz, ShinobueScaleType.Fs6)
        }
        else if(pitchInHz >= ShinobueScaleType.G6.startHz && pitchInHz < ShinobueScaleType.G6.endHz) {
            ShinobueScaleType.G6 to calcDiffRate(pitchInHz, ShinobueScaleType.G6)
        }
        else if(pitchInHz >= ShinobueScaleType.Gs6.startHz && pitchInHz < ShinobueScaleType.Gs6.endHz) {
            ShinobueScaleType.Gs6 to calcDiffRate(pitchInHz, ShinobueScaleType.Gs6)
        }
        else if(pitchInHz >= ShinobueScaleType.A6.startHz && pitchInHz < ShinobueScaleType.A6.endHz) {
            ShinobueScaleType.A6 to calcDiffRate(pitchInHz, ShinobueScaleType.A6)
        }
        else if(pitchInHz >= ShinobueScaleType.As6.startHz && pitchInHz < ShinobueScaleType.As6.endHz) {
            ShinobueScaleType.As6 to calcDiffRate(pitchInHz, ShinobueScaleType.As6)
        }
        else if(pitchInHz >= ShinobueScaleType.B6.startHz && pitchInHz < ShinobueScaleType.B6.endHz) {
            ShinobueScaleType.B6 to calcDiffRate(pitchInHz, ShinobueScaleType.B6)
        }

        // ド7
        else if(pitchInHz >= ShinobueScaleType.C7.startHz && pitchInHz < ShinobueScaleType.C7.endHz) {
            ShinobueScaleType.C7 to calcDiffRate(pitchInHz, ShinobueScaleType.C7)
        }
        else if(pitchInHz >= ShinobueScaleType.Cs7.startHz && pitchInHz < ShinobueScaleType.Cs7.endHz) {
            ShinobueScaleType.Cs7 to calcDiffRate(pitchInHz, ShinobueScaleType.Cs7)
        }
        else if(pitchInHz >= ShinobueScaleType.D7.startHz && pitchInHz < ShinobueScaleType.D7.endHz) {
            ShinobueScaleType.D7 to calcDiffRate(pitchInHz, ShinobueScaleType.D7)
        }
        else if(pitchInHz >= ShinobueScaleType.Ds7.startHz && pitchInHz < ShinobueScaleType.Ds7.endHz) {
            ShinobueScaleType.Ds7 to calcDiffRate(pitchInHz, ShinobueScaleType.Ds7)
        }
        else if(pitchInHz >= ShinobueScaleType.E7.startHz && pitchInHz < ShinobueScaleType.E7.endHz) {
            ShinobueScaleType.E7 to calcDiffRate(pitchInHz, ShinobueScaleType.E7)

        } else {
            ShinobueScaleType.UNKNOWN to 0
        }
    }

    /**
     * 音階 Hz と実際の Hz との差分の100分率を求める
     */
    private fun calcDiffRate(hz: Float, scaleType: ShinobueScaleType): Int {
        val maxDiff = (scaleType.endHz - scaleType.startHz)/2
        val diff = hz -scaleType.hz

        // 差分の割合
        val diffRate = diff/maxDiff * 100

        // 四捨五入する
        val round = diffRate.roundToInt()

        Log.d("shinobue", "diff=$diff diffRate=$diffRate")
        return round
    }
}