// @GENERATOR:play-routes-compiler
// @SOURCE:conf/routes

package router

import play.core.routing._
import play.core.routing.HandlerInvokerFactory._

import play.api.mvc._

import _root_.controllers.Assets.Asset

class Routes(
  override val errorHandler: play.api.http.HttpErrorHandler, 
  // @LINE:6
  WidgetController_0: controllers.WidgetController,
  // @LINE:18
  Assets_1: controllers.Assets,
  val prefix: String
) extends GeneratedRouter {

   @javax.inject.Inject()
   def this(errorHandler: play.api.http.HttpErrorHandler,
    // @LINE:6
    WidgetController_0: controllers.WidgetController,
    // @LINE:18
    Assets_1: controllers.Assets
  ) = this(errorHandler, WidgetController_0, Assets_1, "/")

  def withPrefix(addPrefix: String): Routes = {
    val prefix = play.api.routing.Router.concatPrefix(addPrefix, this.prefix)
    router.RoutesPrefix.setPrefix(prefix)
    new Routes(errorHandler, WidgetController_0, Assets_1, prefix)
  }

  private[this] val defaultPrefix: String = {
    if (this.prefix.endsWith("/")) "" else "/"
  }

  def documentation = List(
    ("""GET""", this.prefix, """controllers.WidgetController.index"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.list"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets/create""", """controllers.WidgetController.listing"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets""", """controllers.WidgetController.create"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets/delete/""" + "$" + """name<[^/]+>""", """controllers.WidgetController.delete(name:String)"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets/""" + "$" + """name<[^/]+>/update""", """controllers.WidgetController.editing(name:String)"""),
    ("""POST""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """widgets/update/save""", """controllers.WidgetController.editList"""),
    ("""GET""", this.prefix + (if(this.prefix.endsWith("/")) "" else "/") + """assets/""" + "$" + """file<.+>""", """controllers.Assets.versioned(path:String = "/public", file:Asset)"""),
    Nil
  ).foldLeft(List.empty[(String,String,String)]) { (s,e) => e.asInstanceOf[Any] match {
    case r @ (_,_,_) => s :+ r.asInstanceOf[(String,String,String)]
    case l => s ++ l.asInstanceOf[List[(String,String,String)]]
  }}


  // @LINE:6
  private[this] lazy val controllers_WidgetController_index0_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix)))
  )
  private[this] lazy val controllers_WidgetController_index0_invoker = createInvoker(
    WidgetController_0.index,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "index",
      Nil,
      "GET",
      this.prefix + """""",
      """ Home page""",
      Seq()
    )
  )

  // @LINE:9
  private[this] lazy val controllers_WidgetController_list1_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_list1_invoker = createInvoker(
    WidgetController_0.list,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "list",
      Nil,
      "GET",
      this.prefix + """widgets""",
      """ Widgets""",
      Seq()
    )
  )

  // @LINE:10
  private[this] lazy val controllers_WidgetController_listing2_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets/create")))
  )
  private[this] lazy val controllers_WidgetController_listing2_invoker = createInvoker(
    WidgetController_0.listing,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "listing",
      Nil,
      "GET",
      this.prefix + """widgets/create""",
      """""",
      Seq()
    )
  )

  // @LINE:11
  private[this] lazy val controllers_WidgetController_create3_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets")))
  )
  private[this] lazy val controllers_WidgetController_create3_invoker = createInvoker(
    WidgetController_0.create,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "create",
      Nil,
      "POST",
      this.prefix + """widgets""",
      """""",
      Seq()
    )
  )

  // @LINE:12
  private[this] lazy val controllers_WidgetController_delete4_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets/delete/"), DynamicPart("name", """[^/]+""",true)))
  )
  private[this] lazy val controllers_WidgetController_delete4_invoker = createInvoker(
    WidgetController_0.delete(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "delete",
      Seq(classOf[String]),
      "GET",
      this.prefix + """widgets/delete/""" + "$" + """name<[^/]+>""",
      """""",
      Seq()
    )
  )

  // @LINE:13
  private[this] lazy val controllers_WidgetController_editing5_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets/"), DynamicPart("name", """[^/]+""",true), StaticPart("/update")))
  )
  private[this] lazy val controllers_WidgetController_editing5_invoker = createInvoker(
    WidgetController_0.editing(fakeValue[String]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "editing",
      Seq(classOf[String]),
      "GET",
      this.prefix + """widgets/""" + "$" + """name<[^/]+>/update""",
      """""",
      Seq()
    )
  )

  // @LINE:14
  private[this] lazy val controllers_WidgetController_editList6_route = Route("POST",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("widgets/update/save")))
  )
  private[this] lazy val controllers_WidgetController_editList6_invoker = createInvoker(
    WidgetController_0.editList,
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.WidgetController",
      "editList",
      Nil,
      "POST",
      this.prefix + """widgets/update/save""",
      """""",
      Seq()
    )
  )

  // @LINE:18
  private[this] lazy val controllers_Assets_versioned7_route = Route("GET",
    PathPattern(List(StaticPart(this.prefix), StaticPart(this.defaultPrefix), StaticPart("assets/"), DynamicPart("file", """.+""",false)))
  )
  private[this] lazy val controllers_Assets_versioned7_invoker = createInvoker(
    Assets_1.versioned(fakeValue[String], fakeValue[Asset]),
    play.api.routing.HandlerDef(this.getClass.getClassLoader,
      "router",
      "controllers.Assets",
      "versioned",
      Seq(classOf[String], classOf[Asset]),
      "GET",
      this.prefix + """assets/""" + "$" + """file<.+>""",
      """ Map static resources from the /public folder to the /assets URL path""",
      Seq()
    )
  )


  def routes: PartialFunction[RequestHeader, Handler] = {
  
    // @LINE:6
    case controllers_WidgetController_index0_route(params@_) =>
      call { 
        controllers_WidgetController_index0_invoker.call(WidgetController_0.index)
      }
  
    // @LINE:9
    case controllers_WidgetController_list1_route(params@_) =>
      call { 
        controllers_WidgetController_list1_invoker.call(WidgetController_0.list)
      }
  
    // @LINE:10
    case controllers_WidgetController_listing2_route(params@_) =>
      call { 
        controllers_WidgetController_listing2_invoker.call(WidgetController_0.listing)
      }
  
    // @LINE:11
    case controllers_WidgetController_create3_route(params@_) =>
      call { 
        controllers_WidgetController_create3_invoker.call(WidgetController_0.create)
      }
  
    // @LINE:12
    case controllers_WidgetController_delete4_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_WidgetController_delete4_invoker.call(WidgetController_0.delete(name))
      }
  
    // @LINE:13
    case controllers_WidgetController_editing5_route(params@_) =>
      call(params.fromPath[String]("name", None)) { (name) =>
        controllers_WidgetController_editing5_invoker.call(WidgetController_0.editing(name))
      }
  
    // @LINE:14
    case controllers_WidgetController_editList6_route(params@_) =>
      call { 
        controllers_WidgetController_editList6_invoker.call(WidgetController_0.editList)
      }
  
    // @LINE:18
    case controllers_Assets_versioned7_route(params@_) =>
      call(Param[String]("path", Right("/public")), params.fromPath[Asset]("file", None)) { (path, file) =>
        controllers_Assets_versioned7_invoker.call(Assets_1.versioned(path, file))
      }
  }
}
