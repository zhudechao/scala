package com.xzdream.scala.demo.day013

//scala单例，伴生对象
object main {
  def main(args: Array[String]): Unit = {

    println(University.newStudentNo)
    println(University.newStudentNo)

    val u = new University
    println(u.id)
    println(u.id)
  }
}
