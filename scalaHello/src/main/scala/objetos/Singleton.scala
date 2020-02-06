package objetos

object Singleton {

  def main(args: Array[ String ]): Unit = {
    SingletonObject.hello();

  }
}

object SingletonObject {

  def hello() {
    println("Hello, this is Singleton Object")
  }
}
