import org.specs2.mutable.Specification

class CatComparerTest extends Specification {

  "FirstCatAgeGreaterThanSecond" should {
    "returns true" in {
      val cat1 = new Cat("cat", 3, "somecat")
      val cat2 = new Cat("catk", 2, "somecat2")

      val catComparer = new CatComparer
      catComparer.compare(cat1, cat2)
    }

  }

  "FirstCatAgeLessThanSecond" should {
    "return false" in {
      val cat1 = new Cat("cat", 1, "somecat")
      val cat2 = new Cat("catk", 2, "somecat2")

      val catComparer = new CatComparer
      !catComparer.compare(cat1, cat2)
    }

  }
}
