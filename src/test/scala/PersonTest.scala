import java.time.{LocalDateTime, Month}

import org.specs2.mutable.Specification

class PersonTest extends Specification {

  "getAge" should {
    "return age" in {
      val child = new Person("jil", LocalDateTime.of(2015, Month.JANUARY, 25, 6, 30))
      println(s"dob  ${child.dob}")
      println(s"firstName ${child.firstName}")
      child.firstName = "Apple";
      println(s"firstName ${child.firstName}")

      child.getAge(LocalDateTime.of(2019, Month.JANUARY, 25, 6, 30)) must equalTo(4)
    }
  }
}
