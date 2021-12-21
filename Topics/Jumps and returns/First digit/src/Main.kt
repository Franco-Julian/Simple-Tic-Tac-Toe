fun main() {
    val combination: String = readLine()!!

    for (letter in combination) {
        if (letter.isDigit()) {
            println(letter)
            break
        }
    }
}