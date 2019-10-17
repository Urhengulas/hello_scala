object Main extends App {
  var x: Int = 1
  def add(x: Int, y: Int): Int = x + y
  println({
    x = add(x, 5)
    x
  })
}
