import org.specs2.mutable.Specification

class SComparerTest extends Specification {

  "compareFirstNumberIsGreaterThanSecond" should {
    new SComparer().compare(3,2) == true
  }

  "compareFirstNumberIsLessThanSecond" should {
    new SComparer().compare(1,2) == false
  }
}
