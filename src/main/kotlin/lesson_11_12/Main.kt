package lesson_11_12

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "яичница",
        category = "«автраки",
        ingredients = listOf("€йцо", "помидор", "соль", "перец"),
        )

    val dish2: Dish = Dish(
        id = 2,
        name = "—уп лапша",
        category =  "ќбеды",
        ingredients = listOf("вода", "курица", "вермишель", "соль", "перец"),
    )

    val ingredient1 = Ingredient("картошка", 100, 1)
    val ingredient2 = Ingredient("морковь", 50, 1, _isNeedToPrepare = true)

    println(ingredient1.name)
    println(ingredient2.name)

//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "Ѕлюда из €иц"
//    dish2.inFavorites = true
//    println(dish1.category)
//    println(dish2.inFavorites)

//    println("ƒействи€ дл€ блюда яичница")
//    dish1.addToFavorites()
//    println(dish1.inFavorites)
//    dish1.startCooking()
//
//    println()
//
//    println("ƒействие дл€ блюда —уп Ћапша")
//    dish2.addToFavorites()
//    println(dish2.inFavorites)
//    val ingredientsForSoup = dish2.downlandIngredients()
//    println(ingredientsForSoup)
//    dish2.removeFromFavorites()
//    println(dish2.inFavorites)


}