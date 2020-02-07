package arrays

import scala.collection.mutable.ArrayBuffer

object ImmutableArray {

  def main(args: Array[ String ]): Unit = {
    // if you know all your array elements initially
    val games = Array("Football", "Cricket", "Hockey")
    for(i <- 0 until games.length) {
      println(i + " " + games(i))
    }

    // if you don't know the strings that you want in your array initially, but the size of your array
    val fruits = new Array[String](3)
    fruits(0) = "Apple"
    fruits(1) = "Banana"
    fruits(2) = "Orange"
    for(fruit <- fruits){
      print(fruit + " ")
    }

  }
}
