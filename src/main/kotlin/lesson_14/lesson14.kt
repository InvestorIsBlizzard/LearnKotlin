import lesson_14.Industrial
import lesson_14.Scout
import lesson_14.SpaseShip

fun main () {

    // ����������� ����. �������
    // ��������, ��������, �����������
    // ���� �����, ����������� �������
    // ���������, ��������������

//    val ship1 = SpaseShip( "ship1", 500)
//    ship1.runSystemDiagnostic()
//    ship1.switchToWarpMode()
//    println()

    val scout1 = Scout("scout1", 750, 100, 1000)
    scout1.runSystemDiagnostic()
    scout1.switchToWarpMode()
    scout1.runAfterburner()
    scout1.handleDataFromRadar()
    println(scout1.unmanned)
    println()

    val industrial1 = Industrial("industrial1", speed = 250, 8)
    industrial1.runSystemDiagnostic()
    industrial1.switchToWarpMode()
    industrial1.launchScanningDrones()
    println(industrial1.unmanned)
    println()
}