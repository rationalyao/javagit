val a = Array(2, 3, 5, 7, 11)

// 产生新的数组
val result = for (elem <- a) yield 2 * elem

val result1 = for (elem <- a if elem % 2 == 0) yield 2 * elem

a.filter(_ % 2 == 0).map(2 * _) // map是映射

// 常用方法
import scala.collection.mutable.ArrayBuffer

// 求和
Array(1, 7, 2, 9).sum

// 最大排序
ArrayBuffer("Mary", "had", "a", "extremly", "lamnb").max

val b = ArrayBuffer(1, 7, 2, 9)

// 排序
val bSorted = b.sorted

val a1 = Array(1, 7, 2, 9)
scala.util.Sorting.quickSort(a1)
a1

// 形成String
a1.mkString(" and ")
a1.mkString("<", ",", ">")
a1.toString
b.toString

//更多方法
import scala.collection.mutable.ArrayBuffer

val x = Array(1, -2, 3, -4, 5)
val y = ArrayBuffer(1, 7, 2 ,9)

// 统计大于0的个数
x.count(_ > 0)

//
b.append(1, 7, 2, 8)
b

b.appendAll(a)
b

// 将y中的数据copy到x中
y.copyToArray(x)
x

val xs = Array(1, "Fred", 2, 9)
y.copyToArray(xs)
xs
y

// 加到20项,用-1填充
y.padTo(20, -1)

(1 to 10).padTo(20, -1)

