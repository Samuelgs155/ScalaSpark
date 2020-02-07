package spark

import org.apache.spark.{SparkConf, SparkContext}

object CarsInAmerica {

  def main(args: Array[String]): Unit = {

    /*
        Create a Spark program to read the car data from in/cars.csv,  find all the cars whose origin is America.
        Then output the car's model and the car's year of manufacture to out/cars_in_america.

        Each row of the input file contains the following columns:
        Model,MPG,Cylinders,Engine Disp,Horsepower,Weight,Accelerate,Year,Origin
        Sample output:
        amc ambassador dpl,15.0,8,390,190,3850,8.5,70,American
         ...
    */

    val sc = new SparkContext(new SparkConf().setMaster("local[1]").setAppName("CarsInAmerica"))
    val rawData = sc.textFile("in/cars.csv")

    //remove first line
    val validRows = rawData.filter(line => !line.startsWith("#"))

    //Get required data
    val filteredData = validRows.filter(car => car.split(",")(8).equalsIgnoreCase("American"))
    //filteredData.foreach(line => println(line))

    //get model and year
    val carsWithModelNameAndYear = filteredData.map(car => car.split(",")(0) + ",19" + car.split(",")(7))
    carsWithModelNameAndYear.foreach(line => println(line))

    //save in text file
    carsWithModelNameAndYear.saveAsTextFile("out/cars_in_america")


  }
}
