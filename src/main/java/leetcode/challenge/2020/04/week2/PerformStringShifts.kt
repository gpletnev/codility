package leetcode.challenge.`2020`.`04`.week2

object PerformStringShifts {
    fun stringShift(s: String, shift: Array<IntArray>): String {

        var final = shift.fold(0, { finalShift, it ->
            val direction = it[0]
            val amount = it[1]
            finalShift.plus(when (direction) {
                0 -> -amount
                1 -> amount
                else -> 0
            })
        })
        final %= s.length
        return if (final == 0 || final == s.length) s else {
            if (final > 0)
                s.substring(s.length - final) + s.substring(0, s.length - final)
            else
                s.substring(-final) + s.substring(0, -final)
        }
    }
}