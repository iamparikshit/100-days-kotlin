package basics.classes

abstract class Person(val name : String) {
    val age = 20 //here you can initialize. where as in interface you can't
    abstract var category : String
    init {
        println("INSIDE INIT")
    }
    open fun displayId(id: Int) {
        println("My Id is $id. and $category")
    }

    abstract fun dislpayJob()

}

class Teacher(name: String) : Person(name){
    override var category = "sd"

    override fun dislpayJob() {
        println("THIS METHOD IS OVERRIDE IN CHILD CLASS")
        super.displayId(10)
    }


}

fun main(){
    val teacher = Teacher("ADAM")
    teacher.dislpayJob()

   // val person =Person("SUHANI") cannot create instance of abstract class
}


/*
Learning :
1. We can not create instance of abstract class
2. Abstract class have both public final and abstract members
3. We can also initialize members in abstract class. Same we can't do in interface
4. you can also access its super member from child using super keyword

Basically, an abstract can do what an interface can. The difference is, the abstract class can have constructors, an init body, and fields so we can properly hold state.

You can use an interface when you only want to share behavior with the class but not the code between a set of objects. But if you need both, use an abstract class.
 */