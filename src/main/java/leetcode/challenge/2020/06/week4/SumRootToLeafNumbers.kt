package leetcode.challenge.`2020`.`06`.week4

// https://leetcode.com/problems/sum-root-to-leaf-numbers/
object SumRootToLeafNumbers {
    var sum = 0
    fun sumNumbers(root: TreeNode?): Int {
        sum = 0
        if (root != null) {
            sumNumbers(root, "")
        }
        return sum
    }

    private fun sumNumbers(root: TreeNode?, number: String) {
        if (root != null) {
            val nextNumber = number.plus(root.`val`)

            if (root.left == null && root.right == null) {
                sum += nextNumber.toInt()
            } else {
                sumNumbers(root.left, nextNumber)
                sumNumbers(root.right, nextNumber)
            }
        }
    }
}