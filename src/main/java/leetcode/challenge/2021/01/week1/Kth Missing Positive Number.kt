package leetcode.challenge.`2021`.`01`.week1

// https://leetcode.com/problems/kth-missing-positive-number/
fun findKthPositive(arr: IntArray, k: Int): Int {
    var low = 0
    var high = arr.size

    while (low < high) {
        val mid = low + (high - low) / 2

        // The number of positive integers which are missing
        // before the arr[idx] is equal to arr[idx] - idx - 1.
        if (arr[mid] - mid - 1 >= k)
            high = mid
        else
            low = mid + 1
    }

    return low + k
}