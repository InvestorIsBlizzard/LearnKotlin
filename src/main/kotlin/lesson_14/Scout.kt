package lesson_14

class Scout (
      name: String,
      speed: Int,
      val radarRange: Int,
      val afterburnerSpeed: Int,
) : SpaseShip(name, speed) {  // <- указываем класс, от которого будем наследоваться, обязательно после скобочки

      fun handleDataFromRadar() {
          println("$name: обработка данных с радара")
      }

      fun runAfterburner() {
          println("$name: форсаж запущен")
      }

}