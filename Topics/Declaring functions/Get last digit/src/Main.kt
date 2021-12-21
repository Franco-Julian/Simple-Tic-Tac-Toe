// write your code here
fun getLastDigit(number: Int): Int {
    if (number % 10 < 0) {
       return number % 10 * -1
    } else {
        return number % 10
    }
}
/* Do not change code below */
fun main() {
    val a = readLine()!!.toInt()
    println(getLastDigit(a))
}