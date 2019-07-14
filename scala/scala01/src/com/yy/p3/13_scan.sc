// 部分化简操作
List(1, 7, 2, 9).reduceLeft(_-_)
List(1, 7, 2, 9).reduceRight(_-_)

// 折叠操作
List(1, 7, 2, 9).foldLeft(0)(_-_)

// 也可以用以下方式来表示 foldLeft
(0 /: List(1, 7, 2, 9)) (_-_)

val freq = scala.collection.mutable.Map[Char, Int]()
for (c <- "Mississippi") freq(c) = freq.getOrElse(c, 0) + 1

// 扫描操作
(1 to 10).scanLeft(0)(_+_)