package leetcode.challenge.`2020`.`11`.week5

// https://leetcode.com/problems/jump-game-iii/
/*
fun canReach(arr: IntArray, start: Int): Boolean {
    val q: Queue<Int> = LinkedList()
    q.add(start)

    while (!q.isEmpty()) {
        val node = q.poll()
        // check if reach zero
        if (arr[node] == 0) {
            return true
        }
        if (arr[node] < 0) {
            continue
        }

        // check available next steps
        if (node + arr[node] < arr.size) {
            q.offer(node + arr[node])
        }
        if (node - arr[node] >= 0) {
            q.offer(node - arr[node])
        }
        // mark as visited
        arr[node] = -arr[node]
    }
    return false
}*/

fun canReach(arr: IntArray, start: Int): Boolean {
    val num = arr[start]
    if (num == 0) {
        return true
    }
    if (num < 0) {
        return false
    }

    arr[start] = -num

    val left = start - num
    val right = start + num

    return (left >= 0 && canReach(arr, left)) || (right < arr.size && canReach(arr, right))
}