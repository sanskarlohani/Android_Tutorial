fun main() {
    val n = 5 
    for (i in 0..n) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (k in 0 until (2 * i + 1)) {
            print("*")
        }
        println()
    }
    for (i in n - 1 downTo 0) {
        for (j in 0 until n - i) {
            print(" ")
        }
        for (k in 0 until (2 * i + 1)) {
            print("*")
        }
        println()
    }