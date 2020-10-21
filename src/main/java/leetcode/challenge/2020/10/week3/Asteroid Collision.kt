package leetcode.challenge.`2020`.`10`.week3

import java.util.*

// https://leetcode.com/problems/asteroid-collision/
fun asteroidCollision(asteroids: IntArray): IntArray {
    val s = LinkedList<Int>()
    var i = 0
    while (i < asteroids.size) {
        if (asteroids[i] > 0 || s.isEmpty() || s.last < 0)
            s.add(asteroids[i])
        else if (-asteroids[i] >= s.last && -asteroids[i] > s.pollLast())
            i--
        i++
    }

    return s.toIntArray()
}