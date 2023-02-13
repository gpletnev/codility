package leetcode.medium

// https://leetcode.com/problems/bulls-and-cows/
fun getHint(secret: String, guess: String): String {
    var bulls = 0
    var cows = 0
    val nums = IntArray(10)
    for (i in secret.indices) {
        val numsSecret: Int = secret[i] - '0'
        val numsGuess: Int = guess[i] - '0'
        if (numsSecret == numsGuess) {
            bulls++
        } else {
            if (nums[numsGuess] < 0) {
                cows++
            }
            if (nums[numsSecret] > 0) {
                cows++
            }
            nums[numsGuess]++
            nums[numsSecret]--
        }
    }
    return "${bulls}A${cows}B"
}