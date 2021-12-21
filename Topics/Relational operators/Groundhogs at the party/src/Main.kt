fun main() {
    val a = readLine()!!.toInt()
    val b = readLine().toBoolean()

    if (b) {
        if (a in 15..25) {
            println(true)
        }
        else {
            println(false)
        }
    } else{
        if (a in 10..20) {
            println(true)
        }
        else {
            println(false)
        }
    }
}