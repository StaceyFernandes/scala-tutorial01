case class Chocolate(name: String, color: String, size: Int)

object Chocolate {
  //have a no argument constructor
  def apply(): Chocolate = Chocolate("Cadbury", "Dark", 1)

  //have a one argument constructor
  def apply(name: String): Chocolate = Chocolate(name, "Dark", 1)

  //have another constructor
  def apply(name: String, color: String): Chocolate = Chocolate(name, color, 1)
}