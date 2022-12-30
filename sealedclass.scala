// Define all subclasses in the same file
sealed abstract class CardSuit
case class Spike() extends CardSuit
case class Club() extends CardSuit
case class Heart() extends CardSuit
case class Diamond() extends CardSuit

object SealedClass extends App {
    // No default behavior.
    def sealedClass(cardsuit: CardSuit): String = {
        cardsuit match {
            case Spike() => "Card is Spike"
            case Club() => "Card is Club"
            case Heart() => "Card is Heart"
            case Diamond() => "Card is Diamond"
        }
    }
    println(sealedClass(Spike()))
    println(sealedClass(Club()))
    println(sealedClass(Heart()))
    println(sealedClass(Diamond()))
    
}