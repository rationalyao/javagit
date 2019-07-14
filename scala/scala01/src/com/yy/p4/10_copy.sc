abstract class Amount
case class Dollar(value: Double) extends Amount
case class Currency(value: Double, unit: String) extends Amount

case object Nothing extends Amount

val amt = Currency(29.95, "EUR")
// copy创建一个与现有对象值相同的新对象，并可以通过带名参数修改某些属性
val price = amt.copy(value = 19.95)
println(price)
println(amt.copy(unit = "CHE"))
