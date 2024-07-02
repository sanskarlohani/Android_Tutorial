fun accessArrayElement(array: Array<Int>, index: Int): Int? {
    return try {
        array[index]
    } catch (e: ArrayIndex) {
        println("Error: Index out of bounds")
        null
    } finally {
        println("Operation completed")
    }
}
fun main() {
    val array = arrayOf(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(accessArrayElement(array, 2))
    println(accessArrayElement(array, 5))
    println(accessArrayElement(array, 11))
}
