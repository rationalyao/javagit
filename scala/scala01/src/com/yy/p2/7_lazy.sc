def init() : String = {
  println("call init()")
  return ""
}

def noLazy(): Unit = {
  val property = init();
  println("after init()")
  println(property)
}

def lazyed(): Unit = {
  // 懒值，用到的时候再运行
  lazy val property = init();
  println("after init()")
  println(property)
}

noLazy()

lazyed()
