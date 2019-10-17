object Main extends App {
  var x: Int = 1
  def addThenMultiply(x: Int, y: Int)(multiplier: Int): Int =
    (x + y) * multiplier
  println({
    x = addThenMultiply(x, 5)(3)
    x
  })
}
