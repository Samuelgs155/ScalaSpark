package collections

object ListOperations {

  def main(args: Array[ String ]): Unit = {
    // list of Strings
    val fruits: List[String] = List("apples","oranges","pears")

    // list of Integers
    val nums: List[Int] = List(1,2,3,4)

    // Empty list
    val empty: List[Nothing] = List()

    // Two dimensions llist
    val dim: List[List[Int]] =
      List(
        List(1,0,0),
        List(1,0,0),
        List(1,0,0)
    )
  }
}
