import scala.math._

val num = 3.14

// 将ceil方法转换成函数，将函数值赋值给变量
val fun = ceil _
 
fun(num)

// 传递函数
Array(3.14, 1.42, 2.0).map(fun)

def plus(x: Double) = 3 * x

Array(3.14, 1.42, 2.0).map(plus)
