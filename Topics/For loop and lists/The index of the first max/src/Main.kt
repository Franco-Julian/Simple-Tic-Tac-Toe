fun main() {
    val n = readLine()!!.toInt()
    val list = mutableListOf<Int>()

    for (i in 0 until n) {
        list.add(readLine()!!.toInt())
    }

    val maxNumber = list.maxOrNull()

    println(list.indexOf(maxNumber))

}