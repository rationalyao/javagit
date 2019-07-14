// 偏函数，并不处理所有可能的输入
val f: PartialFunction[Char, Int] = {
  case '+' => 1
  case '-' => -1
}

f('-')
// isDefinedAt 是否具有xx的定义
f.isDefinedAt('0')
f('0')