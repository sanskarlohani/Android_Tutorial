

fun main() {
    val num = 198
    val numberOfDigits = num.toString().length
    var sum = 0
    var temp = num

    while (temp != 0) {
        val digit = temp % 10
        var power = 1
        for (i in 1..numberOfDigits) {
            power *= digit
        }
        sum += power
        temp /= 10
    }

    if (sum == num) {
        println("$num is an Armstrong")
    } else {
        println("$num is not an Armstrong")
    }
}
