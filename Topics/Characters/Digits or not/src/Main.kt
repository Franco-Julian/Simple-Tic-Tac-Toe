fun main() {
    repeat(4) {
        val letter = readLine()!!.first()

        println(letter.isDigit())
    }
}