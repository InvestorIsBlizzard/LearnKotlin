fun main() { // ������� - ����� ���� ���������� �� ���������� �������
// val name = getName()
// val age = getAge()

 printNameAndAge(userName = getName(), userAge = getAge()) // ctrl + p
}

fun getName() : String? = readLine()


fun getAge() : Int? = readLine()?.toInt() // *�������������� ����� ������������ ������������� *��� ��� ��
// ���� = ������� ����������� � ���, ��� ������� ����� � ������������ ���������

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("������ ������������: $userName, $userAge ���")
}