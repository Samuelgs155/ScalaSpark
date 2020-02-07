package arrays

import scala.collection.mutable.ArrayBuffer

object MutableArray {

  def main(args: Array[ String ]): Unit = {
    val fruits = new ArrayBuffer[String]()
    fruits += "Apple"
    fruits += "Banana"
    fruits += "Orange"
    fruits.foreach(fruit => print(fruit + " "))
  }
}
