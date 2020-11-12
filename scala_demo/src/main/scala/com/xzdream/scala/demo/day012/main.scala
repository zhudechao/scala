package com.xzdream.scala.demo.day012

//scala apply
object main {
  def main(args: Array[String]): Unit = {
    val a = ApplyTest()
    a.haveATry

    val b = new ApplyTest
    b.haveATry
    println(b())
  }
}
