//In a class of 57 students the teacher was collecting data of her students.The data she required for her students was;
//-The gender of the student
//-The course of the student
//-The feedback on the boys playing football
//-The feedback on the ladies playing hockey
//-The feedback on the curriculum.
//Using inheritance,represent the gender and the course as properties and the feedback as method.
fun main() {
    var student1 = Student()
     student1.gender = "male and female"
     student1.course = "ict"
    println("The data of 57 students both ${student1.gender} in a class studying ${student1.course}")
    student1.curriculum()
    var boy = Boys()
    boy.football()
    var girl = Girls()
    girl.hockey()
}
open class Student() {
    var gender:String = ""
    var course:String = ""

    fun curriculum (){
        println("sports")
    }
}
    class Boys:Student(){
        fun football(){
            println("The number of male students playing football is 18")
        }
    }
    class Girls:Student(){
        fun hockey() {
            println("The number of girls playing hockey is 16")
        }
    }
