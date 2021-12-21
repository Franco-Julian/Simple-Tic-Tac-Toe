package tictactoe

fun printBoard(gameBoard: MutableList<MutableList<Any>>) {
    println(gameBoard[0].joinToString("  "))
    println(gameBoard[1].joinToString(" "))
    println(gameBoard[2].joinToString(" "))
    println(gameBoard[3].joinToString(" "))
    println(gameBoard[4].joinToString("  "))
}

var  oneByOne = false

fun enterMove(gameBoard: MutableList<MutableList<Any>>) {
    var rightNumber = true
    var putX: MutableList<String>
    val putXInt = mutableListOf<Int>()

    do {
        rightNumber = true
        print("Enter the coordinates: ")
        putX = readLine()!!.split(' ').toMutableList()

        if (putX[0] < "0" || putX[0] > "9" || putX[1] < "0" || putX[1] > "9"){
            putX.clear()
            rightNumber = false
            println("You should enter numbers!")
        } else {
            putXInt.add(putX[0].toInt())
            putXInt.add(putX[1].toInt())

            if(putXInt[0] > 3 || putXInt[1] > 3 || putXInt[0] < 1 || putXInt[1] < 1) {
                putX.clear()
                putXInt.clear()
                rightNumber = false
                println("Coordinates should be from 1 to 3!")
            } else{
                if(gameBoard[putXInt[0]][putXInt[1]] == 'X' || gameBoard[putXInt[0]][putXInt[1]] == 'O') {
                    putX.clear()
                    putXInt.clear()
                    rightNumber = false
                    println("This cell is occupied! Choose another one!")
                }
            }
        }
        if (rightNumber) {
            if (!oneByOne) {
                gameBoard[putXInt[0]][putXInt[1]] = 'X'
                oneByOne = true
            } else {
                gameBoard[putXInt[0]][putXInt[1]] = 'O'
                oneByOne = false
            }
//            printBoard(gameBoard) // Print the gameBoard
        }

    } while (!rightNumber)

}

fun winner(game: String) : Boolean {

    var x = false
    var o = false
    var numX = 0
    var numO = 0
    var done = false
//    var impossible: Boolean


    if( gameBoard[1][1]  == 'X' && gameBoard[1][2] == 'X' && gameBoard[1][3] == 'X') {
        x = true
        done = true
    }
    if(gameBoard[2][1] == 'X' && gameBoard[2][2] == 'X' && gameBoard[2][3] == 'X') {
        x = true
        done = true
    }
    if(gameBoard[3][1] == 'X' && gameBoard[3][2] == 'X' && gameBoard[3][3] == 'X') {
        x = true
        done = true
    }
    if(gameBoard[1][1] == 'X' && gameBoard[2][1] == 'X' && gameBoard[3][1] == 'X') {
        x = true
        done = true
    }
    if(gameBoard[1][2] == 'X' && gameBoard[2][2] == 'X' && gameBoard[3][2] == 'X') {
        x = true
        done = true
    }
    if(gameBoard[1][3] == 'X' && gameBoard[2][3] == 'X' && gameBoard[3][3] == 'X') {
        x = true
        done = true
    }
    if(gameBoard[1][1] == 'X' && gameBoard[2][2] == 'X' && gameBoard[3][3] == 'X') {
        x = true
        done = true
    }
    if(gameBoard[1][3] == 'X' && gameBoard[2][2] == 'X' && gameBoard[3][1] == 'X') {
        x = true
        done = true
    }

    if(gameBoard[1][1]  == 'O' && gameBoard[1][2] == 'O' && gameBoard[1][3] == 'O') {
        o = true
        done = true
    }
    if(gameBoard[2][1] == 'O' && gameBoard[2][2] == 'O' && gameBoard[2][3] == 'O') {
        o = true
        done = true
    }
    if(gameBoard[3][1] == 'O' && gameBoard[3][2] == 'O' && gameBoard[3][3] == 'O') {
        o = true
        done = true
    }
    if(gameBoard[1][1] == 'O' && gameBoard[2][1] == 'O' && gameBoard[3][1] == 'O') {
        o = true
        done = true
    }
    if(gameBoard[1][2] == 'O' && gameBoard[2][2] == 'O' && gameBoard[3][2] == 'O') {
        o = true
        done = true
    }
    if(gameBoard[1][3] == 'O' && gameBoard[2][3] == 'O' && gameBoard[3][3] == 'O') {
        o = true
        done = true
    }
    if(gameBoard[1][1] == 'O' && gameBoard[2][2] == 'O' && gameBoard[3][3] == 'O') {
        o = true
        done = true
    }
    if(gameBoard[1][3] == 'O' && gameBoard[2][2] == 'O' && gameBoard[3][1] == 'O') {
        o = true
        done = true
    }

    gameBoard[1].forEach {
        if(it == 'X') {
            numX++
        }
        if (it == 'O') {
            numO++
        }
    }
    gameBoard[2].forEach {
        if(it == 'X') {
            numX++
        }
        if (it == 'O') {
            numO++
        }
    }
    gameBoard[3].forEach {
        if(it == 'X') {
            numX++
        }
        if (it == 'O') {
            numO++
        }
    }

    if(x && o || numX > numO+1 || numO > numX+1) {
        println("Impossible")
    } else {
        if (x) {
            println("X wins")
            return true
        }
        if (o) {
            println("O wins")
            return true
        }
        if ( (numO + numX) == 9 ) {
            println("Draw")
            return true
        }
    }
    return false
}

val game:String = "               "
val gameBoard = mutableListOf(
    mutableListOf<Any>("---------"),
    mutableListOf<Any>("|", game[0], game[1], game[2], "|"),
    mutableListOf<Any>("|", game[3], game[4], game[5], "|"),
    mutableListOf<Any>("|", game[6], game[7], game[8], "|"),
    mutableListOf<Any>("---------")
)

fun main() {
    var complete = false


    printBoard(gameBoard) // Print the gameBoard

    while (!complete) {
        enterMove(gameBoard)// Enter valid move and print board again
        printBoard(gameBoard) // Print the gameBoard
        complete = winner(game)
    }


    }

