import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

class Person(var firstName: String, val dob: LocalDateTime)  {
  def getAge(asOf: LocalDateTime = LocalDateTime.now()): Long = dob.until(asOf,ChronoUnit.YEARS)
}
