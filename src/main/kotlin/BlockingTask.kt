class BlockingTask(private val id: Int) {
    fun run() {
        println("$id: Start")
        Thread.sleep(2000)
        println("$id: Finish")

    }

}