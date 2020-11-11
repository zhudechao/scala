package com.xzdream.scala.demo.day010

class Student(val name:String,val age : Int) {
  println("--")
  var gender : String = _

  def this(name:String,age:Int,gender:String){
    this(name,age)
    this.gender = gender
  }
}
