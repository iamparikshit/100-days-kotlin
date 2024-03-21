package basics.files

import java.io.File


fun main(){
    val path = "output.txt"
    val file = File(path)
    val result = file.delete()

    when(result){
        true -> println("File deleted successfully.")
        else -> println("Error occurred while deleting the file or file does not exist.")
    }
}
