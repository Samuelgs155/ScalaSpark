package bucles

object ForLoopExample {
  def main(args: Array[ String ]): Unit = {
    // Local variable declaration
    var a = 0;

    // for loop execution with range
    for( a <- 1 to 10) {
      println("Value of a: " + a)
    }

  }
}
