fun main() {

    // NullPointerException - ���������� �������� ���������� ��� (NPE)
    // null

    val nullableString: String? = null
    val nonNullableString: String = "some string"

//    println(nullableString?.length) // .? - �������� ����������� ������, �.� ����� ���� �������� null � ����� ��� �� �������� �� ���������
//    println(nonNullableString?.length) // / .length  �������� if else

 // if(nullableString != null) println(nullableString.length)
 // esle println("���������� ������ null")

//    val nullableLine: String? = readLine()

//    val stringLength: Int = nullableString?.length ?: 999  // ?: - �������� �����, �������� esle, ���������� �������� ������������� ����
//    println(stringLength)

    val stringLength: Int = nullableString!!.length // !! �������� �����������, ������� ������� � ���, ��� null ����� ���� �� ����� � ��� ��� ����� ��))



}