import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val hour = scanner.next()
    val minutes = scanner.next()
    val seconds = scanner.next()

    val day = scanner.next()
    val month = scanner.next()
    val year = scanner.next()

    println("$hour:$minutes:$seconds $day/$month/$year")

}