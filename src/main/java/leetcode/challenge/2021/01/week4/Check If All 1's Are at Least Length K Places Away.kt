package leetcode.challenge.`2021`.`01`.week4

// https://leetcode.com/problems/check-if-all-1s-are-at-least-length-k-places-away/
fun kLengthApart(nums: IntArray, k: Int): Boolean {
    // initialize the counter of zeros to k
    // to pass the first 1 in nums
    var count = k
    for (num in nums) {
        // if the current integer is 1
        if (num == 1) {
            // check that number of zeros in-between 1s
            // is greater than or equal to k
            if (count < k) {
                return false
            }
            // reinitialize counter
            count = 0

            // if the current integer is 0
        } else {
            // increase the counter
            ++count
        }
    }
    return true
}