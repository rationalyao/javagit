// sealed 用户不能再外部文件中定义子类
sealed abstract class TrafficLightColor

case object Red extends TrafficLightColor
case object Yellow extends TrafficLightColor
case object Green extends TrafficLightColor

for (color <- Array(Red, Yellow, Green))
  println (
    color match {
      case Red => "Stop"
      case Yellow => "hurry up"
      case Green => "Go"
    }
  )
