package com.xzdream.scala.demo.day010

class Teacher {
  var name : String = _

  private var age = 30
  private[this] val gender = "male"

  //重载构造器
  def this(name:String){
    this
    this.name = name
  }

  def sayHello(): Unit ={
    println(this.name+":"+this.age+":"+this.gender)
  }
}
