package codility.lessons.lesson3

// https://app.codility.com/programmers/lessons/3-time_complexity/frog_jmp/
object FrogJmp {
    @JvmStatic
    fun solution(X: Int, Y: Int, D: Int): Int {
        val jumps = (Y - X) / D
        return if ((Y - X) % D != 0) jumps + 1 else jumps
    }
}