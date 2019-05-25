import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

case class CasePerson(firstName: String, dob: LocalDateTime) {
  def getAge(asOf: LocalDateTime = LocalDateTime.now()): Long = dob.until(asOf, ChronoUnit.YEARS)

  object CasePerson {
    def apply(
               firstName: String,
               lastName: String,
               dob: LocalDateTime
             ): CasePerson = {
      CasePerson(firstName, lastName, dob)
    }

    def apply(
               firstName: String,
               dob: LocalDateTime,
               eyeColor: String
             ): CasePerson = {
      CasePerson(firstName, dob, eyeColor)
    }
  }
}
