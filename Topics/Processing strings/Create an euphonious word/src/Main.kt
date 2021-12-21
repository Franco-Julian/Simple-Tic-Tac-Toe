const val MAX_IN_A_ROW = 3

fun main() {
    val word = readLine()!!
    var vowel = 0
    var consonant = 0
    var out = 0

    for (char in word) {
        if (char == 'a' || char == 'e' || char == 'i' || char == 'o' || char == 'u' || char == 'y') {
            vowel++
            consonant = 0
            if (vowel == MAX_IN_A_ROW) {
                vowel = 1
                out++
            }
        } else {
            vowel = 0
            consonant++
            if (consonant == MAX_IN_A_ROW) {
                consonant = 1
                out++
            }
        }
    }
    println(out)
}