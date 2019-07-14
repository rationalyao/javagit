// update 方法也是调用时可以省略方法名的方法，用于元素的更新，

val arr1 = Array.apply(1,2,3)

arr1(0) = 2

arr1.update(1, 3)

arr1