package com.xzdream.scala.demo.day014

//类的继承
object main {
  def main(args: Array[String]): Unit = {
    var student = new Student()
    student.name = "小米"
    student.studying()
    student.showInfo()
  }
}
