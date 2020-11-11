package com.xzdream.scala.demo.day013

//伴生类
class University{
  val id = University.newStudentNo

  private var number = 0
  def aClass(number:Int): Unit ={
    this.number += number
  }
}

//伴生对象
object University {
  private var studentNo = 0

  def newStudentNo = {
    studentNo += 1
    studentNo
  }
}
