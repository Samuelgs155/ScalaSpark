package objetos

object ComparasionClass {


  def main(args: Array[ String ]): Unit = {
    var aMain: Main = new Main();
    aMain.sayHelloWorld()
    Main.sayHi()

  }

  class Main {
    def sayHelloWorld(): Unit = {
      println("Hello World")
    }
  }

  object Main {
    def sayHi(): Unit = {
      println("Hi")
    }
  }
}


