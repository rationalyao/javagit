val names = List("Peter", "Paul", "Mary")

// map是把一个东西转换成另一个东西
// map映射
names.map(_.toUpperCase)

for (n <- names) yield n.toUpperCase

def ulcase(s : String) = Vector(s.toUpperCase(), s.toLowerCase()) 

names.map(ulcase)

// flatmap映射
names.flatMap(ulcase)
names.foreach(println)
