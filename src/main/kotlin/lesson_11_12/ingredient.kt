package lesson_11_12

class Ingredient(val name: String, val weight: Int, val count: Int) {

    var  isNeedToPrepare = false

    constructor(
    name: String,
    weight: Int,
    count: Int,
    _isNeedToPrepare: Boolean,
    ) : this(name, weight, count) {

 //       this.isNeedToPrepare = isNeedToPrepare // this. ����� �������� � ������� ����������, �.� ��� ��� ����������� �� ������ ������ ����� ������
    isNeedToPrepare = _isNeedToPrepare
    }

    init {
    println("���������� $name ������")

    }

    // ��������� �����������
    // ��������� �����������
    // ����� init
    // ���� ���������� ������������
}