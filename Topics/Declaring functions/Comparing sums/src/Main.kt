// write your function here
fun isGreater(s1: Int, s2: Int, s3: Int, s4: Int): Boolean {
    return s1 + s2 > s3 + s4
}
fun main() {
    val number1 = readLine()!!.toInt()
    val number2 = readLine()!!.toInt()
    val number3 = readLine()!!.toInt()
    val number4 = readLine()!!.toInt()

    println(isGreater(number1, number2, number3, number4))
}