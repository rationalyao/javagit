import scala.collection.mutable

// 不可变结构映射
val scores = Map("Alice" -> 10, "Bob" -> 3, "Cindy" -> 8)

// 可变映射
val scores1 = scala.collection.mutable.Map("Alice" -> 10, "Bob" -> 3, "Cindy"
  -> 8)

// 空映射
val scores2 = new mutable.HashMap[String, Int]

// 对偶
"Alice" -> 10

// 对偶元组
val scores3 = Map(("Alice" -> 10), ("Bob" -> 3), ("Cindy" -> 8))

// 获取值
val bobsScore = scores("Bob")
println(bobsScore)

// contains检查
scores1.contains("Bob")
scores1.contains("yy")

// 更新值
scores1("Bob") = 100
println(scores1("Bob"))

// 新增
scores1 += ("Fred" -> 9)
scores1 -= ("Alice")

// 不可变映射不能修改，但能狗产生新映射
val newScores = scores + ("Bob" -> 11, "Fred" -> 7)

// 遍历
for ((k, v) <- scores) println(k + " is mapped to " + v)
for (k <- scores.keys) println(k)
for (v <- scores.values) println(v)

// Key的set集合
scores.keySet

// 产生新的Map
for ((k, v) <- scores) yield (v, k)

// 排序
val scores4 = scala.collection.immutable.SortedMap("Alice" -> 10, "Fred" -> 
  7, "Bob" -> 3, "Cindy" -> 8)

// 双向链表HashMap
val months = scala.collection.mutable.LinkedHashMap("a" -> 1, "b" -> 2)
months("a")


