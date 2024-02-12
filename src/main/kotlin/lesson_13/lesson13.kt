fun main() {

    // NullPointerException - исключение нулевого показателя ИНП (NPE)
    // null

    val nullableString: String? = null
    val nonNullableString: String = "some string"

//    println(nullableString?.length) // .? - оператор безопасного вызова, т.к может быть значение null и чтобы все не крашнуло он оберегает
//    println(nonNullableString?.length) // / .length  заменяет if else

 // if(nullableString != null) println(nullableString.length)
 // esle println("Переменная хранит null")

//    val nullableLine: String? = readLine()

//    val stringLength: Int = nullableString?.length ?: 999  // ?: - оператор элвис, заменяет esle, возвращает значение определенного типа
//    println(stringLength)

    val stringLength: Int = nullableString!!.length // !! оператор утверждения, который говорит о том, что null точно быть не может и что все будет ок))



}