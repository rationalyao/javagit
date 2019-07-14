// 函数表达式
(x: Double) => 3 * x

// 匿名函数
val triple = (x: Double) => 3 * x

Array(3.14, 1.42, 2.0).map(triple)

// 包含在（）中
Array(3.14, 1.42, 2.0).map((x: Double) => x * 2)

// 包含在（）中
Array(3.14, 1.42, 2.0) map { (x: Double) => x * 4 }

def triple(x: Double) = x * 3