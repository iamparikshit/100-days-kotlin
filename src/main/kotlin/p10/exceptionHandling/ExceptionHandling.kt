package p10.exceptionHandling

class ExceptionHandling {
    fun division(firstInput : Int, secondInput : Int) {
        try{
            firstInput/secondInput
        }catch(e:Exception){
            println("This is catch block")
            println("Exception message ${e.message}")
        }
        finally {
            println("This is finally block")
        }
    }
    fun checkWithCustomException(){
        try{
            throw CustomException("this is custom exception")
        }catch(e : CustomException){
            println("this is catch block")
            println("this is catch messgae ${e.message}")
        }
    }
    fun checkCustomExceptionWithoutFinallyBlock(){
        try{
            println("try and finally can work")
        }finally {
            println("this is finally block")
        }
    }
}

class CustomException(message : String) : Exception(message)