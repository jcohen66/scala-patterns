object PatternGuard extends App {
    def patternGuards(toMatch: Any, maxLength: Int): String = {
        toMatch match {
            case list: List[_] if list.size <= maxLength => "List of acceptable size"
            case _: List[_] => "List has not an acceptable size"
            case string: String if string.length <= maxLength => "String is of acceptable size"
            case _: String => "String has not an acceptable size" 
            case _ => "Input is neither a List nor a String"
        }
    }
    println(patternGuards(toMatch=List(2,4,6,8), maxLength=5))
    println(patternGuards(toMatch=List(3,6,9,15,18), maxLength=5))
    println(patternGuards(toMatch="Good Morning", maxLength=15))
    println(patternGuards(toMatch="Good Morning World", maxLength=15))
    println(patternGuards(toMatch=100, maxLength=10))

}