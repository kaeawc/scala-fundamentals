trait User {

  val id:Long
  val name:String

  def in[G<:Group](group:G) = User.in[G](group)

}

object User {

  def fakes = {
    Array(
      Student(1,"Jerry"),
      Student(2,"April"),
      Student(3,"Bill"),
      Teacher(4,"Zach"),
      Student(5,"Nate"),
      Student(6,"Caterina"),
      Teacher(7,"Sam"),
      Student(8,"Emily")
    )
  }

  def getById(id:Long):Option[User] = {
    val index = (id - 1).toInt
    Some(fakes(index))
  }

  def in[G<:Group](group:G):Boolean = {
    group match {
      case team:SportsTeam => SportsTeam.check(user)
      case jail:Jail => {
        jail match {
          case MaximumSecurity(name:String) => MaximumSecurity.check()
          case MinimumSecurity(name:String) => MinimumSecurity.check()
          case _ => {}
        }
      }
    }
  }

}
