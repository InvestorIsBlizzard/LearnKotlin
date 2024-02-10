package lesson_11

class Dish (
    val id: Int,
    val name: String,
    var category: String,
    val ingredients: List<String>,
    var inFavorites: Boolean = false, // * ������ ������?

  ) {

    fun addToFavorites() {
        println("����� $name ��������� � ���������")
        inFavorites = true
    }

    fun removeFromFavorites() {
        println("����� $name ������� �� �����������")
        inFavorites = false
    }

    fun startCooking() {
        println("������������ ������� �� ����� ������ ������������� ����� $name")
    }

    fun downlandIngredients(): List<String> {
        return ingredients
    }
}