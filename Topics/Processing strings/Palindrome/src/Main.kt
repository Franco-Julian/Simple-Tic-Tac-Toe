fun main() {
    val a = readLine()!!
    var b: String = ""

    for (i in a.length - 1 downTo 0) {
        b += a[i]
    }
    if (a == b) {
        println("yes")
    } else {
        println("no")
    }
}