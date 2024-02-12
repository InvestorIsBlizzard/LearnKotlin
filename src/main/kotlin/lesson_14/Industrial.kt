package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : SpaseShip(name, speed,unmanned = true) {

    fun launchScanningDrones() {
        println("$name: сканирующие дроны запущены")
    }

  override fun runSystemDiagnostic() {
      super.runSystemDiagnostic()
        //переопределение функции: 1 в теле функции прописываем новое действие 2 у метода прописываем open 3 у метода, который переопределяем дописывем override
        println("$name: запущена диагностика дронов и майнеров")
      // super - обращение к методам и свойствам суперкласса
    }
}