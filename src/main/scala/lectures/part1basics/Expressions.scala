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

  // Instructions (DO) vs Expressions (VALUE)

  // IF expression
  val aCondition = true
  val aConditionedValue = if(aCondition) 5 else 3 // IF EXPRESSION
  println(aConditionedValue)
  print(if(aCondition) 5 else 3)
  println(1 + 3)

  var i = 0
  val aWhile = while (i < 10) {
    println(i)
    i += 1
  }

  // NEVER WRITE THIS AGAIN

  // EVERYTHING IN SCALA IS AN EXPRESSION!

  val aWeirdValue = (aVariable = 3) // Unit == void
  print(aWeirdValue)

  // side effects: println(), whiles, reassigning

  // Code blocks

  val aCodeBlock = {
    val y = 2
    val z = y + 1
    if (z > 2) "Hello" else "GoodBye"
  }

  // CODE BLOCKS ARE EXPRESSIONS!
  // VALUE OF CODE BLOCKS, ARE THE VALUE OF THE LAST EXPRESSION
  // CODE BLOCKS HAVE THEIR OWN DEFINITION OF VALUES AND VARIABLES DEFINED WITHIN THAT CODE BLOCK
  // VALUES AND VARIABLES DEFINED WITHIN CODE BLOCKS ARE ONLY DEFINED WITHIN THAT BLOCK, AND CANNOT BE SCENE OUTSIDE

}