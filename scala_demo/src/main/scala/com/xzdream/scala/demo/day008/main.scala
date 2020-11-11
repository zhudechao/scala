package com.xzdream.scala.demo.day008

//map,tuple进阶
object main {
  def main(args: Array[String]): Unit = {
    val map = Map("book"->10,"mac"->19,"ipad"->999)
    for ((k,v) <- map) yield (k,v * 2)

    val scores = scala.collection.mutable.Map("scala"->7,"hadoop"->9,"spark"->10)
    val sparkScore = scores.getOrElse("spark",0)//如果键存在则返回，否则返回指定值
    println(sparkScore)

    scores += ("flink" -> 8) //增加元素
    scores -= "hadoop" //删除元素

    //进行排序
    val sortedScore = scala.collection.immutable.SortedMap("Scala"->2,"Hadoop"->1,"cool"->5,"a"->3)
    println("排序输出")
    for (elem <- sortedScore){
      println(elem)
    }

    //tuple不同元素类型的集合
    val tupleOne = (1,8.1,"aa")
    val tupleOneRes = tupleOne._3
    println(tupleOneRes)

    //将tuple元素分别赋值给 f1,f2,f3
    val (f1,f2,f3) = tupleOne
    val (fl1,fl2,_) = tupleOne
    print(f1+" "+f2+" "+f3)
    println()

    //把字符串大写分为一组，其它另一组
    val upperStr = "Hello World".partition(_.isUpper)
    println(upperStr)

    //zip
    val symbols = Array("[","-","]")
    val counts = Array(2,5,2)
    val pairs = symbols.zip(counts)
    for ((x,y) <- pairs)
      print(x*y)
  }
}
