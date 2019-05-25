import org.specs2.mutable.Specification

class IntComparerTest extends Specification {

  "compareFirstNumberIsGreaterThanSecond" should {
    "return true" in {
      new IntComparer().compare(3, 2) == true
    }
  }
  "compareFirstNumberIsLessThanSecond" should {
    "return false" in {
      new IntComparer().compare(2, 2) == false
    }
  }
}
