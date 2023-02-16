package leetcode.challenge.`2020`.`04`.week1

// https://leetcode.com/problems/happy-number/
object HappyNumber {
    private fun getNext(n: Int): Int {
        var num = n
        var totalSum = 0
        while (num > 0) {
            val d = num % 10
            num /= 10
            totalSum += d * d
        }
        return totalSum
    }

    fun isHappy(n: Int): Boolean {
        var slow = n
        var fast = getNext(n)
        while (fast != 1 && slow != fast) {
            slow = getNext(slow)
            fast = getNext(getNext(fast))
        }
        return fast == 1
    }

/*   private val cycleMembers = hashSetOf(4, 16, 37, 58, 89, 145, 42, 20)
    fun isHappy(n: Int): Boolean {
        var n = n
        while (n != 1 && !cycleMembers.contains(n)) {
            n = getNext(n)
        }
        return n == 1
    }*/
}