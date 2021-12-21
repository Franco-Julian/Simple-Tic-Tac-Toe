fun main() {
    val n = readLine()!!.toInt()
    val numbers = mutableListOf<Int>()

    for (i in 0..n-1) {
        numbers.add(readLine()!!.toInt())
    }

    val check = readLine()!!.toInt()

    if(numbers.contains(check)) {
        println("YES")
    } else {
        println("NO")
    }
}