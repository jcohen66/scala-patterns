object Options extends App {
    def patternMatching(option: Option[String]): String = {
        option match {
            case Some(value) => s"Not an empty option. value: $value"
            case None => "Empty option"
        }
    }
    println(patternMatching(option = Option("Hello")))
    println(patternMatching(option = Option(null)))

}