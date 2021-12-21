fun main() {
    val number = readLine()!!.toInt()
    val companyIncome = mutableListOf<Int>()
    val companyTax = mutableListOf<Int>()
    val tax = mutableListOf<Float>()

    for (i in 0 until number) {
        companyIncome.add(readLine()!!.toInt())
    }
    for (i in 0 until number) {
        companyTax.add(readLine()!!.toInt())
    }

    for (i in 0 until number) {
        tax.add(companyIncome[i].toFloat() * companyTax[i].toFloat() / 100)
    }

    println(tax.indexOf(tax.maxOrNull()) + 1)

}