fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val ab = a + b == 20
    val ac = a + c == 20
    val bc = c + b == 20

    println("${ab || ac || bc}")
}