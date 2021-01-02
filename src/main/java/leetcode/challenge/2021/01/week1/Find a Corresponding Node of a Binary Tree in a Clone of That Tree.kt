package leetcode.challenge.`2021`.`01`.week1

import leetcode.TreeNode

fun getTargetCopy(original: TreeNode?, cloned: TreeNode?, target: TreeNode): TreeNode? {
    if (original == null || original === target) return cloned!!
    return getTargetCopy(original.left, cloned!!.left, target) ?: getTargetCopy(original.right, cloned.right, target)
}