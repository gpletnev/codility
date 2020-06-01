package leetcode.challenge.may2020.week4

object CountingBits {
    fun countBits(num: Int): IntArray {
        val bits = IntArray(num + 1)
        //var mask = 1
        for (i in 1..num) {
            bits[i] = bits[i shr 1] + (i and 1)
/*            if (mask.shl(1) == i)
                mask = mask.shl(1)
            bits[i] = bits[i.xor(mask)] + 1*/
        }
        return bits
    }
}