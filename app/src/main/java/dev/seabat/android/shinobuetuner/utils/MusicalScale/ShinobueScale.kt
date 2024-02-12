package dev.seabat.android.shinobuetuner.utils.MusicalScale

import android.util.Log
import kotlin.math.roundToInt

class ShinobueScale : MusicalScaleContract {
    override fun invoke(pitchInHz: Float): Pair<ShinobueScaleType, Int> {
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