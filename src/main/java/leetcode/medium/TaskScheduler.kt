package leetcode.medium

// https://leetcode.com/problems/task-scheduler/
fun leastInterval(tasks: CharArray, n: Int): Int {
    val count = CharArray(26)
    var maxn = 0
    for (task in tasks) {
        count[task - 'A']++
        maxn = maxOf(maxn, count[task - 'A'].code)
    }
    var ans = (maxn - 1) * (n + 1)
    for (i in 0..25) if (count[i].code == maxn) ans++
    return maxOf(ans, tasks.size)
}