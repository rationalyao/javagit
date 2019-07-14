// 定义函数，返回值类型可以自行推断
def abs(x:Double) = if (x > 0) x else -x

print(abs(1))
print(abs(-3))

def fac(n : Int) = {
  var r = 1
  for (i <- 1 to n) r = r * i
  r                              // {}最后一个为返回值类型
}

print(fac(3))

import scala.math._

def pfg(n:Double) = {
  var r = sqrt(n)
  r
}

print(pfg(9))

// 递归函数，必须指定返回值类型
def recursiveFac(n : Int) : Int = if (n <= 0) 1 else n * 
  recursiveFac(n - 1)

print(recursiveFac(10))

// 设置默认参数
def decorate(str : String, left : String = "[", right : String = "]") = left + str + right

print(decorate("heihie"))

print(decorate("heihei", "<", ">"))

print(decorate("heihei", "<"))

print(decorate("heihei", "he"))

// 变长参数
def sum(args : Int*) = {
  var result = 0
  for (arg <- args) result += arg
  result
}

print(sum(1,2,3,4,5,6,7,8,9,10))

// _*告诉编译器将1 to 5 当做参数序列处理
val s2 = sum(1 to 5 : _*)
print(s2)

// head是第一个元素，tail是剩下的元素的集合
def recursiveSum(args : Int*) : Int = {
  if (args.length == 0) 0 else args.head + recursiveSum(args.tail : _*)
}


print(recursiveSum(1,4,9,16,25))




