const val BOARD_SIZE = 5
const val NUMBER_OF_SHIPS = 3

fun main() {
    val ships = List(NUMBER_OF_SHIPS) { readLine()!!.split(" ").map { it.toInt() } }
    val freeRows = (1..BOARD_SIZE).toMutableList()
    val freeCols = (1..BOARD_SIZE).toMutableList()
    for (ship in ships) {
        freeRows.remove(ship[0])
        freeCols.remove(ship[1])
    }
    println(freeRows.joinToString(" "))
    println(freeCols.joinToString(" "))
}