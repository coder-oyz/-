package `null`

import Study

//fun main() {
//    doStudy(null);
//}
//fun doStudy(study: Study?) {
//    study.readBooks()
//    study.doHomework()
//}

//fun doStudy(study: Study?) {
//    if (study != null) {
//        study.readBooks()
//        study.doHomework()
//    }
//}

//fun doStudy(study: Study?) {
//    study?.readBooks()
//    study?.doHomework()
//}


//fun getTextLength(text: String?): Int {
//    if (text != null) {
//        return text.length
//    }
//    return 0
//}

fun getTextLength(text: String?) = text?.length ?: 0

var content: String? = "hello"

fun main() {
    if (content != null) {
        printUpperCase()
    }
}

//fun printUpperCase() {
//    val upperCase = content.toUpperCase()
//    println(upperCase)
//}

fun printUpperCase() {
    val upperCase = content!!.toUpperCase()
    println(upperCase)
}

fun doStudy(study: Study?) {
    study?.let { stu ->
        stu.readBooks()
        stu.doHomework()
    }
}