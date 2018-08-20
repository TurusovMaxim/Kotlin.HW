fun main (args: Array<String>){
    //create a string constants
    val wordsFirst = "Всего в этой строке "
    val numbWord = "3"
    val wordsSecond = " значения чисел ("
    val numbWord1 = "6.69, "
    val numbWord2 = "45, "
    val numbWord3 = "1.7803E12"
    val wordsThird = "), произведение которых равно: "
    //create a numeric constants
    val numb0 = 6.69
    val numb1 = 45
    val numb2 = 1.7803E12
    //adding the value of the lines
    val resultString = wordsFirst + numbWord + wordsSecond +
            numbWord1 + numbWord2 + numbWord3 + wordsThird
    //multiplication of numbers
    val resultMulti = numb0 * numb1 * numb2
    print(resultString + resultMulti)
}