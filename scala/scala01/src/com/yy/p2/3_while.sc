var a = 1
var b = 10

// while循环
while (a > 0) {
  a = a * b 
  b -= 1 
  println(a)
}

a = 1
b = 10
// do while循环
do {
  b -= 1
  println("Value b : " + b)
} while (b > 0)
b = 10

import scala.util.control.Breaks._

a = 1
b = 10
// break
breakable {
  while (b > 0) {
    a += 3
    b -= 1
    println("a : " + a + ", b : " + b)
    if (a > 6) break;}
}
