package basics.classes

enum class Direction {
    EAST, WEST, SOUTH, NORTH
}

enum class AgeType(val age: IntRange){
    Young(10..35),
    Children(1..10),
    Parents(36..54),
    Aged(55..80)
}

fun main(){
    val north = Direction.NORTH
    println(north.name)

    val young = AgeType.Young
    println("for ${young.name} : ${young.age}")
}

/*
Learning :
1. Each enum constant is an object. Enum constants are separated by commas.
2. Enums cannot be extended or subclassed. You cannot add more enum values at runtime.
3. In java : Enum types In kotlin: Enum class
 */


/*
Learning :
Association : relation between two objets like how they communicate, uses their data.
e.g one to one, one to many, many to one

Aggregation : which also mean has-a relation. it's like inheritance. Basically it's a week association.
In other word let suppose there

Composition : tightly bound

inheritance : composition over inheritance
 */