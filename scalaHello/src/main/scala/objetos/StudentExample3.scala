package objetos

object StudentExample3 {

  def main(args: Array[ String ]): Unit = {
    var s = new Student3(100, "Sam", 20);
    s.show()

  }
}

class Student3 (id:Int, name:String){
  var age: Int = 0;
  def show(): Unit ={
    println(id + " " + name + " " + age)
  }

  def this(id:Int, name:String, age:Int){
    this(id, name);
    this.age = age
  }
}
