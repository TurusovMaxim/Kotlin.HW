fun main(args: Array<String>) {
    print("Enter the amount of money to transfer: ")
    val money = readLine()!!.toDouble()
    val dollar = 67.95 //The dollar exchange rate on 08/11/2018 (9:19 PM)
    val min = dollar/100
    while (money < min){
        println("For the transfer you will need the amount of more than 1 cent, " +
                "that is 0,6795 rubles")
        print("Please, try again: ")
        val money = readLine()!!.toDouble()
        if (money > min){
           return algorithm(money, dollar)
        }
    }
    if (money > min){
       return algorithm(money, dollar)
    }
}

fun algorithm(money: Double, dollar: Double){
    //Money transfer from rubles to dollars
    val transfer = money / dollar
    val formattedDouble = String.format("%.2f%n", transfer)
    print("This is your money in dollars: $formattedDouble")
    //Money transfer from dollars to rubles
    val reTransfer = transfer * dollar
    val comm = (money * 3) / 100
    val netProfit = reTransfer - comm
    val reformattedDouble = String.format("%.2f%n", netProfit)
    print("This is your money in rubles: $reformattedDouble")
    //Commission of the bank (3%)
    val comFormatted = String.format("%.2f%n", comm)
    print("Commission is: $comFormatted")
}
