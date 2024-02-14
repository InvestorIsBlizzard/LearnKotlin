package lesson_20

import java.util.Calendar

fun main() {

    //анонимные функции - объ€вл€ютс€ с помощью слова fun
    //л€мбды - функции, у которых нет названи€, объ€вл€ютс€ с помощью заключени€ кода в фигурные скобки

    val calendar: Calendar = Calendar.getInstance()

   val getDaysToEndYear: () -> Int = fun (): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear()) //.invoke - призывать

    val convertEndDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { answer: Int ->
        "print string wich lambda $answer"
    }

    println( printStringWithLambda(42)); // ; - нужна чтобы разделить код

    // коротка€ запись

    println({it: Int -> "print string wich lambda 2 $it" } (442))

        // конверци€ дней в миллисекунды
    val convertLambda = { endDays: Int ->
        println("Convert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())
    }

