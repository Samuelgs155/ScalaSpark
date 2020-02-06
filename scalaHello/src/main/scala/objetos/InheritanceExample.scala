package objetos

object InheritanceExample {

  def main(args: Array[ String ]): Unit = {
    new Programmer()

  }
}

class Programmer extends Employee {
  var bonus: Int = 5000
  println("Salary = " + salary)
  println("Bonus = " + bonus)

}

class Employee {
  var salary:Float = 10000
}
