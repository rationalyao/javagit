// 声明一个抽象类
abstract class Amount
// 必须声明样例类
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount

val dollar = Dollar(1000.0)

dollar.value
dollar.toString

for (amt <- Array(Dollar(1000.0), Currency(1000.0, "EUR"), Nothing)) {
  val result = amt match {
    case Dollar(v) => "$" + v
    case Currency(_,u) => "Oh nose, I got" + u
    case Nothing => ""
  }
  // Note that amt is printed nicely, thanks to the generated toString
  println(amt + ": " + result)
}

