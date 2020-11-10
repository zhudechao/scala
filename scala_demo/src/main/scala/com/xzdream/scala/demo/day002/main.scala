package com.xzdream.scala.demo.day002

object main {
  def main(args: Array[String]): Unit = {
    println(getName())
    println(getMessage("小米"))
    rangeI()
    testException()
  }

  //创建一个函数
  def getName():String={
    return "第一个函数"
  }

  //创建一个有参数的函数
  def getMessage(name:String):String = {
    return name+"：很帅!";
  }

  //创建一个流程控制
  def rangeI()={
    for (i <- 1 to 10){
      println("I:"+i)
    }
  }

  //异常的处理
  def testException(): Unit ={
    try{
      val n = 11
      val half = if(n % 2 == 0) n/2 else throw
        new RuntimeException("N must be event")
    }catch {
      case e: Exception => println("The exception is :"+e.getMessage())
    }finally {

    }
  }
}
