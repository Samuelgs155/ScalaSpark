package funciones

object RecursiveFunctionsExample {

  def main(args: Array[ String ]): Unit = {
    for(i <- 1 to 10) {
      println("Factorial of " + i + ": = " + factorial(i) )
    }
  }

    def factorial( i: Int): Int = {
      if(i <= 1) {
        1
      } else {
        i * factorial(i - 1)
      }
    }


}
