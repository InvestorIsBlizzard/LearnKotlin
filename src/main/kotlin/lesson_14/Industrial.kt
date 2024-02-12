package lesson_14

class Industrial(
    name: String,
    speed: Int,
    val numberOfMiners: Int,
) : SpaseShip(name, speed,unmanned = true) {

    fun launchScanningDrones() {
        println("$name: ����������� ����� ��������")
    }

  override fun runSystemDiagnostic() {
      super.runSystemDiagnostic()
        //��������������� �������: 1 � ���� ������� ����������� ����� �������� 2 � ������ ����������� open 3 � ������, ������� �������������� ��������� override
        println("$name: �������� ����������� ������ � ��������")
      // super - ��������� � ������� � ��������� �����������
    }
}