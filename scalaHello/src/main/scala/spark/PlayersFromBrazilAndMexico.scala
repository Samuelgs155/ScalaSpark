package spark

import org.apache.spark.{SparkConf, SparkContext}

object PlayersFromBrazilAndMexico {

  def main(args: Array[String]): Unit = {

    /*
    Create a Spark program to read the player data from in/worldcupplayerinfo_20140701.tsv,  find all the players who belong to Brazil And Mexico.
    Then output the player's name and country to out/players_in_brzil_and_mexico.

    Each row of the input file contains the following columns:
    Group	Country	Rank	Jersey	Position	Age	Selections	Club	Player	Captain
    Sample output:
    A	Brazil	3	1	Goalie	31	9	Botafogo   	Jefferson	0
    ...
    */


    val sc = new SparkContext(new SparkConf().setMaster("local[1]").setAppName("PlayersFromBrazilAndMexico"))
    val rawData = sc.textFile("in/worldcupplayerinfo_20140701.tsv")

    //remove first line
    val validRows = rawData.filter(line => !line.startsWith("Group"))

    //Get required data
    val brazilPlayers = validRows.filter(car => car.split("\\t")(1).equalsIgnoreCase("brazil"))
    val mexicoPlayers = validRows.filter(car => car.split("\\t")(1).equalsIgnoreCase("mexico"))

    val brazilAndMexicoPlayers = brazilPlayers.union(mexicoPlayers)

    val playerInfo = brazilAndMexicoPlayers.map(line => line.split("\\t")(8) + "," + line.split("\\t")(1))

    playerInfo.foreach(word => println(word))
    //playerInfo.saveAsTextFile("out/players_in_brzil_and_mexico")


  }
}
