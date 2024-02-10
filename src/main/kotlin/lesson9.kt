fun main() {
 // List - список, упорядоченный набор элементов, можно обращаться по индексу, могут повторятся
 // Set - множество, коллекция уникальных элеметов, повторяющиеся элеметы исключены, порядок может быть любой
 // Map - словарь, определенный набор пар содержащий ключ и значение: ключ уникальный, а у значений могут быть дубликаты

 // массив имеет фикс. размер, массив - Array
 // Array[T], List [T]
 // Массивы оптимизированны для примитивов
 // Отличается процесс сравнивания элементов у массивов и листов

 val list = listOf(4, 4, 2)
 // Нельзя просто взять и обратиться к индексу к элементу для замены, как в массиве
 val list2: MutableList<Int> = mutableListOf(1, 2, 3)     //mutableListOf позволяет изменять значения внутри

 val mutableList = mutableListOf(11, 15, 20, 12, 9, 14)
// println(mutableList)

 mutableList.add(42)  // .add - добавить
// println(mutableList)

 mutableList.add(0, 42) // индекс - позиция, element - название
 println(mutableList)

// println(mutableList.contains(42)) // .contains проверит наличие элемента в списке и выведет значение true or false

// println(mutableList.isEmpty()) // содержит список хоть какой-то элемент или он пуст
// println(mutableList.isNotEmpty()) // *или он пуст

//   println(mutableList.indexOf(42)) // .indexOf показывает индекс данного элемента * если в списке несколько заданных элементов, то отобразит первый встретившийся
//   println(mutableList.lastIndexOf(42)) // .lastIndexOf - показывает последний индекс заданного элемента

   mutableList.sort() // .sort функция для сортировки списка по возрастанию
   mutableList.sortDescending() // по убыванию
   mutableList.reverse() // для изменения порядка элементов в списке на обратный
//   println(mutableList)

   mutableList.forEach { number: Int ->  // alt + ent + выделенная фиг. скобка позволяет задать ей тип сигнатуры лямбды *лямбда подсказка: it: Int
       // shit + F6 с выделенной it позволяют задать ей новое название
//       println(number) // it - переменная, которая основывается на типе списка, так как у нас инт, то и она будет инт
   }

    // интервал -> for
    // коллекция -> forEach
    // break, continue -> for

 val mutableList2 = mutableList.filter {
     // функия для фильтрации коллекции
     it == 42
 }
//    mutableList2.forEach{ println(it) }

   val mutableList3 = mutableList2.map { it * 2 }
   // map повзаимодействовать со всеми элементами
    mutableList3.forEach { println(it) }
}