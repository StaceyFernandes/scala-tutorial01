import org.specs2.mutable.Specification

class ComparerTest extends Specification {

  "compareFirstNumberIsGreaterThanSecond" should {
    "return true" in {
      new Comparer().compare(3, 2) == true
    }
  }
  "compareFirstNumberIsLessThanSecond" should {
    "return false" in {
      new Comparer().compare(2, 2) == false
    }
  }
}
