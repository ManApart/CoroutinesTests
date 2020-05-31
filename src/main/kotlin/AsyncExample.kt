import kotlinx.coroutines.async
import kotlinx.coroutines.delay
import kotlinx.coroutines.runBlocking
import kotlin.system.measureTimeMillis

fun exampleMain() = runBlocking {
    val time = measureTimeMillis {
        val one = async { doSomethingUsefulOne() }
        val two = async { doSomethingUsefulTwo() }
        println("The answer is ${one.await() + two.await()}")
    }
    println("Completed in $time ms")
}

suspend fun doSomethingUsefulOne(): Int {
    println("Start one")
    delay(1000L)
    println("End one")
    return 13
}

suspend fun doSomethingUsefulTwo(): Int {
    println("Start two")
    delay(1000L)
    println("End two")
    return 29
}