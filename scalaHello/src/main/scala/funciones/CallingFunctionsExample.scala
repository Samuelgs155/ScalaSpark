package funciones

object CallingFunctionsExample {
  def main(args: Array[ String ]): Unit = {
    println("Returned value: " +  addInt(5,7))
  }

  def addInt( a: Int, b: Int): Int = {
    var sum:Int = 0;
    sum = a + b;
    return sum;
  }
}
