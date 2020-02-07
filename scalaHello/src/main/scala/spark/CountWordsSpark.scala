package spark

import org.apache.spark.{SparkConf, SparkContext}

object CountWordsSpark {

  def main(args: Array[String]): Unit = {

    val conf = new SparkConf().setMaster("local[1]").setAppName("ScalaSparkHelloWorld")
    val sc = new SparkContext(conf)
    sc.setLogLevel("ERROR")

    val lines = sc.textFile("in/word_count.txt")
    val words = lines.flatMap(line => line.split(" "))

    val wordCounts = words.countByValue()
    for((word, count) <- wordCounts) println(word + " : " + count)


  }
}
