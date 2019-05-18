class CatComparer extends ComparerTrait[Cat] {
  override def compare(cat1: Cat, cat2: Cat): Boolean = cat1.age > cat2.age
}

