abstract class Item
case class Article(description: String, price: Double) extends Item
case class Bundle(description: String, price: Double, items: Item*) extends Item

val special = Bundle("Father's Day special", 20.0, Article("Scala for the", 
  39.95), Bundle("Anchor Distillery Sampler", 10.0, Article("Old Portero " +
  "Striaight Rye WHISKEY", 79.95), Article("Junipero Gin", 32.95)))

special match {
  case Bundle(_, _, Article(descr, _), _*) => descr
}

special match {
    // @ 表示把后边嵌套的值绑定到变量
  case Bundle(_, _, art @ Article(_, _), rest) => (art, rest)
}

// 计算物品价格
def price(it: Item) : Double = it match {
  case Article(_, p) => p
    // map表示把its数组都应用于后面的函数
    // 这里是一个递归调用
  case Bundle(_, disc, its @ _*) => its.map(price (_)).sum - disc
}
price(special)
