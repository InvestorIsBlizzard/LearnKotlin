package lesson_14

class Scout (
      name: String,
      speed: Int,
      val radarRange: Int,
      val afterburnerSpeed: Int,
) : SpaseShip(name, speed) {  // <- ��������� �����, �� �������� ����� �������������, ����������� ����� ��������

      fun handleDataFromRadar() {
          println("$name: ��������� ������ � ������")
      }

      fun runAfterburner() {
          println("$name: ������ �������")
      }

}