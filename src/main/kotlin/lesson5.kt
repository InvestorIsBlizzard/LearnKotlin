fun main() {

    val userAge = readLine()!!.toInt()

//    if(userAge >= AGE_OF_MAJORITY) {
//        println("Показать экран со скрытым контентом")
 //   }
 //   if(userAge < AGE_OF_MAJORITY) {
 //       println("Вернуться на главный экран приложения")
 //   }

        //  val resultText =  if(userAge >= AGE_OF_MAJORITY) {
      //  "Показать экран со скрытым контентом"
     //   } else if(userAge == 16 || userAge == 17) { // esle if - дополнительная проверка
     //      "Показать экран с ограниченным контентом"
   // } else { // else только в паре с блоком if
   //     "Вернуться на главный экран приложения"
  //  }
   // println(resultText)





// для упрощения, т.к код в одну строчку можно использовать следующую запись:

 val resultText = if(userAge >= AGE_OF_MAJORITY) println("Показать экран со скрытым контентом")
 else if(userAge == 16 || userAge == 17) println("Показать экран с ограниченным контентом")
 else println("Вернуться на главный экран приложения")
    // println(resultText)

// when
val consoleNumber = when (userAge) {
    10 -> {
        println("Дополнительное действие, если ввели 10")
        "Ввели число 10"
    }
    20 -> "Ввели число 20"
    42 -> "Ввели число 42"
    else -> "Ввели другое число"
}
    println(consoleNumber)
}

const val AGE_OF_MAJORITY = 18