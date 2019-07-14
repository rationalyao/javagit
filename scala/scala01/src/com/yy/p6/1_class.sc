// class 定义类，和java类似，不用声明public
class Counter {
  private var value = 0 // You must initialize the field
  def increment() { value += 1 }  // Methods are public by default
  def current() = value
}

// new Counter()也可以
val myCounter = new Counter

myCounter.increment()
println(myCounter.current())

val myCounter2 = new Counter
myCounter2.current()

class Counter1 {
  private var value = 0
  def increment() { value += 1 }
  def current = value // No() in definition
}

val counter = new Counter1
counter.increment()
print(counter.current)

