package com.xzdream.scala.demo.day012

class ApplyTest {
  def apply() = println("I am into Spark so much!!!")

  def haveATry: Unit ={
    println("Have a try on apply!")
  }
}

object ApplyTest{
  def apply() = {
    println("I am into Scala so much !!")
    new ApplyTest
  }
}
