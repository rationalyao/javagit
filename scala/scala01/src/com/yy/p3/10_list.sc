val digits = List(4, 2)

// 右结合操作符
9 :: List(4, 2)

// Nil表示空列表
9 :: 4 :: 2 :: Nil
9 :: (4 :: (2 :: Nil))

def sum(list: List[Int]): Int = {
  if (list == Nil) 0 else list.head + sum(list.tail)
}

sum(digits)

