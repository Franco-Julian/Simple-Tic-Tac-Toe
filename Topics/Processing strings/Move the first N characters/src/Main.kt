fun main() {
    val input = readLine()!!.split(' ').toMutableList()
    val s = input[0]
    val n = input[1].toInt()
    var newS = s

    if (n < s.length) {
        newS = s.substring(n, s.lastIndex + 1) + s.substring(0, n)
    }
    println(newS)
}