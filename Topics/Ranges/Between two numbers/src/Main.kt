fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    if (a in b..c) {
        println(true)
    } else {
        println(false)
    }
}