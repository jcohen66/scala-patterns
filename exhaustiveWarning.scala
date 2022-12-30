sealed abstract class BaseClass
case class SubClassOne() extends BaseClass
case class SubClassTwo() extends BaseClass
case class SubClassThree() extends BaseClass

object ExhaustiveMapWarning extends App {
    def patternMatching(classObject: BaseClass): String = {
        // will raise 'match may not be exhaustive warning'
        classObject match {
            case SubClassOne() => "Belongs to first sub class"
            case SubClassTwo() => "Belongs to second sub class"
            // this makes warning go away
            case _:BaseClass => "Some other sub class"

        }
    }
    println(patternMatching(SubClassOne()))

}