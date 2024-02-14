package lesson_19

fun main() {

    // ��� ������
    // �����
    // �������

    val statusesFromServer = listOf(101, 102, 103)

    for(i in statusesFromServer) {
        when(i) {
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            // TODO - ��������, ������� �� ���� ��������� ���, �� ��������, ��� ��� ������ ��� ���� �������) ��� ���� ����� ������� �� ������� � �������������
            else -> setStatus(Status.ERROR)
        }
        Thread.sleep(1000)
    }

    println()
//    println(Status.NEW.name)
//    println(Status.NEW.ordinal)
//    for (i in Status.values()) println(i)
    println(Status.NEW.getStatusDescription())
    println(Status.COOKING.getStatusDescription())
    println(Status.COMPLETED.getStatusDescription())
}

enum class Status (val id: Int){

    NEW(101) {
        override fun getStatusDescription(): String {
           return "����� ������ � ������� ������"
        }
    },
    COOKING(102) {
        override fun getStatusDescription(): String {
            return "����� ������� � ����� ����������"
        }
    },
    COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "����� �����, ������ ��������"
        }
    },
    ERROR(0) {
        override fun getStatusDescription(): String {
            return "���-�� ����� �� ���, �� ��� �����������"
        }
    };

    abstract fun getStatusDescription() : String

}

fun setStatus(status: Status) {
    when(status) {
        Status.NEW -> println("����� ������")
        Status.COOKING -> println("����� ���������")
        Status.COMPLETED -> println("����� �����")
        Status.ERROR -> println("������ ����������")
    }
}