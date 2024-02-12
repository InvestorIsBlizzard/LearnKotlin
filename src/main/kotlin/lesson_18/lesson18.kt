package lesson_18

import java.util.Date

fun main() {
    // ��� ���� ������������:
    // ad hoc - �� ������, � ������ ������������� ��������� �������
    // subtyping - ����������� ���������, �������
    // parametric - ���������������, ����� ���� ������������ ����� ���������� ����

    val creationDate = Date()

    val messageItem: NottesAppItem = MessageItem(
        "call sister",
        creationDate,
        "message",
        "call sister to congratulate",
    )
    println()

    val phoneItem: NottesAppItem = PhoneItem(
        "sister's number",
        creationDate,
        "phone",
        89991002525,
    )
    println()

    val listItem: NottesAppItem = ListItem(
        "todolist",
        creationDate,
        "list",
        listOf("wash dog", "do the cleaning", "buy new shoes"),

    )

//    println(messageItem.getItemData())
//    println()
//    println(phoneItem.getItemData())
//    println()
//    println(listItem.getItemData())

    val arrayOfNotes = arrayOf<NottesAppItem>(messageItem, phoneItem, listItem)
    showAllNotes(arrayOfNotes)
}

fun showAllNotes(notes: Array<NottesAppItem>) {
    notes.forEach {
        println(it.getItemData())
    }
}