package objetos

object StudentExample2 {

  def main(args: Array[ String ]): Unit = {
    var s = new Student2(100, "Sam");
    s.show()

  }
}

class Student2 (id:Int, name:String){

  def show(): Unit ={
    println(id + " " + name)
  }
}
