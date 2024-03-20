package basics.exceptions

class  Calculate {
    fun divide(first : Int, second : Int): Int {
        return try{
            first/second
        }catch (error : Exception){
            println("INSIDE CATCH Exception ${error.message}")
            throw Exception("cannot divide by zero ${error.message}")
        }finally {
            println("IN FINAL BLOCK")
        }
    }

    fun multiply(first : Int, second: Int) : Int{
        val result = first * second

        return try{
            println("INSIDE TRY BLOCK")
            if(result == 0)
                throw Exception("NOT POSSIBLE")
            else result
        }catch (error : Exception){
            10
        }
        finally {
            println("INSIDE FINALL")
            val r = (10+2).also { println("AGAIN FINAL") }
            10
        }
    }
}

fun main(){
    val calculate = Calculate()
    println("10/2 : ${calculate.divide(10,2)}")
    //println("10/2 : ${calculate.divide(10,0)}")

    println("-----")
    println("10*2 : ${calculate.multiply(10,2)}")
    println("10*0 : ${calculate.multiply(10,0)}")

}

/*
Learning :
1. No checked exception like java. Only unchecked exception
2. try block can act as a expression
3. @throws annotation is use to provide interoperability
4. ALl exception class inherits Throwable
5. Every exception has a message, a stack trace, and an optional cause.
 */