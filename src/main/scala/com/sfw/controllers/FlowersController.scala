package com.sfw.controllers

import org.json4s.{JValue, JsonInput}
import org.scalatra._

// JSON-related libraries
import org.json4s._

// JSON handling support from Scalatra
import org.scalatra._

class FlowersController extends ScalatraServlet  {

  // Sets up automatic case class to JSON output serialization, required by
  // the JValueResult trait.
  protected implicit val jsonFormats: Formats = DefaultFormats

  // Before every action runs, set the content type to be in JSON format.
 /* before() {
    contentType = formats("json")
  }*/

 //
  get("/"){
    FlowerData.all
  }

/*  override def error(handler: ErrorHandler): Unit = ???

  override def parse(in: JsonInput, useBigDecimalForDouble: Boolean): JValue = ???

  override def pretty(d: JValue): String = ???

  override def render(value: JValue): JValue = ???

  override def compact(d: JValue): String = ???

  override def parseOpt(in: JsonInput, useBigDecimalForDouble: Boolean): Option[JValue] = ???*/
}


case class Flower(slug: String, name: String)



object FlowerData {

  /**
    * Some fake flowers data so we can simulate retrievals.
    */
  var all = List(
    Flower("yellow-tulip", "Yellow Tulip"),
    Flower("red-rose", "Red Rose"),
    Flower("black-rose", "Black Rose"))
}



