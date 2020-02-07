package spark

import org.apache.spark.{SparkConf, SparkContext}

object CollectExampleSpark {

  def main(args: Array[String]): Unit = {


    val sc = new SparkContext(new SparkConf().setMaster("local[1]").setAppName("CollectExample"))

    val fruits = List("Banana", "Mango", "Strawberry", "Cherry", "Apple")
    val fruitRDD = sc.parallelize(fruits)

    val collectedFruits = fruitRDD.collect()
    collectedFruits.foreach(fruit => println(fruit))


  }
}
