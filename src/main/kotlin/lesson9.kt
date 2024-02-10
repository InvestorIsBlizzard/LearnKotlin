fun main() {
 // List - ������, ������������� ����� ���������, ����� ���������� �� �������, ����� ����������
 // Set - ���������, ��������� ���������� ��������, ������������� ������� ���������, ������� ����� ���� �����
 // Map - �������, ������������ ����� ��� ���������� ���� � ��������: ���� ����������, � � �������� ����� ���� ���������

 // ������ ����� ����. ������, ������ - Array
 // Array[T], List [T]
 // ������� ��������������� ��� ����������
 // ���������� ������� ����������� ��������� � �������� � ������

 val list = listOf(4, 4, 2)
 // ������ ������ ����� � ���������� � ������� � �������� ��� ������, ��� � �������
 val list2: MutableList<Int> = mutableListOf(1, 2, 3)     //mutableListOf ��������� �������� �������� ������

 val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
// println(mutableList)

 mutableList.add(42)  // .add - ��������
// println(mutableList)

 mutableList.add(0, 42) // ������ - �������, element - ��������
 println(mutableList)

// println(mutableList.contains(42)) // .contains �������� ������� �������� � ������ � ������� �������� true or false

// println(mutableList.isEmpty()) // �������� ������ ���� �����-�� ������� ��� �� ����
// println(mutableList.isNotEmpty()) // *��� �� ����

//   println(mutableList.indexOf(42)) // .indexOf ���������� ������ ������� �������� * ���� � ������ ��������� �������� ���������, �� ��������� ������ �������������
//   println(mutableList.lastIndexOf(42)) // .lastIndexOf - ���������� ��������� ������ ��������� ��������

   mutableList.sort() // .sort ������� ��� ���������� ������ �� �����������
   mutableList.sortDescending() // �� ��������
   mutableList.reverse() // ��� ��������� ������� ��������� � ������ �� ��������
//   println(mutableList)

   mutableList.forEach { number: Int ->  // alt + ent + ���������� ���. ������ ��������� ������ �� ��� ��������� ������ *������ ���������: it: Int
       // shit + F6 � ���������� it ��������� ������ �� ����� ��������
//       println(number) // it - ����������, ������� ������������ �� ���� ������, ��� ��� � ��� ���, �� � ��� ����� ���
   }

    // �������� -> for
    // ��������� -> forEach
    // break, continue -> for

 val mutableList2 = mutableList.filter {
     // ������ ��� ���������� ���������
     it == 42
 }
//    mutableList2.forEach{ println(it) }

   val mutableList3 = mutableList2.map { it * 2 }
   // map ������������������� �� ����� ����������
    mutableList3.forEach { println(it) }
}