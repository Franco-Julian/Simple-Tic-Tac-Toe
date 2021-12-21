// write your function here
fun isVowel(letter: Char): Boolean {
    val toLetter = letter.lowercaseChar()
    if (toLetter == 'a' || toLetter == 'e' || toLetter == 'i' || toLetter == 'o' || toLetter == 'u') {
        return true
    } else {
        return false
    }
}

fun main() {
    val letter = readLine()!!.first()

    println(isVowel(letter))
}