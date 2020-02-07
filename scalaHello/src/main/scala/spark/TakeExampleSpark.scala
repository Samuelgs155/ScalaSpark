package spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object TakeExampleSpark {

  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext(new SparkConf().setMaster("local[1]").setAppName("TakeExampleSpark"))

    val numbers = List(1,2,3,4,5,6)
    val numbersRDD = sc.parallelize(numbers)

    val evenNumbers = numbersRDD.filter(x => x % 2 == 0)
    val numberFromTake = evenNumbers.take(5)
    for(num <- numberFromTake) {
      print(num + " ")
    }



  }
}
