fun main() {
    val n = readLine()!!.toInt()
    var max = 0

    repeat(n) {
        val a = readLine()!!.toInt()
        if (a % 4 == 0 && a > max) {
                max = a
        }
    }
    println(max)
}