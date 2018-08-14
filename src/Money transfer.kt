fun main(args : Array<String>){
    println("Good day, select the currency for the transfer")
    print("Dollars(D) or rubles(R): ")
    val currency = readLine()!!.toString()
    if (currency == "R" || currency == "r"){
        return forRubles()
    }
    if (currency == "D" || currency == "d"){
        return forDollars()
    }
    while (currency !== "R" || currency !== "r" ||
            currency !== "D" || currency !== "d"){
        println("Rubles - <<R>> or <<r>> + \n" +
                "Dollars - <<D>> or <<d>>")
        print("Enter the required character: ")
        val currency = readLine()!!.toString()
        if (currency == "R" || currency == "r"){
            return forRubles()
        }
        if (currency == "D" || currency == "d"){
            return forDollars()
        }
    }
}


//Checking the amount of money before transferring into dollars
fun forRubles(){
    println("Excellent, now enter the amount of money in RUBLES for transfer to USD")
    println("For the transfer You will need the amount of more than 1 cent," +
            "that is 0.6795")
    print("Enter: ")
    val money = readLine()!!.toDouble()
    val dollar = 67.95 //The dollar exchange rate on 08/11/2018 (9:19 PM)
    val min = dollar/100
    while (money < min){
        println("For the transfer You will need the amount of more than 1 cent, " +
                "that is 0.6795 rubles")
        print("Please, try again: ")
        val money = readLine()!!.toDouble()
        if (money > min){
            return operationForR(money, dollar)
        }
    }
    if (money > min){
        return operationForR(money, dollar)
    }
}

//Operation to convert currency into dollars
fun operationForR(money: Double, dollar: Double){
    val transfer = money / dollar
    val comm = (transfer * 3) / 100
    val netProfit = transfer - comm
    val formattedDouble = String.format("%.2f%n", netProfit)
    print("This is Your money in dollars: $formattedDouble")
    return commission(transfer, comm)
}

//Checking the amount of money before transferring into rubles
fun forDollars(){
    println("Excellent, now enter the amount of money in DOLLARS for transfer to RUB")
    print("Enter: ")
    val money = readLine()!!.toDouble()
    val dollar = 67.95 //The dollar exchange rate on 08/11/2018 (9:19 PM)
    while (money < 0.01){
        println("For the transfer You will need the amount of more than 1 cent")
        print("Try again: ")
        val money = readLine()!!.toDouble()
        if (money > 0.01){
            return operationForD(money, dollar)
        }
    }
    if (money > 0.01){
        return operationForD(money, dollar)
    }
}

//Operation to convert currency into rubles
fun operationForD(money: Double, dollar: Double){
    //Money transfer from dollars to rubles
    val transfer = money * dollar
    val comm = (transfer * 3) / 100
    val netProfit = transfer - comm
    val formattedDouble = String.format("%.2f%n", netProfit)
    print("This is Your money in rubles: $formattedDouble")
    return commission(transfer, comm)
}

//Commission of the bank (3%)
fun commission(transfer: Double,comm: Double){
    val withoutComm = String.format("%.2f%n", transfer)
    val comFormatted = String.format("%.2f%n", comm)
    print("Commission is: $comFormatted")
    print("Without commission: $withoutComm")

}