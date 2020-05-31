import org.junit.Test
import kotlin.test.assertTrue

class Runners {

    @Test
    fun runTasksInParallel() {
        val distributor = ParallelTaskDistributor(20, 10)
        distributor.run()
    }

    @Test
    fun runTest() {
        assertTrue(false)
    }

}