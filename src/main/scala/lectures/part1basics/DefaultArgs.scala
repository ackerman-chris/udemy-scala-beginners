package lectures.part1basics

object DefaultArgs extends App {

  def trFact(n: Int, acc: Int): Int =
    if (n <= 1) acc
    else trFact(n-1, n*acc)

  val face10 = trFact(10, 2)

  def savePicture(format: String = "jpg", width: Int, height: Int): Unit = println("saving picture")
    savePicture("jpg", 1920, 1080)
    

}
