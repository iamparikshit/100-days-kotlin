package basics.classes

data class User(val name: String, val age : Int){
    val department = "Accounts" //if we print te user object i.e toString it will oly print name and age
}

fun main(){
    val user1 = User("ADAM", 22)
    val user2 = User("ADAM", 22)
    println("user1 : ${user1.hashCode()}")
    println("user2 : ${user2.hashCode()}")
    println("equals : ${user1==user2}")
    println("department : ${user1.department}")
}

/*
Data classes in Kotlin are primarily used to hold data
Compiler generates its member functions such as equals, hashCOde
The primary constructor must have at least one parameter.
All primary constructor parameters must be marked as val or var.
Data classes can't be abstract, open, sealed, or inner.

 */