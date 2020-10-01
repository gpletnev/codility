package leetcode.easy.array

object ArrayQuickSort {

    fun quickSort(array: IntArray, left: Int = 0, right: Int = array.lastIndex) {
        val splitPoint = partition(array, left, right)
        if (left < splitPoint - 1) { // Sorting left part
            quickSort(array, left, splitPoint - 1)
        }
        if (splitPoint < right) { // Sorting right part
            quickSort(array, splitPoint, right)
        }
    }

    private fun partition(array: IntArray, first: Int, last: Int): Int {
        var left = first
        var right = last
        val pivot = array[(left + right) / 2] // Pivot Point
        while (left <= right) {
            while (array[left] < pivot) left++ // Find the elements on left that should be on right

            while (array[right] > pivot) right-- // Find the elements on right that should be on left

            // Swap elements, and move left and right indices
            if (left <= right) {
                if (left != right) array[left] = array[right].also { array[right] = array[left] }
                left++
                right--
            }
        }
        return left
    }
}