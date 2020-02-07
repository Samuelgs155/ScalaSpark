package collections

object SetOperations {

  def main(args: Array[ String ]): Unit = {

    val fruits1 = Set("apples", "oranges", "pears")
    val fruits2 = Set("mangoes", "bananas", "apples")

    // use two or more sets with ++ as operatos
    var fruits = fruits1 ++ fruits2
    println("fruits1 ++ fruits2  : " + fruits)

    // use two or more sets with ++ as methos
    fruits = fruits1.++(fruits2)
    println("fruits1.++(fruits2)  : " + fruits)
  }
}
