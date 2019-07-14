val arr = Array(0, 1)

val Array(x, y) = arr

val Array(z, _*) = arr

arr match {
  case Array(0, x) => x
}

Array.unapplySeq(arr)


// unapply 提取值
object Name {
  def unapply(input: String): Option[(String, String)] = {
    // indexOf:返回指定字符在此字符串中第一次出现处的索引
    val pos = input.indexOf(" ")
    if (pos == -1) None 
    // substring:返回一个新字符串，指定原来字符串的起始、终止位置
    else Some((input.substring(0, pos), input.substring(pos + 1)))
  }
}

val author = "yao yu"
val Name(first, second) = author