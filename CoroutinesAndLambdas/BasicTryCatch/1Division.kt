fun divideNumbers(a: Int, b: Int): String {
    return try {
        (a / b).toString()
    } catch (e: ArithmeticException) {
        "Error: Division by zero"
    }
}
fun main() {
    println(divideNumbers(4, 2))
    println(divideNumbers(4, 0))
}
