package bucles

object ForLoopCollectionsWithFiltersExample {
  def main(args: Array[ String ]): Unit = {
    // Local variable declaration
    var a = 0;
    val numList = List(1,2,3,4,5,6,7,8,9,10);

    // for loop execution with range
    for( a <- numList) {
      if(a != 3 && a < 8) {
        println("Value of a: " + a);
      }
    }

  }
}
