package lamabda

//fun main() {
//    val list = ArrayList<String>()
//    list.add("Apple")
//    list.add("Banana")
//    list.add("Orange")
//    list.add("Pear")
//    list.add("Grape")
//
//   // val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//
//
//}

//fun main() {
//    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape")
//    for (fruit in list) {
//        println(fruit)
//    }
//}

fun main() {
    val list = mutableListOf("Apple", "Banana", "Orange", "Pear", "Grape")
    list.add("Watermelon")
    for (fruit in list) {
        println(fruit)
    }
}

//fun main() {
//    val map = mapOf("Apple" to 1, "Banana" to 2, "Orange" to 3, "Pear" to 4, "Grape" to 5)
//    for ((fruit, number) in map) {
//        println("fruit is " + fruit + ", number is " + number)
//    }
//}

//fun main() {
//    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
//    val newList = list.map { it.toUpperCase() }
//    for (fruit in newList) {
//        println(fruit)
//    }
//}

//fun main() {
//    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
//    val newList = list.filter { it.length <= 5 }
//            .map { it.toUpperCase() }
//    for (fruit in newList) {
//        println(fruit)
//    }
//}


//fun main() {
//
//    val list = listOf("Apple", "Banana", "Orange", "Pear", "Grape", "Watermelon")
//    val anyResult = list.any { it.length <= 5 }
//    val allResult = list.all { it.length <= 5 }
//    println("anyResult is " + anyResult + ", allResult is " + allResult)
//}


//fun main() {
//    Thread {
//        println("Thread is running")
//    }.start()
//}