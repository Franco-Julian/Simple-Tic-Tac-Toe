fun main() {
    val a = readLine()!!.toInt()
    val b = readLine()!!.toInt()
    val c = readLine()!!.toInt()

    val check1 = a >= 1 && b <= 0 && c <= 0
    val check2 = b >= 1 && c <= 0 && a <= 0
    val check3 = c >= 1 && a <= 0 && b <= 0

    var check = check1 xor check2 xor check3
    if (check1 && check2 && check3) check = false

    println(check)
}