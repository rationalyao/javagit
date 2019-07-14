for (obj <- Array(42, "42", BigInt(42), BigInt, 42.0)) {
  
  val result = obj match {
    case x:Int => x
    case s:String => s.toInt
    case _:BigInt => Int.MaxValue
    case BigInt => -1
    case _ => 0
  }
  println(result)
}

// Map(42 -> "Fred")也映射到Map[String, Int],显然不对