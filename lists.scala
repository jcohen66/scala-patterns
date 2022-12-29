object Lists extends App {
    def patternMatching(list: List[Int]): String = {
        list match {
            case Nil => "List has no elements"
            case _ :: Nil => "List has only one element"
            case first :: second :: Nil => s"List has two elements what are $first and $second"
            case _ :: _ :: _ :: Nil => "List has three elements."
            case _ :: rest => s"List elements except first elements are $rest"
        }
    }
    println(patternMatching(list = List.empty))
    println(patternMatching(list = List(1)))
    println(patternMatching(list = List(1, 2)))
    println(patternMatching(list = List(1,2,3)))
    println(patternMatching(list = List(1,2,3,4,5)))

}