package com.xzdream.scala.demo.day007

import scala.collection.mutable.ArrayBuffer

//scala数组进阶
object main {
  def main(args: Array[String]): Unit = {
    //声明定长数组
    val nums = new Array[Int](10)
    //初始化一个数组
    val sArray = Array("a","b")
    println(sArray(1))
    sArray(1) = "c"
    println(sArray(1))

    //动态数组
    val b = ArrayBuffer[Int]()
    b += 1 //加入一个元素
    b += (2,3,4) //批量加入元素
    b ++= Array(5,6) //合并一个数组
    b.trimEnd(1) //从数组末尾删除一个元素
    b.insert(1,21) //在key为1的地方插入，其它元素后移
    println(b)
    b.insert(0,22,2,21)//在key为0的位置插入 22,2,21,其它元素后移
    println(b)
    b.remove(2) //移除 key 为 2 处的值
    println(b)
    b.remove(2,3) //移除从 key 为 2 处的数据，长度为3
    println(b)

    for (i <- 0 until b.length){
      print("key:"+i+" value:"+b(i)+" ")
    }
    println()

    val c = Array(2,3,5,7,11)
      val result = for (elem <- c) yield 2*elem

    c.filter(_%2 == 0).map(2 * _)
    for (elem <- c)
      print(elem+" ")
    println()

    val sum = Array(88,11).sum
    println(sum)
  }

}
