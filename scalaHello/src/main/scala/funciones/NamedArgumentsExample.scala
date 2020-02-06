package funciones

object NamedArgumentsExample {
  def main(args: Array[ String ]): Unit = {
    printIn(b = 5, a = 7)
  }

  def printIn( a: Int, b: Int): Unit = {
    println("Value of a: " + a)
    println("Value of b: " + b)

  }
}
