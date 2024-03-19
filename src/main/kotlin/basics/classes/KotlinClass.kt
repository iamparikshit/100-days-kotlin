package basics.classes

class Employee(name : String, val sex : String = "M", lastName : String = "ADAM"){
    private val name = "ASSIGNED_NAME"

    val age = 20.also { println("STATEMENT INSIDE A CLASS $name") }
    init {
        println("INSIDE INIT $name")
        println("THE DIFFERENCE OF NAMES: this.name : ${this.name} VS name : $name ")
    }

    constructor() : this(name = "DEFAULT_NAME") {
        println("INSIDE A SECONDARY CONSTRUCTOR")
        println("THE DIFFERENCE OF NAMES: this.name : ${this.name} VS name : $name ")
    }

    constructor(name :String, sex: String) : this(name =  name){
        println("name is $name")
        println("sez is $sex")
    }

    companion object{
        val year = 20.also { println("COMPANION OBJECT") }
    }

}

fun main() {
    val defaultEmployee = Employee()
    val employee = Employee("JOHN") // example 2
    println(employee.sex) // here you can assess sex variable because it is declared as public final val
    //println(employee.lastName) here lastName is not accessible

    println("---")
    val employee2 = Employee("SURAJ", "M")
}


/* Learning :
 Kotlin has top-down approach. It started with primary constructor and then whatever comes in block statment
 Also when you add var or val in primary constructor of kotlin class then only it is accessible
 By default, Kotlin classes are final
 Companion object will only get load one time
*/