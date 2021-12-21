fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()

    for (i in a..b) {
        if (i % 3 == 0 && i % 5 == 0) {
            println("FizzBuzz")
        } else {
            if (i % 3 == 0) {
                println("Fizz")
            }
            if (i % 5 == 0) {
                println("Buzz")
            }
        }
        if (i % 3 != 0 && i % 5 != 0) {
            println(i)
        }
    }
}
