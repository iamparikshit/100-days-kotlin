package basics.classes

class Example // Any, which is the default superclass for a class with no supertypes declared

open class Base(age : Int, open val dobYear :Int) {
    val lastName = "ADAM"
    open val name = "BASE_NAME"

}// Class is open for inheritance

class Derived(age : Int, override val dobYear: Int) : Base(age, dobYear){
    override val name ="DERIVED_NAME"
    val fullName = name+" "+super.lastName // using super we can access super class member
}

fun main(){
    val example =Example()
    println(example.toString()) // by default ANY is super class of example

    val derived = Derived(20, 1998)
    println(derived.lastName) //parent property is accessible
    //println(derived.age) // age is not accessible because age is value parameter

    println(derived.name) //override the base class value
    println(derived.fullName)
}

/*
    if you have same property of method of base class in derived class, then in derived class it should marked as
    override keyword and in base class that property or method should marked as open
 */