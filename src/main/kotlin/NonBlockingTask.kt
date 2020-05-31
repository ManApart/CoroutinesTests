import kotlinx.coroutines.delay

class NonBlockingTask(private val id: Int) {
    suspend fun run() {
        println("$id: Start")
        delay(2000)
        println("$id: Finish")
    }

}