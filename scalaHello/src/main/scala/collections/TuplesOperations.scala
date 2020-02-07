package collections

object TuplesOperations {

  def main(args: Array[ String ]): Unit = {

    val t = (4,3,2,1)
    val sum = t._1 + t._2 + t._3 + t._4
    println("Sum of elements : " + sum)

    // iterate over tuple
    t.productIterator.foreach(i => println("Value = " + i))

    // converting to string
    println("Concatenated String: " + t.toString())

    val t1 = new Tuple2("Scala", "hello")
    // swap the elements
    println("Swapped Tuple: " + t1.swap)
  }
}
