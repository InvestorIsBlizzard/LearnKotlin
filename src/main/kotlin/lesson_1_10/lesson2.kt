fun main() {
    val a = 5
    val b = 7
    val sum = a + b

 //  val c - не получится

    val c1 = 888
    val c2: Int

// println(a + b)
// println (sum)
// println (10 / 3)

    val intNum1: Int = 10 // - целые числа
    val intNum2: Int = 3
//    println (intNum1 / intNum2)

    val floatNum1: Float = 10f // дробные, с меньшим колл-вом чисел после ,
    val floatNum2: Float = 3f
//    println (floatNum1 / floatNum2)

    val doubleNum1: Double = 10.0 // тоже дробные , но уже с большим колличеством
    val doubleNum2: Double = 3.0
//    println (doubleNum1 / doubleNum2)

    // остаток от деления %

//    println(10 % 3)
//    println(10 % 2)

    // конечный тип переменной

    val c = intNum1 + floatNum1
//    println(c::class.simpleName) // float - 4 bit

    val d = intNum1 + floatNum1 + doubleNum1
//    println(d::class.simpleName) // double - 8 bit

   // инкремент, декремент

    var counter = 0

    counter = counter + 1
    counter += 1
    counter ++

    println (counter)

    counter -= 1
    counter--

    ++counter
    --counter

    // операторы сравнения
    // a = 5, b = 7

    println(a > b)
    println(a < b)
    println(a >= b)
    println(a <= b)
    println(a == b)
    println(a != b) // != - знак не равно

}
