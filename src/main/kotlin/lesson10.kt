fun main() { // функция - кусок кода отвечающая за выполнения заданий
// val name = getName()
// val age = getAge()

 printNameAndAge(userName = getName(), userAge = getAge()) // ctrl + p
}

fun getName() : String? = readLine()


fun getAge() : Int? = readLine()?.toInt() // *вопросительные знаки обеспечивают безопастность *все еще хз
// знак = говорит компелятору о том, что функция будет с возвращаемым значением

fun printNameAndAge(userName: String?, userAge: Int?) {
    println("Данные пользователя: $userName, $userAge лет")
}