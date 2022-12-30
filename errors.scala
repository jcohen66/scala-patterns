object PatternMatchingErrors extends App {
    def patternMatching(variable: Any): String = {
        // More specific cases must appear before less specific
        // or they will never get a chance to match.
        variable match {
            case _: Seq[_] => "Variable is of type Sequence"
            case _: List[_] => "Variable is of type List"
            case _: Vector[_] => "Variable is of type Vector"
        }
    }
    println(patternMatching(variable=List(1,2,3)))
    // Triggers MatchError
    println(patternMatching(variable=Map("first" -> "Mansi", "last" -> "Babbar")))
}


