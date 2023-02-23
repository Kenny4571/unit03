fun main(args: Array<String>) {
    println("Please enter a month, day, and two-digit year: ")

    val (month, day, year) = readLine()!!.split(" ").map { it.toInt() }

    val isMagic = (month * day == year)

    if (isMagic) {
        println("The date is magic!")
    } else {
        println("The date is not magic.")
    }
}
