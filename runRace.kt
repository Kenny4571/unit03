fun main() {
    // Ask user for three names
    print("Enter the name of the first runner: ")
    val runner1 = readLine()
    print("Enter the name of the second runner: ")
    val runner2 = readLine()
    print("Enter the name of the third runner: ")
    val runner3 = readLine()

    // Ask user for each of their times
    print("Enter the time for $runner1: ")
    val time1 = readLine()!!.toInt()
    print("Enter the time for $runner2: ")
    val time2 = readLine()!!.toInt()
    print("Enter the time for $runner3: ")
    val time3 = readLine()!!.toInt()

    // Sort and output results
    val sortedRunners = listOf(Pair(runner1, time1), Pair(runner2, time2), Pair(runner3, time3)).sortedWith(compareBy { it.second })
    println("The order of the runners is:")
    sortedRunners.forEach { println(it.first) }
}
