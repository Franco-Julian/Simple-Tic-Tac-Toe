fun main() {
    val word: String = readLine()!!

    for (i in 'a'..'z') {
        if (word.contains(i)) {
            continue
        }
        print(i)
    }
}