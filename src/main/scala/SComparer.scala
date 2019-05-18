class SComparer extends SComparerTrait[Int] {
  def compare(num1: Int, num2: Int): Boolean = {
    if (num1 > num2) true
    else false
  }
}
