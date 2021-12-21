fun main() {
    val h1 = readLine()!!.toInt()
    val m1 = readLine()!!.toInt()
    val s1 = readLine()!!.toInt()

    val h2 = readLine()!!.toInt()
    val m2 = readLine()!!.toInt()
    val s2 = readLine()!!.toInt()

    val secondsDay1 = h1 * 3600 + m1 * 60 + s1
    val secondsDay2 = h2 * 3600 + m2 * 60 + s2

    println("${secondsDay2 - secondsDay1}")
}