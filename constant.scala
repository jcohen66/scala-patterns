object Constant extends App {
    def patternMatching(constant: Any): String = {
        constant match {
            case 0 => "I'm equal to zero"
            case 4.5d => "I'm a double"
            case "hello" => "I'm a string"
            case false => "I'm the contrary of true"
            case Nil => "I'm an empty list"
            case _ => s"I'm unknown and equal to $constant"
        }
    }
    println(patternMatching(constant = 0))
    println(patternMatching(constant = 4.5d))
    println(patternMatching(constant = "hello"))
    println(patternMatching(constant = false))
    println(patternMatching(constant = Nil))
    println(patternMatching(constant = Option(1)))



}