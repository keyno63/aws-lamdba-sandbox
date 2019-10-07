package jp.co.who.lamdba

import com.amazonaws.services.lambda.runtime.{Context, LambdaLogger, RequestHandler}

object SlackPost extends SampleBase

trait SampleBase
  extends RequestHandler[Int, String] {

  def handleRequest(myCount: Int, context: Context): String = {
    val logger: LambdaLogger = context.getLogger
    logger.log(s"received : ${myCount}")
    myCount.toString
  }
}
