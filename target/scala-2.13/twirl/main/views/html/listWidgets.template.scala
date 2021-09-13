
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

object listWidgets extends _root_.play.twirl.api.BaseScalaTemplate[play.twirl.api.HtmlFormat.Appendable,_root_.play.twirl.api.Format[play.twirl.api.HtmlFormat.Appendable]](play.twirl.api.HtmlFormat) with _root_.play.twirl.api.Template4[Seq[PersonalData],Form[WidgetForm.Data],Call,MessagesRequestHeader,play.twirl.api.HtmlFormat.Appendable] {

  /**/
  def apply/*1.2*/(widgets: Seq[PersonalData], form: Form[WidgetForm.Data], postUrl: Call)(implicit request: MessagesRequestHeader):play.twirl.api.HtmlFormat.Appendable = {
    _display_ {
      {


Seq[Any](format.raw/*2.1*/("""
  """),_display_(/*3.4*/main("Personal")/*3.20*/ {_display_(Seq[Any](format.raw/*3.22*/("""

"""),format.raw/*5.36*/("""
"""),_display_(/*6.2*/request/*6.9*/.flash.data.map/*6.24*/{ case (name, value) =>_display_(Seq[Any](format.raw/*6.47*/("""
"""),format.raw/*7.1*/("""<div>"""),_display_(/*7.7*/name),format.raw/*7.11*/(""": """),_display_(/*7.14*/value),format.raw/*7.19*/("""</div>
""")))}),format.raw/*8.2*/("""


    """),format.raw/*11.5*/("""<h1>Personal Details</h1>
    <button><a href=""""),_display_(/*12.23*/routes/*12.29*/.WidgetController.listing),format.raw/*12.54*/("""">Add</a> </button>

    <table>
      <thead>
      <tr><th>Name</th><th>Age</th><th>Address</th></tr>
      </thead>
      <tbody>
      """),_display_(/*19.8*/for(w <- widgets) yield /*19.25*/ {_display_(Seq[Any](format.raw/*19.27*/("""
        """),format.raw/*20.9*/("""<tr><td>"""),_display_(/*20.18*/w/*20.19*/.name),format.raw/*20.24*/("""</td>
            <td>"""),_display_(/*21.18*/w/*21.19*/.age),format.raw/*21.23*/("""</td>
            <td>"""),_display_(/*22.18*/w/*22.19*/.address),format.raw/*22.27*/("""</td>
            <td><a href=""""),_display_(/*23.27*/routes/*23.33*/.WidgetController.delete(w.name)),format.raw/*23.65*/("""">Delete</a></td>
            <td><a href=""""),_display_(/*24.27*/routes/*24.33*/.WidgetController.editing(w.name)),format.raw/*24.66*/("""">Edit</a></td></tr>
      """)))}),format.raw/*25.8*/("""
      """),format.raw/*26.7*/("""</tbody>
    </table>

    <hr/>

  """)))}),format.raw/*31.4*/("""
"""))
      }
    }
  }

  def render(widgets:Seq[PersonalData],form:Form[WidgetForm.Data],postUrl:Call,request:MessagesRequestHeader): play.twirl.api.HtmlFormat.Appendable = apply(widgets,form,postUrl)(request)

  def f:((Seq[PersonalData],Form[WidgetForm.Data],Call) => (MessagesRequestHeader) => play.twirl.api.HtmlFormat.Appendable) = (widgets,form,postUrl) => (request) => apply(widgets,form,postUrl)(request)

  def ref: this.type = this

}


              /*
                  -- GENERATED --
                  SOURCE: app/views/listWidgets.scala.html
                  HASH: 2339df198470ae51112c23266074bddd9a84fb99
                  MATRIX: 795->1|1002->115|1031->119|1055->135|1094->137|1123->174|1150->176|1164->183|1187->198|1247->221|1274->222|1305->228|1329->232|1358->235|1383->240|1420->248|1454->255|1529->303|1544->309|1590->334|1756->474|1789->491|1829->493|1865->502|1901->511|1911->512|1937->517|1987->540|1997->541|2022->545|2072->568|2082->569|2111->577|2170->609|2185->615|2238->647|2309->691|2324->697|2378->730|2436->758|2470->765|2537->802
                  LINES: 21->1|26->2|27->3|27->3|27->3|29->5|30->6|30->6|30->6|30->6|31->7|31->7|31->7|31->7|31->7|32->8|35->11|36->12|36->12|36->12|43->19|43->19|43->19|44->20|44->20|44->20|44->20|45->21|45->21|45->21|46->22|46->22|46->22|47->23|47->23|47->23|48->24|48->24|48->24|49->25|50->26|55->31
                  -- GENERATED --
              */
          