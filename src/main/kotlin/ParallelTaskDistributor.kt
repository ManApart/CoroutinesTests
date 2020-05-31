import kotlinx.coroutines.async
import kotlinx.coroutines.runBlocking

class ParallelTaskDistributor(private val count: Int, private val chunkSize: Int = 10) {

    fun run() {
        (0..count).chunked(chunkSize).map { processChunk(it) }
    }

    private fun processChunk(ids: List<Int>) {
        println("Process $ids")
        runBlocking {
            ids.forEach {
                async { NonBlockingTask(it).run() }
            }
        }
        println("Chunk complete: $ids")
    }
}