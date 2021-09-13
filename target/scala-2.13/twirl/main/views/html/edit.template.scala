
package views.html

import _root_.play.twirl.api.TwirlFeatureImports._
import _root_.play.twirl.api.TwirlHelperImports._
import _root_.play.twirl.api.Html
import _root_.play.twirl.api.JavaScript
import _root_.play.twirl.api.Txt
import _root_.play.twirl.api.Xml
import models._
import controllers._
import play.api.i18n._
import views.html._
import play.api.templates.PlayMagic._
import play.api.mvc._
import play.api.data._

object edit extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Form[WidgetForm.Data],Array[String],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(form: Form[WidgetForm.Data], errors: Array[String], postUpdate: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.113*/("""


"""),_display_(/*4.2*/main("Edit")/*4.14*/ {_display_(Seq[Any](format.raw/*4.16*/("""

"""),format.raw/*6.1*/("""<h1>Edit</h1>

"""),format.raw/*8.62*/("""
"""),_display_(/*9.2*/if(form.hasGlobalErrors)/*9.26*/ {_display_(Seq[Any](format.raw/*9.28*/("""
"""),_display_(/*10.2*/form/*10.6*/.globalErrors.map/*10.23*/ { error: FormError =>_display_(Seq[Any](format.raw/*10.45*/("""
"""),format.raw/*11.1*/("""<div>
"""),_display_(/*12.2*/error/*12.7*/.key),format.raw/*12.11*/(""": """),_display_(/*12.14*/error/*12.19*/.message),format.raw/*12.27*/("""
"""),format.raw/*13.1*/("""</div>
""")))}),format.raw/*14.2*/("""
""")))}),format.raw/*15.2*/("""

"""),_display_(/*17.2*/helper/*17.8*/.form(postUpdate)/*17.25*/ {_display_(Seq[Any](format.raw/*17.27*/("""
"""),_display_(/*18.2*/helper/*18.8*/.CSRF.formField),format.raw/*18.23*/("""

"""),_display_(/*20.2*/helper/*20.8*/.inputText(form("name"))),format.raw/*20.32*/("""

"""),_display_(/*22.2*/helper/*22.8*/.inputText(form("age"))),format.raw/*22.31*/("""

"""),_display_(/*24.2*/helper/*24.8*/.inputText(form("address"))),format.raw/*24.35*/("""

"""),format.raw/*26.1*/("""<button>Edit</button>

""")))}),format.raw/*28.2*/("""
""")))}))
      }
    }
  }

  def render(form:Form[WidgetForm.Data],errors:Array[String],postUpdate:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(form,errors,postUpdate)(request)

  def f:((Form[WidgetForm.Data],Array[String],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (form,errors,postUpdate) => (request) => apply(form,errors,postUpdate)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/edit.scala.html
                  HASH: 4780fb87196e2de999dbb2b3d2433b6cec6bdc46
                  MATRIX: 784->1|991->112|1023->119|1043->131|1082->133|1112->137|1156->215|1184->218|1216->242|1255->244|1284->247|1296->251|1322->268|1382->290|1411->292|1445->300|1458->305|1483->309|1513->312|1527->317|1556->325|1585->327|1624->336|1657->339|1688->344|1702->350|1728->367|1768->369|1797->372|1811->378|1847->393|1878->398|1892->404|1937->428|1968->433|1982->439|2026->462|2057->467|2071->473|2119->500|2150->504|2206->530
                  LINES: 21->1|26->1|29->4|29->4|29->4|31->6|33->8|34->9|34->9|34->9|35->10|35->10|35->10|35->10|36->11|37->12|37->12|37->12|37->12|37->12|37->12|38->13|39->14|40->15|42->17|42->17|42->17|42->17|43->18|43->18|43->18|45->20|45->20|45->20|47->22|47->22|47->22|49->24|49->24|49->24|51->26|53->28
                  -- GENERATED --
              */
          