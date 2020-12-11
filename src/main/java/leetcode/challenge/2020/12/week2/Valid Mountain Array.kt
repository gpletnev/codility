package leetcode.challenge.`2020`.`12`.week2

// https://leetcode.com/problems/valid-mountain-array/
fun validMountainArray(arr: IntArray): Boolean {
        var i = 0

        // walk up
        while (i < arr.lastIndex && arr[i] < arr[i + 1]) i++

        // peak can't be first or last
        if (i == 0 || i == arr.lastIndex) return false

        // walk down
        while (i < arr.lastIndex && arr[i] > arr[i + 1]) i++

        return i == arr.lastIndex
}