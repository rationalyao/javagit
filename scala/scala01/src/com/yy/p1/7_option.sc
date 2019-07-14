
/*
val scores = Map("Alice" -> 1729, "Fred" -> 42)

scores.get("Alice") match {
  case Some(score) => println(score)
  case None => println("No score")
}

val alicesScore = scores.get("Alice")
if (alicesScore.isEmpty) { println("No score")
} else println(alicesScore.get)

println(alicesScore.getOrElse("No score"))

println(scores.getOrElse("Alice", "No score"))

for (score <- scores.get("Alice")) println(score)

scores.get("Alice").foreach(println _)*/

val scores = Map("yaoyu" -> 100, "huminghua" -> 99, "zhangjiabao" -> 98)

scores.get("yaoyua") match {
  case Some(score) => println(scores)
  case None => println("No score")
}

val yaoyuScore = scores.get("yaoyu")
if (yaoyuScore.isEmpty) {
  println("No score")
} else {
  println(yaoyuScore.get)
}

println("-----------------------")

yaoyuScore
yaoyuScore.get