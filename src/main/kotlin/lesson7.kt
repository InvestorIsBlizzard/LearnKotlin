fun main(){
    // диапазоны (интервалы)

    val range1: IntRange = 42..442
    val range2: IntRange = 42 until 442 // то же, но без числа 442
    val range3: LongRange = 42L.. 442L
    val range4: CharRange = 'a'..'z'
    val range5: ClosedRange<Double> = 42.1..442.1
    val range6: ClosedRange<Float> = 42.1f..442.1f
    val range7: IntProgression = 42..442 step 2 // прогрессии
    val range8: IntProgression = 42 downTo 442 step 2

        // in, !in

    val a = 52 in range1
    val b = 52 !in range1
//   println(a)
// println(b)

        // for  - если известно какое колличество иттераций цикла нужно совершить
        // while - если условия не известы и меняются по ходу
        // break, continue, return

    for(i in 5 downTo 1  ) {
        if(i == 3) {
//            println("Пользователь нажал на кнопку \"Пропустить\"") // \" - позволяет заключить текст вне основного текста с кодом
//            break
//     println("i == 3, i не будет распечатана")
//            continue
            return // как только програма достигнет i - выполнение перезагрузится

        }
        println("Реклама закончится через $i")
        Thread.sleep(1000)
    }

    println("Продолжение работы программы вне цикла")

//    for(i in range2 step 8) {
//        println(i)
//    }
}
