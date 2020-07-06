package leetcode.challenge.july2020.week1

// https://leetcode.com/problems/plus-one/
object `Plus One` {
    fun plusOne(digits: IntArray): IntArray {
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
    }
}