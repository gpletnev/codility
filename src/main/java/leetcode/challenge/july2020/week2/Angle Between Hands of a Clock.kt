package leetcode.challenge.july2020.week2

// https://leetcode.com/problems/angle-between-hands-of-a-clock/
fun angleClock(hour: Int, minutes: Int): Double {
    val oneMinute = 6.0 // 360 / 60
    val oneHour = 30.0 // 360 / 12  degrees in one hour for hour hand
    val minuteAngle = if (minutes != 0) minutes * oneMinute else 0.0
    val hourOffset = oneHour * minuteAngle / 360.0
    val hourAngle = hour % 12 * oneHour + hourOffset
    val result = if (minuteAngle > hourAngle) minuteAngle - hourAngle else hourAngle - minuteAngle

    return if (result > 180) 360 - result else result
}