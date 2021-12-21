fun main() {
    val size = readLine()!!.toInt()
    val list = mutableListOf<Int>()
    var count = 0

    for (i in 0 until size) {
        list.add(readLine()!!.toInt())
    }

    for (i in 0 until size - 2) {
        if (list[i + 1] == list[i] + 1 && list[i + 2] == list[i] + 2) {
            count++
        }
    }
    println(count)
}