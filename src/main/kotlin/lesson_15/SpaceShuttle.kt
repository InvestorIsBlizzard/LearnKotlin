package lesson_15

abstract class SpaceShuttle : Movable, Shootable{

    abstract val tankSize: Int
    abstract fun runDiagnostic()

}

class Upsilon(override val tankSize: Int) : SpaceShuttle() { // upsilon - ����� ���������, ������� ��������� ������� ����� SpaseShuttle
    override fun runDiagnostic() {
        println("����������� ��������")
    }

    override fun prepareForTakeOff() {
        println("���������� ������")
    }

    override fun prepareForLanding() {
        println("�������� ������")
    }

    override fun startShooting() {
        println("������ ��������")
    }

    override fun reloadGuns() {
        println("������������ ������")
    }
}