object Main extends App {
  class Greeter(prefix: String, suffix: String) {
    def greet(name: String): Unit = println(prefix + " " + name + " " + suffix)
  }
  val greeter = new Greeter("Hello", "<3")
  greeter.greet("Ada Lovelace")
}
