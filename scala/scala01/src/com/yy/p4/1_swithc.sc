var sign = 0
for (ch <- "+-!") {
  
  ch match {
    case '+' => sign = 1
    case '-' => sign = -1
    case _ => sign = 0
  }
  println(sign)
}

for (ch <- "+-!") {
  
  sign = ch match {
    case '+' => 1
    case '-' => -1
    // _表示所有匹配不上的结果
    case _ => 0
  }
  println(sign)
}

var ch = '+'
var op = 0
ch match {
  case '+' => op = 1
  case '-' => op = -1
}
println(op)

import java.awt._

val color = SystemColor.textText

color match {
  case Color.RED => "Text is red"
  case Color.BLACK=> "Text is blacko"
  case _=> "Not red or black"
}
