import java.time.{LocalDateTime, Month}

import org.specs2.mutable.Specification

class CaseCatTest extends Specification {

  "getAge" should {
    "return cats age" in {
      val cat = CaseCat("Pino", "smallCat", LocalDateTime.of(2014, 1, 1, 1, 1, 1), "big")
      val cat2 = CaseCat.apply("Small", "small", LocalDateTime.of(2000, 1, 1, 1, 1, 1), "small")
      val cat2grown = cat2.copy("Big", "small", LocalDateTime.of(2000, 1, 1, 1, 1, 1), "medium")

      cat.getAge(LocalDateTime.of(2019, Month.JANUARY, 25, 6, 30)) must equalTo(5)
      cat2.size must equalTo("small")
      cat2grown.size must equalTo("medium")
    }
  }
}
