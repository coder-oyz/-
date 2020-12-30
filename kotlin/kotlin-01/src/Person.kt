open class Person(val name1: String, val age1: Int) {
    var name = ""
    var age = 0
    init {
        name = name1
        age = age1
    }
    fun eat() {
        println(name + " is eating. He is " + age + " years old.")
    }
}

//open class Person() {
//    var name = ""
//    var age = 0
//
//    fun eat() {
//        println(name + " is eating. He is " + age + " years old.")
//    }
//}