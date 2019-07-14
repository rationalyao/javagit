// 在scala中，if else是带有返回值的，因此没有三元操作符

val a = 2
val b = 10
var c = 0
var d = 0

val result1 = if (a > 0) 1 else -1

result1

val result2 = if (a < 0) "a less than 0" else "a more than 0"

result2

val result3 = if (a > 0) "hello" else "nonono"

result3

// 返回值类型不一样，则返回Any
val result4 = if (a < 0) "hello" else 1
result4


if (a > 0) {c = a + c; d = -1}
c
d


if (a > 0) {
  c = a + c
  d = -1
  
}
