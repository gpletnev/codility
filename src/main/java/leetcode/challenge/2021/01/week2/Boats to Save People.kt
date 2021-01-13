package leetcode.challenge.`2021`.`01`.week2

// https://leetcode.com/problems/boats-to-save-people/
fun numRescueBoats(people: IntArray, limit: Int): Int {
    var boats = 0
    people.sort()
    var i = 0
    var j = people.lastIndex
    while (i <= j) {

        if (people[i] + people[j] <= limit)
            i++
        j--
        boats++
    }
    return boats
}