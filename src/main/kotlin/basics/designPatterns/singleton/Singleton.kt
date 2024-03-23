package basics.designPatterns.singleton

class Singleton private constructor() {
    private var age = 10 // these members are not accessible in companion object.
    private val name = "PARIKSHIT"
    companion object {
        @Volatile
        private var instance : Singleton? = null.also{println("CHECK HOW MUCH TIME IT IS EXECUTING")}
        fun getInstance(): Singleton {
            println("Address of person $instance")
            instance?.age = instance?.age!! + 1
            println("AGE is ${instance?.age}")
            return instance ?: synchronized(this){
                instance ?: Singleton().also { instance = it }
            }
        }
    }
}

fun main(){
    val person = Singleton.getInstance()
    val seconInstance = Singleton.getInstance()
    val thirdInstance = Singleton.getInstance()
    val fourthInstance = Singleton.getInstance()
}

/*
Learning :
Singleton is a creational design pattern that lets you ensure that a class has only one instance throughput its life cycle.

each time address of object will be the same.

Volatile :
The use of the @Volatile modifier ensures that changes to instance made by one thread are visible to other threads immediately.
 */
