package leetcode.medium

import java.util.*

// https://leetcode.com/problems/product-of-the-last-k-numbers/
class ProductOfNumbers {
    private val products = ArrayList<Int>(1)

    init {
        products.add(1)
    }

    fun add(num: Int) {
        if (num > 0) {
            products.add(products.last() * num)
        } else {
            products.clear()
            products.add(1)
        }
    }

    fun getProduct(k: Int): Int {
        return if (k < products.size) products.last() / products[products.lastIndex - k] else 0
    }
}
