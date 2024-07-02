import kotlinx.coroutines.*
fun main() = runBlocking {
    var i: Int = 0
    try {
        withTimeout(2000L) {
            while(true) {
                ++i
                println("Task $i")
                delay(400L)
            }
        }
    } catch (e: CoroutineTimeOut) {
        println("Task timed out")
    }
}
