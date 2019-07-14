// 切片操作返回一个迭代器
val iter1 = (1 to 10).sliding(3)
for (x <- iter1) println(x)
var i = 1


while (iter1.hasNext) {
  println(i + ":" + iter1.next())
  i += 1
}




