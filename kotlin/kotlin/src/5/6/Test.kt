package `5`.`6`

import kotlin.String

fun main() {
    val str = "ABC123xyz!@#"
    str.lettersCount();
    //val count = String.lettersCount1(str)
    //val count = "ABC123xyz!@#".lettersCount()

    val money1 = Money(5)
    val money2 = Money(10)
    val money3 = money1 + money2
    val money4 = money3 + 20
    println(money4)
}

//fun String.lettersCount(): Int {
//    var count = 0
//    for (char in this) {
//        if (char.isLetter()) {
//            count++
//        }
//    }
//    return count
//}