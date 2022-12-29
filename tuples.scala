object Tuples extends App {
    def patternMatching(tuple: Any): String = {
        tuple match {
            case (first, second) => s"Tuple with two elements.  Values: $first & $second"
            case (_, _, _) => s"Tuple with three elements."
            case _ => s"Unrecognized patterrn.  Value: $tuple"
        }
    }
    println(patternMatching(tuple = (1, "Two")))
    println(patternMatching(tuple = (1, "Two", 3.0)))
    println(patternMatching(tuple = List(1, 2, 3)))

}