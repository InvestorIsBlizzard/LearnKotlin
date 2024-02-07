fun main() {

    //логические операторы
    //операторы сравнения

//    val a = 1 + 1
//    val b = (1 == 1) // двойное равно - сравнение

    // <, >, <=, >=, ==, != // тоже сравнение
    // true (истина)
    // false (ложь)

    // ===, !=== - (операторы ссылочного сравнения)

    val userAge = 50

//  var comparisonResult: Boolean = false

//    println(comparisonResult)

//    val comparisonResult = (userAge >= AGE_OF_MAJORITY) && !(userAge >= RETIREMENT_AGE)
    // Конечный результат будет true если возраст пользователя больше или равен совершеннолетию и если возраст
    // пользователя не больше или равен пенсионному. Чтение кода сверху <-
    // Есть && [и] - который гарантирует результат из двух сравнений и если один их них будет false, то он его и выведет
    // Так же есть || - который при наличии одного их true в сравнении выведет true в comparisonResult
//    val comparisonResult = userAge in AGE_OF_MAJORITY.. RETIREMENT_AGE

    // in - в заданном диапазоне !in - вне заданного диапазона

//           println("Результат проверки возраста пользователя: $comparisonResult")

// println(0 < -1) // false
// println(2 == 3) // false
// println(3 > 2) // true

    val a = true
    val b = !a
//      println (b)

}
// const val AGE_OF_MAJORITY = 18 // за пределами кода и название всегда с большой буквы
// const val RETIREMENT_AGE = 65