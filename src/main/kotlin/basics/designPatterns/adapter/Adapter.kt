import java.util.*

//existing interface
interface Student{
    fun getFirstName() : String
    fun getLastName() : String
}

//existing class
class CollegeStudent(private val fName: String, private val lName : String) : Student{
    override fun getFirstName() = fName.uppercase(Locale.getDefault())
    override fun getLastName() = lName.uppercase(Locale.getDefault())
}

//new requirement
class SchoolStudent(private val firstName : String, private val lastName : String){
    fun getFirstName() = firstName
    fun getLastName() = lastName
}

class SchoolStuentAdapter(val schoolStudent: SchoolStudent) : Student{
    override fun getFirstName() = schoolStudent.getFirstName()

    override fun getLastName() =schoolStudent.getLastName()

}


//client code
fun main(){
    val list : MutableList<Student> = mutableListOf()

    val collegeStudent = CollegeStudent("SUHANI", "JAIN")
    list.add(collegeStudent)
    println("NAME : ${collegeStudent.getFirstName()} ${collegeStudent.getLastName()}")

    //below line is not possible as SchoolStudent does not implement Student
    //val schoolStudent = SchoolStudent("PIYUSH", "BANSOD")
    //list.add(schoolStudent) //this will aslo not work, for make it work  we need to following things

    val schoolStudent = SchoolStuentAdapter(SchoolStudent("PIYUSH", "BANSOD"))
    list.add(schoolStudent)

    println(list)
}