// 定长数组
val nums = new Array[Int](10)
val s = Array("Hello", "World")
s(0) = "GoodBye"
s

// 变长 数组缓冲
import scala.collection.mutable.ArrayBuffer

val b = ArrayBuffer[Int]()
val b2 = new ArrayBuffer[Int]()     // If you use new, the () is optional

b += 1
b += 2
b += (1, 2, 3, 5)
b ++= Array(8, 13, 21)

// 删除最后5个元素
b.trimEnd(5)
b

// 在第三个位置插入6
b.insert(2, 6)
b

// 在第三个位置插入7,8,9
b.insert(2,7,8,9)
b

// 删除第三个元素
b.remove(2)
b

// 删除从第三个位置开始的三个元素
b.remove(2, 3)
b

// 变长数组和不变数组之间的转换
val a1 = b.toArray
a1.toBuffer

// 数组遍历
for (elem<- b)
  println(elem)

// 下标访问
for (i <- 0 until b.length)
  println(i + ":" + b(i))

// 产生一个Range
0 until b.length

// 产生一个Range，以2为间隔
0 until (b.length, 2)

// Range倒转
(0 until (b.length,2)).reverse

// a遍历
for (elem <- a1)
  println(elem)

// a索引
for (i <- a1.indices)
  println(i + ":" + a1(i))