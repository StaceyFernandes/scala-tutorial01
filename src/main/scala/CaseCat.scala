import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

case class CaseCat(
                    name: String,
                    breed: String,
                    dob: LocalDateTime,
                    size: String
                  ) {
  def getAge(asOf: LocalDateTime = LocalDateTime.now()):Long =  dob.until(asOf, ChronoUnit.YEARS)

  object CaseCat {
    def apply(name: String,
              breed: String,
              dob: LocalDateTime): CaseCat = {
      CaseCat(name, breed, dob, "small")
    }
    def apply(name: String,
              breed: String,
              dob: LocalDateTime,
              size: String): CaseCat = {
      CaseCat(name, breed, dob, size)
    }

    def apply(name:String,
              dob: LocalDateTime): CaseCat = {
      CaseCat(name, "superCat", dob, "minature")
    }
  }
}
