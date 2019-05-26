import java.time.LocalDateTime
import java.time.temporal.ChronoUnit

case class CaseCat(
                    name: String,
                    breed: String = "German shepherd",
                    dob: LocalDateTime,
                    size: String = "big" //use the default named param
                  )
{
def getAge(asOf: LocalDateTime = LocalDateTime.now()):Long =  dob.until(asOf, ChronoUnit.YEARS)
}
//companion object
object CaseCat {
  //multiple constructors for case
  def apply() = new CaseCat("default", "Default", LocalDateTime.now(),"default")

  def apply(
             name: String,
             breed: String,
             dob: LocalDateTime): CaseCat = new CaseCat(name, breed, dob, "small") //this here takes precedence
  //over the size in the case class default param definition. 'big' never gets used
}

