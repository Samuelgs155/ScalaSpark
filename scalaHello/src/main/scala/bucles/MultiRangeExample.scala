package bucles

object MultiRangeExample {
  def main(args: Array[ String ]): Unit = {
    // Local variable declaration
    var a = 0;
    var b = 0;

    // for loop execution with range
    for( a <- 1 to 3; b <- 1 to 3) {
      println("Value of a: " + a)
      println("Value of b: " + b)
    }

  }
}
