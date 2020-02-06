package objetos

object CaseClass {

  case class Person(name: String, city: String);

  def main(args: Array[ String ]): Unit = {
    val p1 = Person("Sam", "NY");
    val p2 = p1.copy();
    println(p2)
    println(p1)
    println(p1 == p2)

  }
}


