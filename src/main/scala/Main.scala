object Main extends App {
  println({
    val x: Int = 1
    val addOne = (x: Int) => x + 1
    addOne(x)
  })
}
