package leetcode.challenge.`2020`.`12`.week4

// https://leetcode.com/problems/jump-game-iv/
fun minJumps(arr: IntArray): Int {
    var res = 0
    val n: Int = arr.size
    if (n == 1) {
        return 0
    }

    val visited = BooleanArray(n)
    val map: MutableMap<Int, MutableList<Int>> = HashMap()
    for (i in 0 until n) {
        map.putIfAbsent(arr[i], ArrayList())
        map[arr[i]]!!.add(i)
    }
    var head: MutableSet<Int> = HashSet()
    var tail: MutableSet<Int> = HashSet()
    head.add(0)
    tail.add(n - 1)
    visited[0] = true
    visited[n - 1] = true
    while (head.size > 0 && tail.size > 0) {
        if (head.size > tail.size) {
            val temp = tail
            tail = head
            head = temp
        }
        val next: MutableSet<Int> = HashSet()
        for (i in head) {
            val x = i + 1
            val y = i - 1
            if (tail.contains(x) || tail.contains(y)) {
                return res + 1
            }
            if (x < n && !visited[x]) {
                visited[x] = true
                next.add(x)
            }
            if (y >= 0 && !visited[y]) {
                visited[y] = true
                next.add(y)
            }
            for (z in map[arr[i]]!!) {
                if (z == i) {
                    continue
                }
                if (tail.contains(z)) {
                    return res + 1
                }
                if (!visited[z]) {
                    visited[z] = true
                    next.add(z)
                }
            }
        }
        head = next
        res++
    }
    return -1
}