def mulBy(factor: Double) = (x: Double) => factor * x

// 闭包机制就像一个函数样板
val triple = mulBy(3)
val half = mulBy(0.5)
println(triple(14) + " " + half(14))