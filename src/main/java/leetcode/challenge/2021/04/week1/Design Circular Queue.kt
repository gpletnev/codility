package leetcode.challenge.`2021`.`04`.week1

// https://leetcode.com/problems/design-circular-queue/
internal class MyCircularQueue(k: Int) {
    private val items = arrayOfNulls<Int>(k)
    private var head = 0
    private var tail = 0

    fun enQueue(value: Int): Boolean = if (isFull()) {
        false
    } else {
        items[tail] = value
        tail = (tail + 1) % items.size
        true
    }

    fun deQueue(): Boolean = if (isEmpty()) {
        false
    } else {
        items[head] = null
        head = (head + 1) % items.size
        true
    }

    fun Front(): Int = if (isEmpty()) NULL else items[head] as Int

    fun Rear(): Int = if (isEmpty()) {
        NULL
    } else {
        val rear = if (tail == 0) items.lastIndex else tail - 1
        items[rear] as Int
    }

    fun isEmpty(): Boolean = tail == head && items[tail] == null

    fun isFull(): Boolean = items[tail] != null

    private companion object {
        const val NULL = -1
    }
}
