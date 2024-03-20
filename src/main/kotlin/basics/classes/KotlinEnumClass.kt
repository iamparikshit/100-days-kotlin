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