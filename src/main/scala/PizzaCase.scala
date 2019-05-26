case class PizzaCase (var name: String, var age: Int)

// the companion object
object PizzaCase {

  def apply() = new PizzaCase("<no name>", 0)
  def apply(name: String) = new PizzaCase(name, 0)

}


