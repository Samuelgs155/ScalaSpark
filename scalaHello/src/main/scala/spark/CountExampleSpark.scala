package spark

import org.apache.log4j.{Level, Logger}
import org.apache.spark.{SparkConf, SparkContext}

object CountExampleSpark {

  def main(args: Array[String]): Unit = {

    Logger.getLogger("org").setLevel(Level.ERROR)
    val sc = new SparkContext(new SparkConf().setMaster("local[1]").setAppName("CountExampleSpark"))

    val words = List("Hadoop", "Spark", "Spark", "kafka", "Apache", "Apache")
    val wordRDD = sc.parallelize(words)

    wordRDD.countByValue().foreach(word => println(word))

    for((word, count) <- wordRDD.countByValue()) println(word + " " + count)


  }
}
