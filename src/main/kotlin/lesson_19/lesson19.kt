package lesson_19

fun main() {

    // дни недели
    // цвета
    // статусы

    val statusesFromServer = listOf(101, 102, 103)

    for(i in statusesFromServer) {
        when(i) {
            Status.NEW.id -> setStatus(Status.NEW)
            Status.COOKING.id -> setStatus(Status.COOKING)
            Status.COMPLETED.id -> setStatus(Status.COMPLETED)
            // TODO - заглушка, которая не даст запустить код, но напомнит, что вот именно тут надо сделать) Все тодо можно увидеть во вкладке с инструментами
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
           return "Заказ создан и ожидает оплаты"
        }
    },
    COOKING(102) {
        override fun getStatusDescription(): String {
            return "Заказ оплачен и начал готовиться"
        }
    },
    COMPLETED(103) {
        override fun getStatusDescription(): String {
            return "Заказ готов, можете забирать"
        }
    },
    ERROR(0) {
        override fun getStatusDescription(): String {
            return "Что-то пошло не так, мы уже разбираемся"
        }
    };

    abstract fun getStatusDescription() : String

}

fun setStatus(status: Status) {
    when(status) {
        Status.NEW -> println("Заказ принят")
        Status.COOKING -> println("Заказ готовится")
        Status.COMPLETED -> println("Заказ готов")
        Status.ERROR -> println("Статус неизвестен")
    }
}