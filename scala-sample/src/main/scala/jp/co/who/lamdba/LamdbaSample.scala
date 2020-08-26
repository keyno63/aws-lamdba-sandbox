package jp.co.who.lamdba

import com.amazonaws.services.lambda.runtime.{Context, LambdaLogger, RequestHandler}

class LamdbaSample extends LamdbaSampleBase

trait LamdbaSampleBase extends RequestHandler[Int, String] {

  override def handleRequest(myCount: Int, context: Context): String = {
    val logger: LambdaLogger = context.getLogger
    logger.log(s"LamdbaSampleBase. received : ${myCount}")
    s"ret: ${myCount.toString}"
  }
}
