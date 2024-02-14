package lesson_20

import java.util.Calendar

fun main() {

    //��������� ������� - ����������� � ������� ����� fun
    //������ - �������, � ������� ��� ��������, ����������� � ������� ���������� ���� � �������� ������

    val calendar: Calendar = Calendar.getInstance()

   val getDaysToEndYear: () -> Int = fun (): Int = 365 - calendar[Calendar.DAY_OF_YEAR]

    println(getDaysToEndYear()) //.invoke - ���������

    val convertEndDaysToMills: (Int) -> Unit = fun(endDays: Int) = println(1000 * 60 * 60 * 24 * endDays)
    convertEndDaysToMills(getDaysToEndYear())

    val printStringWithLambda: (Int) -> String

    printStringWithLambda = { answer: Int ->
        "print string wich lambda $answer"
    }

    println( printStringWithLambda(42)); // ; - ����� ����� ��������� ���

    // �������� ������

    println({it: Int -> "print string wich lambda 2 $it" } (442))

        // ��������� ���� � ������������
    val convertLambda = { endDays: Int ->
        println("Convert from lambda: ${1000 * 60 * 60 * 24 * endDays}")
    }

    convertLambda(getDaysToEndYear())
    }

