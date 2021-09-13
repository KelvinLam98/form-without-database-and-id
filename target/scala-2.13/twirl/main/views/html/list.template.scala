
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

object list extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[PersonalData],Form[WidgetForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(widgets: Seq[PersonalData], form: Form[WidgetForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*1.115*/("""


"""),_display_(/*4.2*/main("Add")/*4.13*/ {_display_(Seq[Any](format.raw/*4.15*/("""


"""),format.raw/*7.62*/("""
"""),_display_(/*8.2*/if(form.hasGlobalErrors)/*8.26*/ {_display_(Seq[Any](format.raw/*8.28*/("""
"""),_display_(/*9.2*/form/*9.6*/.globalErrors.map/*9.23*/ { error: FormError =>_display_(Seq[Any](format.raw/*9.45*/("""
"""),format.raw/*10.1*/("""<div>
    """),_display_(/*11.6*/error/*11.11*/.key),format.raw/*11.15*/(""": """),_display_(/*11.18*/error/*11.23*/.message),format.raw/*11.31*/("""
"""),format.raw/*12.1*/("""</div>
""")))}),format.raw/*13.2*/("""
""")))}),format.raw/*14.2*/("""

    """),_display_(/*16.6*/helper/*16.12*/.form(postUrl)/*16.26*/ {_display_(Seq[Any](format.raw/*16.28*/("""
    """),_display_(/*17.6*/helper/*17.12*/.CSRF.formField),format.raw/*17.27*/("""

    """),_display_(/*19.6*/helper/*19.12*/.inputText(form("name"))),format.raw/*19.36*/("""

    """),_display_(/*21.6*/helper/*21.12*/.inputText(form("age"))),format.raw/*21.35*/("""

    """),_display_(/*23.6*/helper/*23.12*/.inputText(form("address"))),format.raw/*23.39*/("""

    """),format.raw/*25.5*/("""<button>Add</button>

    """)))}),format.raw/*27.6*/("""
""")))}))
      }
    }
  }

  def render(widgets:Seq[PersonalData],form:Form[WidgetForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form,postUrl)(request)

  def f:((Seq[PersonalData],Form[WidgetForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form,postUrl) => (request) => apply(widgets,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/list.scala.html
                  HASH: 1cdfedb2d44ec4475c48a96124bfa7472fcff726
                  MATRIX: 788->1|997->114|1029->121|1048->132|1087->134|1120->201|1148->204|1180->228|1219->230|1247->233|1258->237|1283->254|1342->276|1371->278|1409->290|1423->295|1448->299|1478->302|1492->307|1521->315|1550->317|1589->326|1622->329|1657->338|1672->344|1695->358|1735->360|1768->367|1783->373|1819->388|1854->397|1869->403|1914->427|1949->436|1964->442|2008->465|2043->474|2058->480|2106->507|2141->515|2200->544
                  LINES: 21->1|26->1|29->4|29->4|29->4|32->7|33->8|33->8|33->8|34->9|34->9|34->9|34->9|35->10|36->11|36->11|36->11|36->11|36->11|36->11|37->12|38->13|39->14|41->16|41->16|41->16|41->16|42->17|42->17|42->17|44->19|44->19|44->19|46->21|46->21|46->21|48->23|48->23|48->23|50->25|52->27
                  -- GENERATED --
              */
          