package lectures

object Expressions extends App {

  val x = 1 + 2 //EXPRESSION
  println(x)

  println(2 + 3 * 4)
  // + - * / &  ^ << >> >>> (right shift with zero extensions)

  println(1 == x)
  // == != > >= < <=

  println(! (1 == x))
  // ! && ||

  var aVariable = 2
  aVariable += 3 // also works with -= *= /+ ..... side effects
  println(aVariable)

  

}
