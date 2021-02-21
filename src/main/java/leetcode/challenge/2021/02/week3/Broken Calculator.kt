package leetcode.challenge.`2021`.`02`.week3

// https://leetcode.com/problems/broken-calculator/
fun brokenCalc(X: Int, Y: Int): Int {
    var _Y = Y
    var ans = 0
    while (_Y > X) {
        ans++
        if (_Y % 2 == 1) _Y++ else _Y /= 2
    }
    return ans + X - _Y
}