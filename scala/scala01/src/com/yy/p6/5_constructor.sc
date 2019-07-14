import java.util.Properties
import java.io.FileReader

class Person(val name: String = "", val age: Int = 0) {
  println("Just constructed another person")
  def description = name + " is " + age + " years old"
}

val p1 = new Person()
val p2 = new Person("Fred")
val p3 = new Person("Fred", 23)
p1.description
p2.description
p3.description

class MyProg {
  private val props = new Properties
  props.load(new FileReader("myprog.properties"))
  // The statement above is a part of the primary constructor
}

class Person2(val name: String, private var age: Int) {
  def description = name + " is " + age + " years old"
  def birthday() { age += 1 }
}

val p = new Person2("Fred", 42)
p.name
p.birthday()

class Person3 {
  private var name = ""
  private var age = 0
  
  def this(name: String) {
    this()
    this.name = name
  }
  
  def this(name: String, age: Int) {
    this(name)
    this.age = age
  }
  
  def description = name + " is " + age + " years old"
}

val p11 = new Person3()
val p12 = new Person3("Fred")
val p13 = new Person3("Fred", 42)

p11.description
p12.description
p13.description






































































