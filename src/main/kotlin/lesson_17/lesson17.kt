package lesson_17

fun main() {

   val fish = BabelFish(null)

    println("old value: ${fish.nerveSignalLevel}")
    println("old value: ${fish.isTranslated}")
    fish.nerveSignalLevel = 400
    println("new value: ${fish.nerveSignalLevel}")
    println("new value: ${fish.isTranslated}")

    val fish2 = BabelFish(2)
    println("new value: ${fish2.nerveSignalLevel}")

    val fish3 = BabelFish(21)
    println("new value: ${fish3.nerveSignalLevel}")

}