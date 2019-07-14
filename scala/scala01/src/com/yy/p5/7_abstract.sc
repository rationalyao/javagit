// 控制抽象是一类函数：1.参数是函数。 2.函数参数没有输入值也没有返回值
def runInThread(block: () => Unit): Unit = {
  new Thread {
    override def run() { block() }
  }.start()
}

// 传入函数
runInThread { () => println("Hi"); Thread.sleep(1000); println("Bye")}

// 这种叫做控制抽象函数
def runInThread(block: => Unit): Unit = {
  new Thread {
    override def run() { block }
  }.start()
}

// 优雅的传入
runInThread { println("Hi"); Thread.sleep(1000); println("Bye")}

// 定义类while的until方法
def until(condition: => Boolean)(block: => Unit): Unit = {
  if (!condition) {
    block
    until(condition)(block)
  }
}

var x = 10
until(x == 0) {
  x -= 1
  println(x)
}
Thread.sleep(1000)
