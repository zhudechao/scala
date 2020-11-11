package com.xzdream.scala.demo.day011

//scala内部类
object main {
  def main(args: Array[String]): Unit = {
    val outer1 = new Outer("Spark")
    val outer2 = new Outer("Hadoop")

    val inner1 = new outer1.Inner("Scala")
    val inner2 = new outer2.Inner("Java")

    inner1.foo(inner1)
    inner2.foo(inner2)
  }
}
