fun main() {
    val a = readLine()!!
    val b = readLine()!!.toInt()

    println("Symbol # $b of the string \"$a\" is '${a[b - 1]}'")
}
