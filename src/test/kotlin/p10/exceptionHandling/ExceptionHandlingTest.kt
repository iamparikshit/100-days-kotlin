package p10.exceptionHandling

import org.junit.jupiter.api.Test

class ExceptionHandlingTest{
    val exceptionHandling = ExceptionHandling()

    @Test
    fun `should check the handling exception with 10 by 0`(){
        exceptionHandling.division(10,0)
    }

    @Test
    fun `should check the custome exception handling`(){
        exceptionHandling.checkWithCustomException()
    }

    @Test
    fun `should check the custome exception handling without finally block`(){
        exceptionHandling.checkCustomExceptionWithoutFinallyBlock()
    }
}