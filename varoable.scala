object Variable extends App {
    def patternMatching(variable: Any): String = {
        variable match {
            case 0 => "Variable is zero"
            case nonZero => s"Variable is not zero and equal to $nonZero"
        }
    }
    println(patternMatching(variable = 0))
    println(patternMatching(variable = 1))

}