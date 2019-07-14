// 多维数组 3行4列
val matrix = Array.ofDim[Double](3, 4)  // An array of arrays
val matrix2 = Array.ofDim[Double](4, 2)

val row = 0
val column = 2

matrix(0)(2) = 17.29

// 矩阵是数组的数组
matrix.length
matrix2.length
matrix(row)  // An array
matrix(1)
matrix(row).length

val triangle = new Array[Array[Int]](10)

print("indices:" + triangle.indices)
// array.indices表示数组下标序列
for (i <- triangle.indices) {
  triangle(i) = new Array[Int](i + 1)
}

triangle(0)(0) = 1

// array.length表示数组长度
for (i <- 1 until triangle.length) {
  triangle(i)(0) = 1
  triangle(i)(i) = 1
  for (j <- 1 until triangle(i).length - 1)
    triangle(i)(j) = triangle(i - 1)(j - 1) + 
  triangle(i - 1)(j) }

for (row <- triangle) {
  // row表示triangle里的每一行
  for (elem <- row)
    // elem表示row序列中的每一个元素
    print(elem + " ")
  println()
}

