package part1basics

/**
 * Created by Christopher on 09-April-22
 */
object ValuesVariablesTypes extends App {

  val x: Int = 42
  println(x)

  // VALS ARE IMMUTABLE

  // COMPILER CAN INFER TYPES

  val aString: String = "Hello"
  val anotherString = "Goodbye"
  println(aString + " " + anotherString)

  // TYPES

  val aBoolean: Boolean = false
  val aChar: Char = 'a'
  val anInt: Int = x
  val aSHort: Short = 3567
  val aLong: Long = 46589874465897797L
  val aFloat: Float = 2.0f
  println(aFloat)
  val aDouble: Double = 3.14
  println(aDouble)

  var aVariable: Int = 4

  // VARS ARE MUTABLE

  aVariable = 5 // side effects


}
