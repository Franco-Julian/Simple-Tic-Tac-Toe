fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    var c = 0

    for (i in a..b) {
        c += i
    }

    println(c)
}