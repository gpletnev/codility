package codility.interviews.tinkoff.edu

fun main() {
    val n = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map { it.toInt() }.toIntArray()
    println(task4(nums).joinToString(" "))

}

fun task4(nums: IntArray): List<Int> {
    val n = nums.size
    val list = mutableListOf(-1, -1)

    val sum = nums.sum()
    val correctSum = (1 + n) * n / 2

    if (sum == correctSum) {
        if (nums.size == 2) return list
        for (i in nums.indices) {
            if (nums[i] == i + 1) return list
        }
    }
    val distinctSum = nums.distinct().sum()
    val num = sum - distinctSum

    val missing = correctSum - distinctSum

    val firstI = nums.indexOf(num)
    val lastI = nums.indexOfLast { it == num }

    if (nums[firstI] == firstI + 1) {
        return listOf(firstI + 1, missing)
    }
    if (nums[lastI] == lastI + 1) {
        return listOf(lastI + 1, missing)
    }
    return list
}