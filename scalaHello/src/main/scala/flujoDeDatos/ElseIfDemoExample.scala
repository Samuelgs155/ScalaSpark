package flujoDeDatos

object ElseIfDemoExample {

  def main(args: Array[ String ]): Unit = {
    var x = 30;
    if(x == 10) {
      println("The value of X is 10");
    } else if(x == 20) {
      println("The value of X is 20");
    } else if(x == 30) {
      println("The value of X is 30");
    } else {
      println("This is else statement");
    }
  }
}
