import scala.math._

// 通过View的懒执行
val palindromicSquares = (1 to 100).view.map(x => {println(x); x * x})

// Evaluates the first eleven
palindromicSquares.take(10).mkString(",")

