fun main(args: Array<String>) {
   //  println("Hello World!")


    val numberOfOrders = 42

    val notificationText = "Yay"

   println(numberOfOrders)
    println(notificationText)

    // числовые (только целые числа)
    val intNum1: Int = -2147483648 // 32 bit - max число в 32 битах
    val intNum2: Int = -2147483647 // 32 bit 47 потому что в положительные числа входит "0"
    val longNum: Long // 64 bit
    val shortNum: Short // 16 bit
    val byteNum: Byte // 8 bit
    val unsignedNum: UInt = 2147483648u // 32 bit

    // вещественные
    val doubleNum: Double = 234.42 // 64 bit
    val floatNum: Float = 84.2f // 32 bit

    // строковые
    val stringValue: String = "Здесь могла быть ваша реклама"
    val charValue: Char = '1'

    // логические
    val trueValue: Boolean = true
    val falseValue: Boolean = false
}