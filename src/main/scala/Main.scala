object Main extends App {
  var x: Int = 1

  def getRandInt: Int =
    scala.util.Random.nextInt()

  println({
    getRandInt
  })
}
