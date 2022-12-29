object Typed extends App {
    def patternMatching(anyTypeVariable: Any): Any = {
        anyTypeVariable match {
            case stringVariable: String => stringVariable.length
            case mapVariable: Map[_, _] => mapVariable.size
            case arrayVariable: Array[_] => arrayVariable.length
            case listVariable: List[_] => listVariable.size
            case _ => s"Undefined type"
        }
    }
    println(patternMatching(anyTypeVariable = ("Mansi Babbar")))
    println(patternMatching(anyTypeVariable = Map(1 -> "One", 2 -> "Two", 3 -> "Three")))
    println(patternMatching(anyTypeVariable = Array(3, 6, 9, 15)))
    println(patternMatching(anyTypeVariable = List('A', 'B', 'C', 'D', 'E')))
    println(patternMatching(anyTypeVariable =(10, "Twenty")))


}