package traits

object SimpleTraitExample {

  def main(args: Array[ String ]): Unit = {
    var flyable: Flyable = new Bird();
    flyable.fly();

    var duck = new Duck();
    duck.swim()
    duck.quak()

  }
}

class Bird extends Flyable{

  override def fly(): Unit = {
    println("Bird is flying.")
  }
}

trait Flyable {
  def fly()
}

trait Speakable {
  def makeNoise(): Unit = {
    println("Generic sound.......")
  }
}

trait Quackable extends Speakable {
  override def  makeNoise(): Unit = {
    println("Quack Quack")
  }

  def quak(): Unit ={
    makeNoise()
  }

}

class Duck extends Quackable with Flyable {
  def swim(): Unit = {
    println("Duck is swimming...")
  }

  override def fly(): Unit = {
    println("Duck is flying")
  }
}