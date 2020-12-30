class Student(val sno1: String, val grade1: Int) : Person() {
    var sno = ""
    var grade = 0
    init {
        sno = sno1
        grade = grade1
        println("sno is " + sno)
        println("grade is " + grade)
    }
}

//class Student(val sno: String, val grade: Int, name: String, age: Int) : Person(name, age) {
//    var sno1=""
//    init {
//        println("sno is " + sno)
//        println("grade is " + grade)
//    }
//}

//class Student(val sno: String, val grade: Int, name: String, age: Int) :
//        Person(name, age) {
//    constructor(name: String, age: Int) : this("", 0, name, age) {
//    }
//
//    constructor() : this("", 0) {
//    }
//}