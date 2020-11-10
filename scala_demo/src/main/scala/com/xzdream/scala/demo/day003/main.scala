package com.xzdream.scala.demo.day003

//scala 元组，数组，集合
object main {
  def main(args: Array[String]): Unit = {
    testTuple()
    testArray()
    testMap()
  }

  //测试元组
  def testTuple(): Unit ={
    val triple = (88,"scala","8899")
    println(triple._1)
    println(triple._3)
  }

  //测试数组
  def testArray(): Unit ={
    val array = Array(1,2,3,43,5)

    for (i <- 0 until array.length){
      println(array(i))
    }

    for (elem <- array){
      println(elem)
    }

  }

  //测试map
  def testMap(): Unit ={
    val res = Map("xi" -> 3,"xx" -> 4)
    for ((k,v) <- res){
      println("key:"+k+" val:"+v)
    }

    // _占位符，不取map的值，只取键值
    for ((k,_) <- res){
      println("key:"+k)
    }
  }
}
