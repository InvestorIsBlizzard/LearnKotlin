package lesson_22

fun main() {

    //class vs data class
    // equals() - ��������� ���� ��������
    // hashCode() - ���������� ��� �������
    // toString() - ���������� ������������� ������� � ���� �������� ������
    // copy() - �������� ������ ������� � ������ ������

    val word1 = Word("Red", "�������")
    val word2 = Word("Red", "�������")
    val word3 = Word("White", "�����")
//    println(word1 === word2)
//    println(word2 === word3)

//    val word4 = word3.copy(translate = "���������� �������: �����")
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

