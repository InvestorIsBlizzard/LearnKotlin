fun main(){
    val ingredient1 = "���"
    val ingredient2 = "�������"
    val ingredient3 = "������"
    val ingredient4 = "����"
    val ingredient5 = "�����"

    val arrayOfIngredients = arrayOf("����", "�������", "������", "����", "�����",)

    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray: CharArray = charArrayOf('4', '4', '2')

// val intAray2 = arrayOf()

    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(1, 2, 3, 4, 5)

// println("������ ������� � �������������: ${arrayOfIngredients.size}")

//    println(arrayOfIngredients.indexOf("�������"))
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])
//    println(arrayOfIngredients[5])  //eror �.� ���� ������ �� 0 �� 4

//    arrayOfIngredients[4] = "�������"
//    println(arrayOfIngredients[4])

    arrayOfIngredients.set(1, "�������")
    arrayOfIngredients.get(1)

    for (i in arrayOfIngredients) {
        println("���������� ${arrayOfIngredients.indexOf(i) + 1}$i")
    }
}