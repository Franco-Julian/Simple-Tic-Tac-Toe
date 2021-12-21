import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val num1: Int = scanner.nextLine().toInt()
    val num2: Int = scanner.nextLine().toInt()

    val sum = num1 + num2

    println("$num1 plus $num2 equals $sum")
}