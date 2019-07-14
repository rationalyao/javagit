for (arr <- Array(Array(0), Array(1, 1), Array(0, 1, 0), Array(1, 1, 0))) {
  
  val result = arr match {
    case Array(0) => "0"
    case Array(x, y) => x + " " + y
    case Array(0, _*) => "0 ..."
    case _ => "something else"
  }
  
  println(result)
}

// 匹配列表
for (lst <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0))) {
  
  val result = lst match {
    // Nil是一个空的List，定义为List[Nothing]
    // match中，用=>表示输出结果或返回值
    case 0 :: Nil => "0"
    case x :: y :: Nil => x + " " + y
    case _ => "something else"
  }
  println(result)
}

// 匹配元组
for (pair <- Array((0, 1), (1, 0), (1, 1))) {
  
  val result = pair match {
    case (0, _) => "0 ,,,"
    case (y, 0) => y + " 0"
    case _ => "neither is 0"
  }
  println(result)
}
