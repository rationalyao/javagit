def valueAtOneQuarter(f: (Double) => Double) = f(0.25)

// 传入函数表达式
valueAtOneQuarter((x: Double) => x * 3)

// 参数推断省去类型信息, 因为函数在定义时已经固定参数类型
valueAtOneQuarter((x) => 3 * x)

// 单个参数可以省略括号
valueAtOneQuarter(x => 3 * x)

// 如果变量只在右边出现一次，可以用_来代替
valueAtOneQuarter(3 * _)


