fun main() {
    val r1 = readLine()!!.toInt()
    val r2 = readLine()!!.toInt()
    val r3 = readLine()!!.toInt()
    val r4 = readLine()!!.toInt()
    val e = readLine()!!.toInt()

    if (e in r1..r2 && e in r3..r4) {
        println(true)
    } else {
        println(false)
    }

}
