package basics.files

import java.io.File

fun main(){
    val path = "output.txt"
    try{
        val file = File(path)

        val result = file.createNewFile()
        when(result){
            true ->  println("File created successfully: ${file.absolutePath}")
            else -> println("File already exists.")
        }
    }
    catch (e: Exception){
        println("An error occurred while creating the file: ${e.message}")
    }

}

/*
Learning :
 File object with the desired file path and using methods like createNewFile() to create the file on the disk.
 */