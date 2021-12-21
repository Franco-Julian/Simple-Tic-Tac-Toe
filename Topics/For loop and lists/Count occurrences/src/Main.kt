fun main() {
    val cant = readLine()!!.toInt()
    val n = mutableListOf<Int>()

    for (i in 0 until cant) {
        n.add(readLine()!!.toInt())
    }

    val m = readLine()!!.toInt()
    var times = 0

    for (element in n) {
        if (element == m) {
            times++
        }
    }

    println(times)

}