package leetcode.challenge.`2020`.`11`.week4

// https://leetcode.com/problems/basic-calculator-ii/
fun calculate(s: String): Int {
    if (s.isEmpty()) return 0

    var currentNumber = 0
    var lastNumber = 0
    var result = 0
    var operation = '+'

    val iterator = s.iterator()
    while (iterator.hasNext()) {
        val currentChar = iterator.nextChar()
        if (currentChar.isDigit()) {
            currentNumber = currentNumber * 10 + (currentChar - '0')
        }
        if (!currentChar.isDigit() && !currentChar.isWhitespace() || !iterator.hasNext()) {
            when (operation) {
                '+', '-' -> {
                    result += lastNumber
                    lastNumber = if (operation == '+') currentNumber else -currentNumber
                }
                '*' -> {
                    lastNumber *= currentNumber
                }
                '/' -> {
                    lastNumber /= currentNumber
                }
            }
            operation = currentChar
            currentNumber = 0
        }
    }
    result += lastNumber
    return result
}