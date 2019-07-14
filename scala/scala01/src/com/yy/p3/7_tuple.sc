// 元组操作
// (1, 3.14, "Fred")

// 元组是不同类型值的聚集
// 元组可以用于函数返回不止一个值的情况；使用元组的原因之一是把多个值捆绑到一起，以便他们可以一起处理（在java中处理类似情况需要封装对象）
val t = (1, 3.14, "Fred")

// 元组使用 元组._*访问，下标从1开始
val second = t._2

val first = t._1

// 变量赋值
val symbols = Array("<", "-", ">")
val counts = Array(2, 10, 2)
val pairs = symbols.zip(counts)

val (fiset1, second1, third1) = t
// for ((s, n) <- pairs) pairs(s * n)

symbols.zip(counts).toMap
