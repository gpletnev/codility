package leetcode.challenge.`2020`.`10`.week1

// https://leetcode.com/problems/number-of-recent-calls/
class RecentCounter {
    private var requests = mutableListOf<Int>()
    private val timeInterval = 3000

    fun ping(t: Int): Int {
        requests.add(t)
        val listIterator = requests.listIterator()
        while (listIterator.hasNext()) {
            if (listIterator.next() < t - timeInterval) listIterator.remove() else break
        }
        return requests.size
    }
}