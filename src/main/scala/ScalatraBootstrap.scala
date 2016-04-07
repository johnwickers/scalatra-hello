import com.sfw.test._
import org.scalatra._
import javax.servlet.ServletContext

import com.sfw.controllers.{FlowersController}

class ScalatraBootstrap extends LifeCycle {
  override def init(context: ServletContext) {
    //context.mount(new testController, "/*")
    context.mount(new FlowersController, "/flowers/*")
  }
}
