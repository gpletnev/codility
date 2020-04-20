package leetcode.challenge.week3

// https://leetcode.com/problems/construct-binary-search-tree-from-preorder-traversal/
object ConstructBinarySearchTreeFromPreorderTraversal {
    var i = 0
    fun bstFromPreorder(A: IntArray): TreeNode? {
        return bstFromPreorder(A, Int.MAX_VALUE)
    }

    fun bstFromPreorder(A: IntArray, bound: Int): TreeNode? {
        if (i == A.size || A[i] > bound) return null
        val root = TreeNode(A[i++])
        root.left = bstFromPreorder(A, root.`val`)
        root.right = bstFromPreorder(A, bound)
        return root
    }

/*    fun bstFromPreorder(A: IntArray): TreeNode? {
        if (A.isEmpty()) {
            return null
        }
        val stack = Stack<TreeNode>()
        val root = TreeNode(A[0])
        stack.push(root)
        for (i in 1..A.lastIndex) {
            val node = TreeNode(A[i])
            if (A[i] < stack.peek().`val`) {
                stack.peek().left = node
            } else {
                var parent = stack.peek()
                while (!stack.isEmpty() && A[i] > stack.peek().`val`) {
                    parent = stack.pop()
                }
                parent.right = node
            }
            stack.push(node)
        }
        return root
    }*/
}

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}