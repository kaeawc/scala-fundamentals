import java.util.Date

case class Student(
  id:Long,
  name:String
) extends User with Human {

  val birthDate:Date = {
    val date = new Date()
    date.setYear(1986)
    date
  }

}


