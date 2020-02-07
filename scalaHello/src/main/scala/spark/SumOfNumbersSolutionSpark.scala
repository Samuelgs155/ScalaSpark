package spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object SumOfNumbersSolutionSpark {

  def main(args: Array[String]): Unit = {

    /* Create a Spark program to read the first 100 prime numbers from in/prime_nums.txt,
       print the sum of those numbers to console.

       Each row of the input file contains 10 prime numbers separated by spaces.
     */

    Logger.getLogger("org").setLevel(Level.OFF)

    val conf = new SparkConf().setAppName("primeNumbers").setMaster("local[*]")
    val sc = new SparkContext(conf)

    val lines = sc.textFile("in/prime_nums.txt")

    val numbers = lines.flatMap(line => line.split("\\s+"))

    val validNumbers = numbers.filter(number => !number.isEmpty)

    val intNumbers = validNumbers.map(number => number.toInt)

    println("Sum is: " + intNumbers.reduce((x, y) => x + y))



  }
}
