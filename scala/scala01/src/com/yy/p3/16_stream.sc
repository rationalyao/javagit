// 流Stream只有在需要的时候才回去计算下一个元素，是一个尾部被懒计算的不可变列表
// #:: 返回一个流
def numsForm(n : BigInt) : Stream[BigInt] = 
  n #:: numsForm(n + 1)

val tenOrMore = numsForm(10)
tenOrMore.tail
tenOrMore.head

// 获取最后一个元素
tenOrMore.tail.tail.tail

var squares = numsForm(5).map(x => x * x)

squares.take(5).force

// squares.force 不要尝试对一个无穷流的成员进行求值，OutOfMemoryError