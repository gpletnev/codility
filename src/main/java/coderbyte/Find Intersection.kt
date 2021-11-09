package coderbyte

// https://coderbyte.com/solution/Find%20Intersection
fun FindIntersection(strArr: Array<String>): String {

    val map = mutableMapOf<String, Int>()

    strArr.forEach {
        for (str in it.split(", ")) {
            map[str] = map.getOrDefault(str, 0) + 1
        }
    }

    return map.filter { it.value == 2 }.keys.joinToString(",")

}

fun main() {
    println(FindIntersection(arrayOf("1, 3, 4, 7, 13", "1, 2, 4, 13, 15")))
}