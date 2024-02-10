package lesson_11

class Dish (
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false, // * почему болеан?

  ) {

    fun addToFavorites() {
        println("Блюдо $name добавлено в избранное")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("Блюдо $name удалено из изрбранного")
        inFavorites = false
    }

    fun startCooking() {
        println("Пользователь перешел на экран начала приготовления блюда $name")
    }

    fun downlandIngredients(): List<String> {
        return ingredients
    }
}