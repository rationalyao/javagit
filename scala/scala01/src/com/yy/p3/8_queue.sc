import scala.collection.mutable

val q1 = new mutable.Queue[Int]()

// 追加元素
q1 += 1
q1 += 2

// 追加多个元素并返回队列
q1 ++= List(3, 4, 5)

// 追加多个元素，返回值类型为Unit
q1.enqueue(6, 7, 8)

q1

// 队列首部
q1.head

// 队列尾部
q1.tail
