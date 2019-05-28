import java.time.{LocalDateTime, Month}

import org.specs2.mutable.Specification

object CaseCatTest extends Specification {

  "getAge" should {
    "return cats age" in {
      val cat = CaseCat("Pino", "smallCat", LocalDateTime.of(2014, 1, 1, 1, 1, 1), new Big)
      val cat2 = CaseCat.apply("Small", "small", LocalDateTime.of(2000, 1, 1, 1, 1, 1), new Small)
      val cat2grown = cat2.copy("Big", "small", LocalDateTime.of(2000, 1, 1, 1, 1, 1), new Medium)

      cat.getAge(LocalDateTime.of(2019, Month.JANUARY, 25, 6, 30)) must equalTo(5)
      cat2.size must equalTo("small")
      cat2grown.size must equalTo("medium")
    }
  }

  "copy Cat" should {
    "copy a brand new cat and not use old cat" in {
      val oldCat = CaseCat("Molly", "smallish", LocalDateTime.of(2000,1,1,1,1))
      val newCat = oldCat.copy("holly", "smallish", LocalDateTime.of(2000,1,1,1,1))

      oldCat.should_!=(newCat)
    }
  }

  "case Cat" should {
    "have a no argument constructor" in {
      val anotherConstructorCat = CaseCat()
      anotherConstructorCat must equalTo(anotherConstructorCat.copy())
    }
    "have a constructor that sets default size to small" in {
      val anotherConstructorCat = CaseCat("Chilli", "sotiny", LocalDateTime.of(2000,1,1,1,1))
      anotherConstructorCat.size must equalTo("small")
    }
    "return default size of small because default param never gets used over .apply constructor" in {
      val anotherConstructorCat = CaseCat("Chilli", "sotiny", LocalDateTime.of(2000,1,1,1,1))
      anotherConstructorCat.size must equalTo("small")
    }
    "return default breed if it is not set" in {
      val anotherCat =  CaseCat("Rex", breed= "German shepherd" ,LocalDateTime.of(2000,1,1,1,1))
      anotherCat.breed must beEqualTo("German")
    }
  }
}
