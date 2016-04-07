package com.sfw.test

import com.sfw.controllers.testController
import org.scalatra.test.specs2._

// For more on Specs2, see http://etorreborre.github.com/specs2/guide/org.specs2.guide.QuickStart.html
class testServletSpec extends ScalatraSpec { def is =
  "GET / on testServlet"                     ^
    "should return status 200"                  ! root200^
                                                end

  addServlet(classOf[testController], "/*")

  def root200 = get("/") {
    status must_== 200
  }
}
