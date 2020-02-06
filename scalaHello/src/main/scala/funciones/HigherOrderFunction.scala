package funciones

object HigherOrderFunction {
  def main(args: Array[ String ]): Unit = {
    println( sum(id, 1, 5));
    println( sum(square, 1, 5));
    println( sum(cube, 1, 5));
  }

  def id(i: Int) = 1
  def square(i: Int) = math.pow(i, 2).toInt
  def cube(i: Int) = math.pow(i, 3).toInt

  def sum( func: Int => Int, start: Int, end: Int): Int = {
    var result = 0
    for(e <- start to end) {
      result = result + func(e)
    }
    result
  }
}
