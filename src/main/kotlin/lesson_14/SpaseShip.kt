package lesson_14

open class SpaseShip (  // open чтобы открыть класс, т.е дать ему возможность взаимодействовать с другими классами, получив наследников
   // abstract - перед class -> запретить создания экземпляров этого класса
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode() {
    println("${name}: Переход в варп-режим")
    }

   open fun runSystemDiagnostic() {
        println("${name}: Запущена диагностика систем корабля")
    }

}