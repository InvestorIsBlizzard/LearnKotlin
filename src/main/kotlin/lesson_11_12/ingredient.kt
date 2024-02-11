package lesson_11_12

class Ingredient(val name: String, val weight: Int, val count: Int) {

    var  isNeedToPrepare = false

    constructor(
    name: String,
    weight: Int,
    count: Int,
    _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

 //       this.isNeedToPrepare = isNeedToPrepare // this. чтобы отослать к верхней переменной, т.к без нее конструктор не поймет откуда брать данные
    isNeedToPrepare = _isNeedToPrepare
    }

    init {
    println("Ингридиент $name создан")

    }

    // вторичный конструктор
    // первичный конструктор
    // блоки init
    // тело вторичного конструктора
}