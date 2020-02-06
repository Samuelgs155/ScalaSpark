package bucles

object ForLoopCollectionsExample {
  def main(args: Array[ String ]): Unit = {
    // Local variable declaration
    var a = 0;
    val numList = List(1,2,3,4,5,6);

    // for loop execution with range
    for( a <- numList) {
      println("Value of a: " + a);
    }

  }
}
