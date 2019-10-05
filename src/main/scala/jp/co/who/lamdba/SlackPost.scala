package jp.co.who.lamdba

import scala.collection.JavaConverters._
//import com.amazonaws.services.lambda.runtime.Context

object SlackPost extends SampleBase {

  def sample(): Unit = {
  }

}

trait SampleBase {

  def sample(myCount: Int, context: Any): java.util.List[String] = {
    println("Hello World!!")
    List("%d".format(myCount)).asJava
  }
}
