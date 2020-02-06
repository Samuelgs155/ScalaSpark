package flujoDeDatos

object NestedIfExample {

  def main(args: Array[ String ]): Unit = {
    var x = 30;
    var y = 10;
    if(x == 30) {
      if(y==10){
        println("The value of X is 10 and the value of Y is 10");
      }
    }
  }
}
