fun main(){
    val ingredient1 = "€цо"
    val ingredient2 = "помидор"
    val ingredient3 = "зелень"
    val ingredient4 = "соль"
    val ingredient5 = "перец"

    val arrayOfIngredients = arrayOf("€йцо", "помидор", "зелень", "соль", "перец",)

    val intArray1: IntArray = intArrayOf(4, 4, 2)
    val charArray: CharArray = charArrayOf('4', '4', '2')

// val intAray2 = arrayOf()

    var intArray3 = intArrayOf(1, 2, 3, 4, 5)
    intArray3 = intArrayOf(1, 2, 3, 4, 5)

// println("–азмер массива с ингридиентами: ${arrayOfIngredients.size}")

//    println(arrayOfIngredients.indexOf("помидор"))
//    println(arrayOfIngredients[1])
//    println(arrayOfIngredients[2])
//    println(arrayOfIngredients[5])  //eror т.к идет отсчет от 0 до 4

//    arrayOfIngredients[4] = "паприка"
//    println(arrayOfIngredients[4])

    arrayOfIngredients.set(1, "капуста")
    arrayOfIngredients.get(1)

    for (i in arrayOfIngredients) {
        println("»нгридиент ${arrayOfIngredients.indexOf(i) + 1}$i")
    }
}