package lesson_11_12

fun main() {

    val dish1: Dish = Dish(
        id = 1,
        name = "�������",
        category = "��������",
        ingredients = listOf("����", "�������", "����", "�����"),
        )

    val dish2: Dish = Dish(
        id = 2,
        name = "��� �����",
        category =  "�����",
        ingredients = listOf("����", "������", "���������", "����", "�����"),
    )

    val ingredient1 = Ingredient("��������", 100, 1)
    val ingredient2 = Ingredient("�������", 50, 1, _isNeedToPrepare = true)

    println(ingredient1.name)
    println(ingredient2.name)

//    println(dish1.name)
//    println(dish1.ingredients)
//    println(dish1.inFavorites)
//    println()
//    println(dish2.name)
//    println(dish2.ingredients)
//    println(dish2.inFavorites)

//    dish1.category = "����� �� ���"
//    dish2.inFavorites = true
//    println(dish1.category)
//    println(dish2.inFavorites)

//    println("�������� ��� ����� �������")
//    dish1.addToFavorites()
//    println(dish1.inFavorites)
//    dish1.startCooking()
//
//    println()
//
//    println("�������� ��� ����� ��� �����")
//    dish2.addToFavorites()
//    println(dish2.inFavorites)
//    val ingredientsForSoup = dish2.downlandIngredients()
//    println(ingredientsForSoup)
//    dish2.removeFromFavorites()
//    println(dish2.inFavorites)


}