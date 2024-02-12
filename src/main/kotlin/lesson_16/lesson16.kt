package lesson_16

fun main() {

  // public - по умолчанию по всем классам, файлам и методам, все данные доступны всем из любого класса или пакета
  // private - доступны только в рамках файла или класса
  // protected - данные видны в классе, в котором они определены и в классах наследника
  // internal - данные доступны в любой части модуля

    val guide = HitchhikerGuide()
//    guide.title = "Don't panic"
//    guide.chooseArticle()
      println(guide.getNumberOfPages())
    guide.setNumberOfPages(42_000)
    println(guide.getNumberOfPages())
    


//    Support().printInfo()

}