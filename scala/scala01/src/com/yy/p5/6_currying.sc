// 传统定义两个参数
def mul(x: Int, y: Int) = x * y
mul(6, 7)

// 函数编程中，接收多个参数的函数都可以转化为接收单个函数的参数，转化过程叫柯里化
// 柯里化定义，使用到了闭包
def mulOneAtATime(x: Int) = (y: Int) => x * y

mulOneAtATime(6)(7)

// Scala中可以简写
def mulOneAtTime(x: Int)(y: Int) = x * y
mulOneAtTime(6)(7)

