package leetcode.medium


// https://leetcode.com/problems/permutations/
fun permute(nums: IntArray): List<List<Int>> {
    val permutations = mutableListOf<List<Int>>()
    backtrack(permutations, mutableListOf(), nums)
    return permutations
}

private fun backtrack(list: MutableList<List<Int>>, tempList: MutableList<Int>, nums: IntArray) {
    if (tempList.size == nums.size) {
        list.add(tempList.toList())
    } else {
        for (i in nums.indices) {
            if (tempList.contains(nums[i])) continue  // element already exists, skip
            tempList.add(nums[i])
            backtrack(list, tempList, nums)
            tempList.removeAt(tempList.size - 1)
        }
    }
}