package com.xzdream.scala.demo.day005

//for,function进阶
object main {
  def main(args: Array[String]): Unit = {

    //类似嵌套for循环
    for (i <- 1 to 3; j <- 1 to 2)
      print((100*i+j)+" ")
    println()

    for (i <- 1 to 4; j <- 1 to 3 if i != j)
      print((100*i+j)+" ")
    println()

    println(addNumber(20))

    //匿名函数
    val add = (x:Int) => x + 5
    println(add(3))

    //递归函数
    def fac(n:Int):Int = if(n <= 0) 1 else n * fac(n-1)
    println(fac(10))

    println(combine("scala"))

    println(connected(2,3,5))
  }

  //函数
  def addNumber(x:Int) = x+100

  //函数默认值
  def combine(content:String,left:String = "[",right: String = "]"):String = {
    return left+content+right
  }

  //函数参数传递多个值
  def connected(args:Int*):Int={
    var result = 0
    for (arg <- args)
      result += arg
    result
  }
}
