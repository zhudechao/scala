package com.xzdream.scala.demo.day004

import scala.io.Source

//文件操作
object main {
  def main(args: Array[String]): Unit = {
    val file = Source.fromFile("/Users/zhudechao/githup/scala/scala_demo/src/main/scala/com/xzdream/scala/demo/day001/helloWord.scala")

    for (line <- file.getLines){
      println(line)
    }
  }
}
