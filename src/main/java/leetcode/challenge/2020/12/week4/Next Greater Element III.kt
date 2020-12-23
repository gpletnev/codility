package leetcode.challenge.`2020`.`12`.week4

// https://leetcode.com/problems/next-greater-element-iii/
fun nextGreaterElement(n: Int): Int {
    val num = n.toString().toCharArray()
    var i = num.lastIndex
    while (i > 0 && num[i - 1] >= num[i]) {
        i--
    }
    if (i == 0) {
        return -1
    }
    var j = num.lastIndex
    while (j >= i) {
        if (num[j] > num[i - 1]) {
            break
        }
        j--
    }
    num[i - 1] = num[j].also { num[j] = num[i - 1] }
    num.sort(i, num.size)
    val result = String(num).toLong()
    return if (result > Int.MAX_VALUE) -1 else result.toInt()
}