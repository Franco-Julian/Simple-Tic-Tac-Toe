fun main() {
    val input = readLine()!!
    var out: String

    if (input.isEmpty()) {
        println()
    } else {
        println(
            when (input.first()) {
                'i' -> {
                    out = input.drop(1)
                    out.toInt() + 1
                }
                's' -> {
                    out = input.drop(1)
                    out.reversed()
                }
                else -> input
            }
        )
    }

}