fun main() {
    val a = readLine()!!.first()

    if (a in '1'..'9' || a.isUpperCase()) {
        println(true)
    } else {
        println(false)
    }
}