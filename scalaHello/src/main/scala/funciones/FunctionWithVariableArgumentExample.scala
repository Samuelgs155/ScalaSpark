package funciones

import funciones.NamedArgumentsExample.printIn

object FunctionWithVariableArgumentExample {

  def main(args: Array[ String ]): Unit = {
    printStrings("Scala", "Hello", "Python")
  }

    def printStrings( args: String*): Unit = {
      var i: Int = 0
      for(arg <- args) {
        println("Arg value[" + i + "] = " + arg)
        i += 1;
      }
    }


}
