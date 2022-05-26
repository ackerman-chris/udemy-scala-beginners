package lectures.part2oop

import org.w3c.dom.css.Counter

/**
 * Created by Christopher on 23-May-2022
 */

object OOBasics extends App{
  val person = new Person("He", 27)
  println(person.x)
  person.greet("Christopher")
  person.greet()

  val author = new Writer("Jim", "Butcher", 1971)
  val novel = new Novel("Cold Days", 2012, author)

  println(novel.authorAge)
  println(novel.isWrittenBy(author))

  val counter = new Counter
  counter.inc.print

}

// constructor
class Person(name: String, val age: Int) {
  // body
  val x = 2

  println(1 + 3)

  // method
  def greet(name: String): Unit = println(s"${this.name} says Hi, $name")

  // overloading
  def greet(): Unit = println(s"Hi, I am $name")

  // multiple constructors
  def this(name: String) = this(name, 0)
  def this() = this("John Doe")
}

  /*
    Novel and a Writer

    Writer: first name, surname, year
      - method fullname

    Novel: name, year of release, author
      - authorAge
      - isWrittenBy(author)
      - copy (new year of release) = new instance of Novel

    */

class Writer(firstName: String, surname: String, val year: Int) {
  def fullName: String = firstName + " " + surname
  }

class Novel(name: String, year: Int, author: Writer) {
  def authorAge = year - author.year
  def isWrittenBy(author: Writer) = author == this.author
  def copy(newYear: Int): Novel = new Novel(name, newYear, author)
}

/*
  Counter Class
    - receives an int value
    - method current count
    - method to increment/decrement => new Counter
    - overload inc/dec to receive an amunt
*/
class Counter(val count: Int = 0) {
  def inc = {
    println("increment")
    new Counter(count + 1) // immutability
  }

  def dec = {
    println("decrement")
    new Counter(count - 1)
  }

  def inc(n: Int): Counter = {
    if (n <= 0) this
    else inc.int(n-1)
  }
  def dec(n: Int): Counter = {
    if (n <= 0) this
    else dec.dec(n-1)

  def print = println(count)
  }

}


// class parameters are NOT FIELDS