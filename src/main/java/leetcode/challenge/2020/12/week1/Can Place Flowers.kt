package leetcode.challenge.`2020`.`12`.week1

fun canPlaceFlowers(flowerbed: IntArray, n: Int): Boolean {
    var i = 0
    var count = 0
    while (i < flowerbed.size) {
        if (flowerbed[i] == 0 && (i == 0 || flowerbed[i - 1] == 0) && (i == flowerbed.lastIndex || flowerbed[i + 1] == 0)) {
            flowerbed[i++] = 1
            count++
        }
        if (count >= n) return true
        i++
    }
    return false
}