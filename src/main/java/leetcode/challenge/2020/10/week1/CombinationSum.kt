package leetcode.challenge.`2020`.`10`.week1

// https://leetcode.com/problems/combination-sum/
fun combinationSum(candidates: IntArray, target: Int): List<List<Int>> {
    val list: MutableList<List<Int>> = ArrayList()
    candidates.sort()

    backtrack(list, ArrayList(), candidates, target, 0)
    return list
}

private fun backtrack(list: MutableList<List<Int>>, tempList: MutableList<Int>, nums: IntArray, remain: Int, start: Int) {
    when {
        remain < 0 -> return
        remain == 0 -> list.add(ArrayList(tempList))
        else -> {
            for (i in start until nums.size) {
                tempList.add(nums[i])
                backtrack(list, tempList, nums, remain - nums[i], i)
                tempList.removeAt(tempList.size - 1)
            }
        }
    }
}