fun main() {
    val text = readLine()!!.split(' ').toMutableList()
    var save = ""

    for (word in text) {
        if (word.length > save.length) {
            save = word
        }
    }

    println(save)
}