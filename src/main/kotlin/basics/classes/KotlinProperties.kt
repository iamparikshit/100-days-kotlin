package basics.classes

import java.util.*

class Movie {

    // val year it must be initialise else compiler will give error

    lateinit var category : String
    //lateinit only works for var. It can't be use in primary constructor
    var name : String = ""
        get() = field.lowercase(Locale.getDefault())
        set(value){field = "$value- 2" } // here field is backing property

    fun checkIfCategoryIsAssigned() = this :: category.isInitialized
    //checking weather lateinit is initialize
}

fun main(){
    val movie = Movie()
    movie.name = "SPIDERMAN"
    println("name of movie : ${movie.name}")


    //println("movie category : ${movie.category}")
    //Above line will throw error : UninitializedPropertyAccessException, because category was not initialize

    //we can also check if it is really initialize
    println(movie.checkIfCategoryIsAssigned())
    movie.category = "ADVENTURE"
    println("movie category : ${movie.category}")

}