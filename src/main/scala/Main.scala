trait Greeter {
  def greet(name: String): Unit =
    println("Hello, " + name + "!")
}

class CustomizableGreeter(prefix: String, postfix: String) extends Greeter {
  override def greet(name: String): Unit = {
    println(prefix + name + postfix)
  }
}

object Main extends App {

  class DefaultGreeter extends Greeter
  val greeter = new DefaultGreeter()
  greeter.greet("Sméagol")

  val customGreeter = new CustomizableGreeter("Ciao, ", " :c")
  customGreeter.greet("Bilbo")
}
