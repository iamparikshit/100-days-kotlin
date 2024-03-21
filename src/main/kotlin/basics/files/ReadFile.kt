package basics.files

import java.io.BufferedReader
import java.io.File
import java.io.FileReader

class ReadFile(path: String) {
    private val file = File(path)
    fun readFileUsingReadText(){
        print("ReadText :")
        val content = file.readText()
        println(content)
    }

    fun readUsingBufferedReader(){
        print("BufferedReader :")
        val bufferedReader = BufferedReader(FileReader(file))
        var line: String?
        while (bufferedReader.readLine().also { line = it } != null) {
            println(line)
        }
        bufferedReader.close()
    }

    fun readUsingUseLines(){
        print("UseLines :")
        file.useLines {lines->
            lines.forEach { line -> println(line) }
        }
    }
}

fun main(){
    val read = ReadFile("output.txt")

    read.readFileUsingReadText()
    read.readUsingBufferedReader()
    read.readUsingUseLines()
}


/*
Learning :
1. readText() : It convenient for small file. Read all the lines at once.
2. BufferedReader() : Convenient for large files. Read line by line sequentially. Process each line individually.
3. useLines() : extension function of kotlin. read lines from a file lazily using a lambda function.
suitable for lazy processing of large text files, as it reads lines from the file one by one and processes them within the lambda without loading the entire file into memory at once
 */