package codility.interviews.tinkoff.edu


fun main() {
    val n = readLine()!!.toInt()
    val nums = readLine()!!.split(" ").map { it.toInt() }
    println(task3(nums).joinToString(" "))

}

fun task3(nums: List<Int>): List<Int> {
    val list = mutableListOf(-1, -1)
    for (i in nums.indices) {
        if (i % 2 == 0) {
            if (nums[i] % 2 == 0) {
                if (list[0] != -1) {
                    return listOf(-1, -1)
                } else {
                    list[0] = i + 1
                }
            }
        } else {
            if (nums[i] % 2 != 0) {
                if (list[1] != -1) {
                    return listOf(-1, -1)
                } else {
                    list[1] = i + 1
                }
            }
        }
    }
    return list
}