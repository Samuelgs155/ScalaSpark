package bucles

object DoWhileExample {
  def main(args: Array[ String ]): Unit = {
    // Local variable declaration
    var a = 10;

    // while loop execution
    do {
      println("Value of a: " + a);
      a += 1;
    } while( a < 20)

  }
}
