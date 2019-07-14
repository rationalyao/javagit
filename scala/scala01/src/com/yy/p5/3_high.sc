import scala.math._

// 能够接受函数作为参数的函数叫做高阶函数
// 函数的类型为：（参数类型）=> 返回类型

// 参数是可以任意接受Double类型参数并返回Double的函数
def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

valueAtOneQuarter(ceil _)
valueAtOneQuarter(sqrt _)

// 产出函数: 高阶函数也可以返回函数
def mulBy(factor: Double) = (x: Double) => factor * x

// 相当于一个产生函数的模板，改变参数会产生新的函数
val quinTuple = mulBy(5)
quinTuple(20)

