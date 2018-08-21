fun main(args: Array<String>) {
    println("Hi, to find out the color of the chessboard cell (from 'a' to 'h')")
    print("Enter the letter: ")
    val letter = readLine().toString()
    if (letter in "A".."H" || letter in "a".."h") {
        return checkNumber(letter)
    }
    while (letter !in "A".."H" || letter !in "a".."h") {
        print("Enter the letter " +
                "that is on the chessboard (from 'a' to 'h'): ")
        val letter = readLine().toString()
        if (letter in "A".."H" || letter in "a".."h"){
            return checkNumber(letter)
        }
    }
}

fun checkNumber(letter: String){
    print("Enter a number between 1 and 8: ")
    val number = readLine()!!.toInt()
    if (number < 9 || number >= 1){
        return partitionSet(letter, number)
    }
    while (number > 8 || number < 1) {
        println("You must enter a number from a to 8, " +
                "otherwise nothing will happen")
        print("Try again: ")
        val number = readLine()!!.toInt()
        if (number < 9 || number >= 1){
            return partitionSet(letter, number)
        }
    }
}

//Separation of a set of letters for convenience in calculations
fun partitionSet(letter: String, number: Int) {
    val myArr = arrayOf("A", "C", "E", "G")
    for (i in myArr.indices){
        if (myArr[i].equals(letter, ignoreCase = true)) {
            return forFirstSet(number)
        }
    }
    if (letter !in myArr){
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
