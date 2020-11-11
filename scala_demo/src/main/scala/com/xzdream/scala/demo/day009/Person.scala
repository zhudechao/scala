package com.xzdream.scala.demo.day009

class Person {
  //count 变量只能在当前类里访问
  private[this] var count = 0

  //私有变量
  private var age = 0

  def increment()={
    age += 1
  }

  //这也是一个函数
  def current = age
}
