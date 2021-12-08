package pattern.behavioral.command

class Chef constructor(private val name: String, private val age: Int) {

    val totalExp: Int
        get() = expKoreanFood + expChineseFood + expJapaneseFood
    var expKoreanFood = 0
    var expChineseFood = 0
    var expJapaneseFood = 0

    fun cookKoreanFood(): String {
        expKoreanFood++
        return "Kimchi"
    }

    fun cookChineseFood(): String {
        expChineseFood++
        return "Dimsum"
    }

    fun cookJapaneseFood(): String {
        expJapaneseFood++
        return "Sushi"
    }
}
