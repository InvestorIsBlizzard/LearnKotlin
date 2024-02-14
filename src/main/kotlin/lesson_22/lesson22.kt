package lesson_22

fun main() {

    //class vs data class
    // equals() - сравнение двух объектов
    // hashCode() - уникальный код объекта
    // toString() - возвращает представление объекта в виде понятной строки
    // copy() - копирует данные объекта в другой объект

    val word1 = Word("Red", "Красный")
    val word2 = Word("Red", "Красный")
    val word3 = Word("White", "Белый")
//    println(word1 === word2)
//    println(word2 === word3)

//    val word4 = word3.copy(translate = "Правильный перевод: Белый")
//    println(word3)
//    println(word4)

    println(word1.hashCode())
    println(word2.hashCode())
    println(word3.hashCode())
}

data class Word(
    val text: String,
    val translate: String,
)
//{
//    override fun toString(): String {
//        return "Word(text='$text', translate='$translate')"
//    }
//}

