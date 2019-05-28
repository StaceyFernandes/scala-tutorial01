object PizzaClassTest extends App {

  val a = PizzaCase()         // corresponds to apply()
  val b = PizzaCase("Pam")    // corresponds to apply(name: String)
  val c = PizzaCase("William Shatner", 82)

  println(a)
  println(b)
  println(c)

  // verify the setter methods work
  a.name = "Leonard Nimoy"
  a.age = 82
  println(a)
}