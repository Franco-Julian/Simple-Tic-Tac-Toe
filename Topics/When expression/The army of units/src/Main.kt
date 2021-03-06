fun main() {
    val units = readLine()!!.toInt()

    println(
        when {
            units == 0 -> "no army"
            units in 1..4 -> "few"
            units in 5..9 -> "several"
            units in 10..19 -> "pack"
            units in 20..49 -> "lots"
            units in 50..99 -> "horde"
            units in 100..249 -> "throng"
            units in 250..499 -> "swarm"
            units in 500..999 -> "zounds"
            units >= 1000 -> "legion"
            else -> "put a valid number"
        }
    )
}