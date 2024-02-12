package lesson_17

class BabelFish (
    private val coefficient: Int?
 )  {

    var isTranslated = false

    var nerveSignalLevel = 200
 //     get() =  field // field - передает то поле, для которого мы прописывем геттер
        get() = if (coefficient != null) field * coefficient else field //чтение: если коэфицент не нал, возвращаем значение сигнала помноженное на коэф иначе возвращаем филд
        set(value: Int) {
            field = 700
            if (value > 300) {
                isTranslated = true
                println("isTranslated = true")
            }
        }
}