package com.xzdream.scala.demo.day006

import scala.io.Source

//Lazy 第一次使用的时候才会被实例化(延迟执行)
object main {
  def main(args: Array[String]): Unit = {

    lazy val file = Source.fromFile("/Users/zhudechao/githup/scala/scala_demo/src/main/scala/com/xzdream/scala/demo/day006/main.scala")

    println("dd")
  }
}
