package objetos

object StudentExample {

  def main(args: Array[ String ]): Unit = {
    var s = new Student();
    println(s.id + " " + s.name)

  }
}

class Student {
  var id: Int = 0;
  var name: String = null;
}
