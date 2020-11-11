package com.xzdream.scala.demo.day009

//scala类的属性和对象私有字段
object main {
  def main(args: Array[String]): Unit = {
    val person = new Person()
    person.increment()
    println(person.current)
  }
}
