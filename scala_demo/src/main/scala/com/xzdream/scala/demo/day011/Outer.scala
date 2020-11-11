package com.xzdream.scala.demo.day011

class Outer(val name:String) {
  outer => class Inner(val name:String){
    def foo(b:Inner) = {
      println("Outer:"+outer.name+" Inner:"+b.name)
    }
  }

}
