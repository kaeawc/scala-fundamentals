
sealed trait Gender {
  val name:String
}

object Gender {
  case object Male extends Gender { val name = "Male" }
  case object Female extends Gender { val name = "Female" }
  case object Unknown extends Gender { val name = "Unknown" }
}
