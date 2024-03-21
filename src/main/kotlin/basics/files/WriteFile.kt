package basics.files

import java.io.File

class WriteFile(path:String) {
    private val file = File(path)
    private val content = """I am Parikshit
        |I am Jagtap
        |I am Engineer
    """.trimMargin()


    fun writeUsingWriteText(){
        file.writeText(content)
    }

    fun writeUsingPrintWriter(){
        file.printWriter().use { out -> out.println(content) }
    }

}

fun main(){
    val writeFile = WriteFile("writeOutput.txt")
    writeFile.writeUsingPrintWriter()
}

/*
Learning :
1. writeText() : kotlin extension useful to write small files
2. BufferedWriter : Internally user BufferdWriter Text to character output. It simply writes characters or character arrays to the output stream without any interpretation or formatting.
3. PrintWriter :  writing formatted text to a character-output stream. It provides convenience methods for printing formatted representations of various data types, such as strings, integers, floating-point numbers, and objects.
 */