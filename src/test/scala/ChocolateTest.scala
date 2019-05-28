import org.specs2.mutable.Specification

class ChocolateTest extends Specification {

  "ChocolateTest" should {
    "returns Chocolate with no arguments" in {
      val chocolateDefault = Chocolate()
      chocolateDefault.name must equalTo("Cadbury")
      chocolateDefault.color must equalTo("Dark")
      chocolateDefault.size must equalTo(1)
    }

    "constructor returns Chocolate with given name" in {
      val chocolateOneArgument = Chocolate("kitkat")
      chocolateOneArgument.name must equalTo("kitkat")
      chocolateOneArgument.color must equalTo("Dark")
      chocolateOneArgument.size must equalTo(1)
    }

    "constructor return Chocolate with given name and given color" in {
      val chocolateOneArgument = Chocolate("m&m", "White")
      chocolateOneArgument.name must equalTo("m&m")
      chocolateOneArgument.color must equalTo("White")
      chocolateOneArgument.size must equalTo(1)
    }

    "returns a new Chocolate from old" in {
      val chocolateFerrero = Chocolate("Ferrero")
      val anotherFererro = chocolateFerrero.copy("FerreroTwo")
      chocolateFerrero mustNotEqual(anotherFererro)
    }

  }
}
