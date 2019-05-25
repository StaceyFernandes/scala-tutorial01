import java.time.{LocalDateTime, Month}

import org.specs2.mutable.Specification

class CaseCatTest extends Specification {

  "getAge" should {
    "return cats age" in {
      val cat = CaseCat("Pino", "smallCat", LocalDateTime.of(2014, 1,1,1,1,1), "big")
      val cat2 = CaseCat.apply("fd","dfs",LocalDateTime.now,"small")

      cat.getAge(LocalDateTime.of(2019, Month.JANUARY, 25, 6, 30)) must equalTo(5)
      cat2.size must equalTo("small")
    }
  }
}
