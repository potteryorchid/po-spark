package com.po

import main.scala.com.po.Helloworld
import org.scalatest.FunSuite;
/**
  * Created by ZJ on 27/07/2018.
  */
class HelloworldTest extends FunSuite{

  test("Helloworld.square") {
    assert(Helloworld.square(3) === 9)
  }

}
