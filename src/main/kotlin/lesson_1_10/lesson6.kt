fun main() {
// while, do while
   var counter = 5

    // while (counter >0) {
   //     println("Реклама закончится через ${counter--}") // -- декриментор, уменьшает counter  чтобы отсчет мог закончится, если бы декриментор стоял вначале, то сначало отнималась еденица
  //  Thread.sleep(1000)
 //   }
    do {
        println("Реклама закончится через ${counter--}")
        Thread.sleep(1000)
    } while (counter >0) // в данном случае код в любом случае отработает одну операциию и лишь потом выполнит проверку
}
