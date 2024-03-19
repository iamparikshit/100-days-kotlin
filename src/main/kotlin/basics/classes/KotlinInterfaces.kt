package basics.classes

interface MyInterface {
    val prop : Int //by default public abstract val
    val propertyWithImplementation: String
        get() = "foo"


    fun foo() {
        println(prop)
    }
}

class Child : MyInterface{
    override val prop: Int = 20
    override val propertyWithImplementation: String
        get() = super.propertyWithImplementation
    init {
        println("INSIDE INIT")
        println("propertyWithImplementation : $propertyWithImplementation")
    }

}

fun main(){
    val child = Child()
    println("foo value : ${child.foo()}")
    println("propertyWithImplementation value : ${child.propertyWithImplementation}")
}

/*
Learning :
All the member fields in interface are by default public abstract val or var
We can not initialize any member in interface.
Interface doesn't have constructor
If method definition is there then it can be treated as open fun
 */