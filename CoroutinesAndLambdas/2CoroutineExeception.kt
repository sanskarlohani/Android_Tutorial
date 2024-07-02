import kotlinx.coroutines.*

fun main() = runBlocking {
  val job = launch {
    try {
        println("Hello your job is beginning...")
        throw Exception("An error occurred")
        println("Your job ends...")
      } catch (e: Exception) {
        println("Caught exception: ${e.message}")
    }
}
   job.join()
}
