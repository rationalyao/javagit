var numberSet = Set(1, 2, 3)
numberSet += 4   // Sets numberSet to the immutable set numberSet + 5
numberSet

Set(1, 2, 3) - 3

Set(1, 2, 3) + 10

// 无序访问
for (x <- Set(1, 2, 3, 4, 5, 6)) println(x)