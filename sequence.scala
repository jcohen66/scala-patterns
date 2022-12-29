object Sequences extends App {
    def patternMatching(sequence: Any): String = {
        sequence match {
            case List(singleElement) => s"List with one element.  Value: $singleElement"
            case List(_, _*) => s"List with one or more elements.  Sequence: $sequence"
            case Vector(1, 2, _*) => s"Vector with two or more elements.  Sequence: $sequence"
            case Array(singleElement) => s"Array with one element.  Value: $singleElement"
            case _ => s"Unrecognizeed sequence.  Sequence: $sequence"
        }
    }
    println(patternMatching(sequence = List(1)))
    println(patternMatching(sequence = List(1,2,3)))
    println(patternMatching(sequence = Vector(1, 2)))
    println(patternMatching(sequence = Array(10)))
    println(patternMatching(sequence = (2,4)))

}