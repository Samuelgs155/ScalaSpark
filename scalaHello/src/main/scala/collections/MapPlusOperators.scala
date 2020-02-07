package collections

object MapPlusOperators {

  def main(args: Array[ String ]): Unit = {
    var tasks : Map[Int, String] = Map()
    tasks += (1 -> "Get up from bed")
    tasks += (2 -> "Eat breakfast")
    println("Map contents : " + tasks)

  }
}
