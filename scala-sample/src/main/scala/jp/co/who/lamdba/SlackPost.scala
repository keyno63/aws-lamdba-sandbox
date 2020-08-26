package jp.co.who.lamdba

import com.amazonaws.services.lambda.runtime.{Context, LambdaLogger, RequestHandler}

class SlackPost extends SampleBase {

  def hello(myCount: String, context: Context): String = {
    val logger: LambdaLogger = context.getLogger
    logger.log(s"received : ${myCount}")
    myCount
  }
}

trait SampleBase
  extends RequestHandler[Int, String] {

  override def handleRequest(myCount: Int, context: Context): String = {
    val logger: LambdaLogger = context.getLogger
    logger.log(s"received : ${myCount}")
    myCount.toString
  }
}
