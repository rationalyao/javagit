// 过程定义
def box(s : String) = {
  val border = "-" * s.length + "--\n"
  println("\n" + border + "|" + s + "|\n" + border)
}

box("Fred")