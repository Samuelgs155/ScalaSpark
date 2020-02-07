package collections

object ListBasicOperations {

  def main(args: Array[ String ]): Unit = {
    val fruits = "apples" :: ("oranges" :: ("pears" :: Nil))
    val nums = Nil

    println("Head of fruit : " + fruits.head)
    println("Tail of fruit : " + fruits.tail)
    println("Check if fruit is empty : " + fruits.isEmpty)
    println("Check if nums is empty : " + nums.isEmpty)
  }
}
