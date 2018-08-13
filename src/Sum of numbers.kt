fun main (args : Array<String>){
    val a = 1560
    val b = 1789.186f
    val c = 4864.128
    /*
     * Creating new constants of the same type,
     * which are the sum of the previous constants
    */
    val numb1: Int = a + b.toInt() + c.toInt()
    println("The sum of three numbers that are converted to double: $numb1")
    val numb2: Float = a.toFloat() + b + c.toFloat()
    println("The sum of three numbers that are converted to double: $numb2")
    val numb3: Double = a.toDouble() + b.toDouble() + c
    println("The sum of three numbers that are converted to double: $numb3")
}