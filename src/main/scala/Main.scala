object Main extends App {
  object IdleFactory {
    private var counter = 0
    def create(): Int = {
      counter += 1
      counter
    }
  }
  val newId: Int = IdleFactory.create()
  println(newId)
  val newerId: Int = IdleFactory.create()
  println(newerId)
}
