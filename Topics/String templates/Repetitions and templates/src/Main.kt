import java.util.Scanner
fun main() {
    val scanner = Scanner(System.`in`)
    val word: String = scanner.next()

    println("${word.length} repetitions of the word $word: ${word.repeat(word.length)}")
}