fun main(args: Array<String>) {
    println("Hi, to find out the color of the chessboard cell (from 'a' to 'h')")
    print("Enter the letter: ")
    val letter = readLine()!!.toString()
    val oneLetter = letter.substring(0,1)
    if (oneLetter in "A".."H" || oneLetter in "a".."h") {
        return checkNumber(oneLetter)
        }
    while (oneLetter !in "A".."H" || oneLetter !in "a".."h") {
        print("Enter the letter " +
                "that is on the chessboard (from 'a' to 'h'): ")
        val oneLetter = readLine()!!.toString()
        if (oneLetter in "A".."H" || oneLetter in "a".."h"){
                return checkNumber(oneLetter)
        }
    }
}

fun checkNumber(oneLetter: String){
    print("Enter a number between 1 and 8: ")
    val number = readLine()!!.toInt()
    if (number <= 8 && number >= 1){
        return partitionSet(oneLetter, number)
    }
    while (number > 8 || number < 1) {
        println("You must enter a number from a to 8, " +
                "otherwise nothing will happen")
        print("Try again: ")
        val number = readLine()!!.toInt()
        if (number <= 8 && number >= 1){
            return partitionSet(oneLetter, number)
        }
    }
}

//Separation of a set of letters for convenience in calculations
fun partitionSet(oneLetter: String, number: Int) {
    val myArr = arrayOf("A", "C", "E", "G")
    for (i in myArr.indices){
        if (myArr[i].equals(oneLetter, ignoreCase = true)) {
            return forFirstSet(number)
        }
    }
    if (oneLetter !in myArr){
        return forSecondSet(number)
    }
}

fun forFirstSet(number: Int){
    if (number % 2 == 0){
        println("This cell is white")
    }
    else{
        println("This cell is black")
    }
}

fun forSecondSet(number: Int){
    if (number % 2 == 0){
        println("This cell is black")
    }
    else{
        println("This cell is white")
    }
}
