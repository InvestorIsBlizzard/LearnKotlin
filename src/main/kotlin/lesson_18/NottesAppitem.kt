package lesson_18

import java.util.*

open class NottesAppItem {

    open fun getItemData() = ""

//    fun addItemToCell(
//        ttle: String,
//        creationDate: Date,
//        type: String,
//        data: Long,
//    ) {
//        println("Item \"$ttle\" added to cell - $creationDate\nType: $type\nData: $data") // \ - для красоты, символы переноса строки
//    }
//
//    fun addItemToCell(
//        ttle: String,
//        creationDate: Date,
//        type: String,
//        data: List<String>,
//    ) {
//        println("Item \"$ttle\" added to cell - $creationDate\nType: $type\nData: $data") // \ - для красоты, символы переноса строки
//    }
}


class MessageItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: String,
) : NottesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}

class PhoneItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: Long,
) : NottesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}


class ListItem(
    private val title: String,
    private val creationDate: Date,
    private val type: String,
    private val data: List<String>,
) : NottesAppItem() {
    override fun getItemData(): String {
        return "Item \"$title\" added to cell - $creationDate\nType: $type\nData: $data"
    }
}
