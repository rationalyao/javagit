case class Currency(value: Double, unit: String)

val amt = Currency(1000.0, "EUR")

// 中置表达式
amt match { case a Currency u => a + " " + u}

val lst = List(1, 7, 2, 9)
lst match {
  case h :: t => h + t.length
  case _ => 0
}

// :: 将元素添加到List最前面
// 从前往后匹配
List(1, 7, 2, 9) match {
  case first :: second :: rest => first + second + rest.length
  case _ => 0
}

List(1, 7, 2, 9) match {
    // :: 前相当于Nil
  case :: (first, :: (second, rest)) => println(first); println(second); 
    println(rest.length)
  case _ => 0
}

List(List(1, 7), List(2, 9)) match {
  case (first :: second) :: rest1 => println(first); println(second); println
    (rest1.length)   // 此时rest1相当于一个元素，长度为1
  case _ => 0
}




