package spark

import org.apache.spark.{SparkConf, SparkContext}

object EnglandAndArgentinaPlayersClub {

  def main(args: Array[String]): Unit = {

    /*
    Create a Spark program to read the player data from in/worldcupplayerinfo_20140701.tsv,  find all the clubs who belong to England And Argentina.
    Then output the player's name and country to out/clubs_in_england_and_argentina.


    Each row of the input file contains the following columns:
    Group	Country	Rank	Jersey	Position	Age	Selections	Club	Player	Captain
    Sample output:
    West Bromwich Albion Celtic   Manchester City  Manchester United  Chelsea   Liverpool   Everton   Southampton   Everton   Manchester United  Southampton   Arsenal   Chelsea   Arsenal   Manchester City  Liverpool   Liverpool   Everton   Liverpool   Liverpool   Manchester United  Southampton   Manchester United  20/02/07 13:31:34 INFO Executor: Finished task 0.0 in stage 0.0 (TID 0). 1158 bytes result sent to driver
    Boca Juniors  Catania   Monaco   Benfica   Napoli   Internazionale   Monterrey   Sporting   Manchester City  Manchester City  Real Madrid  Celta Vigo  Benfica   Boca Juniors  Barcelona   Lazio   Newell's Old Boys Internazionale   Paris Saint-Germain  Napoli   Barcelona   Internazionale   Manchester City
    Manchester City
    */


    val sc = new SparkContext(new SparkConf().setMaster("local[1]").setAppName("PlayersFromBrazilAndMexico"))
    val rawData = sc.textFile("in/worldcupplayerinfo_20140701.tsv")

    //remove first line
    val validRows = rawData.filter(line => !line.startsWith("Group"))

    //Get required data
    val englandPlayers = validRows.filter(car => car.split("\\t")(1).equalsIgnoreCase("england"))
    val argentinaPlayers = validRows.filter(car => car.split("\\t")(1).equalsIgnoreCase("argentina"))

    val englandPlayersClub = englandPlayers.map(line => line.split("\\t")(7))
    val argentinaPlayersClub = argentinaPlayers.map(line => line.split("\\t")(7))

    // show data
    englandPlayersClub.foreach(x => print(x))
    println()
    argentinaPlayersClub.foreach(x => print(x))
    println()

    // show common clubs
    val uniqueClubNames = englandPlayersClub.intersection(argentinaPlayersClub)
    uniqueClubNames.foreach(x => print(x))
    println()

    //playerInfo.saveAsTextFile("out/players_in_brzil_and_mexico")


  }
}
