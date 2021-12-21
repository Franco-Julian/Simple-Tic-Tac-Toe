fun main() {
    val str = readLine()!!
    var uniqueCharacters = 0
    loop@ for (chr1 in str) {
        var count = 0
        for (chr2 in str) {
            if (chr1 == chr2) count++
            if (count > 1) continue@loop
        }
        uniqueCharacters++
    }
    println(uniqueCharacters)
}