package lesson_14

open class SpaseShip (  // open ����� ������� �����, �.� ���� ��� ����������� ����������������� � ������� ��������, ������� �����������
   // abstract - ����� class -> ��������� �������� ����������� ����� ������
    val name: String,
    val speed: Int,
    val unmanned: Boolean = false,
) {
    fun switchToWarpMode() {
    println("${name}: ������� � ����-�����")
    }

   open fun runSystemDiagnostic() {
        println("${name}: �������� ����������� ������ �������")
    }

}