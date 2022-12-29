object Wildcards extends App {
    def patternMatching(variable: Any): String = {
        variable match {
            case _: Int => "Variable is of type Integer"
            case _ => "Variable is of some other type"
        }
    }

    println(patternMatching(1))
    println(patternMatching(null))
}