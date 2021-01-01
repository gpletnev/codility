package leetcode.challenge.`2020`.`07`.week1

// https://leetcode.com/problems/plus-one/
object `Plus One` {
    /*    fun plusOne(digits: IntArray): IntArray {
            val list = digits.toMutableList()
            val iterator = list.listIterator(list.size)
            while (iterator.hasPrevious()) {
                val d = iterator.previous()
                if (d == 9) {
                    iterator.set(0)
                    if (!iterator.hasPrevious()) {
                        iterator.add(1)
                        break
                    }
                } else {
                    iterator.set(d + 1)
                    break
                }
            }
            return list.toIntArray()
        }*/
    fun plusOne(digits: IntArray): IntArray {
        for (i in digits.lastIndex downTo 0) {
            if (digits[i] != 9) {
                digits[i] = digits[i] + 1
                return digits
            }
            digits[i] = 0
        }
        val result = IntArray(digits.size + 1)
        result[0] = 1
        return result
    }
}