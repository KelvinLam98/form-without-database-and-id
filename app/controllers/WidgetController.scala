package controllers

import controllers.WidgetForm.form

import javax.inject.{Inject, Singleton}
import models.{PersonalData}
import play.api.Configuration
import play.api.data._
import play.api.i18n._
import play.api.mvc._

import scala.collection._

/**
 * The classic WidgetController using MessagesAbstractController.
 *
 * Instead of MessagesAbstractController, you can use the I18nSupport trait,
 * which provides implicits that create a Messages instance from a request
 * using implicit conversion.
 *
 * See https://www.playframework.com/documentation/2.8.x/ScalaForms#passing-messagesprovider-to-form-helpers
 * for details.
 */
@Singleton
class WidgetController @Inject()(cc: MessagesControllerComponents) extends MessagesAbstractController(cc) {
  import WidgetForm._

  private var personalDetail = mutable.ArrayBuffer(
    PersonalData("Emily", 25, "Kepong"),
    PersonalData("John", 30, "Old Klang Road"),
    PersonalData("Jacky", 27, "Cheras")
  )

  // The URL to the widget.  You can call this directly from the template, but it
  // can be more convenient to leave the template completely stateless i.e. all
  // of the "WidgetController" references are inside the .scala file.
  private val postUrl = routes.WidgetController.create
  private val postUpdate = routes.WidgetController.editList

  def index = Action {
    Ok(views.html.index())
  }

  def list = Action { implicit request: MessagesRequest[AnyContent] =>
    // Pass an unpopulated form to the template
    Ok(views.html.listWidgets(personalDetail.toSeq, form, postUrl))
  }

  def listing = Action { implicit request: MessagesRequest[AnyContent] =>
    Ok(views.html.list(personalDetail.toSeq, form, postUrl))
  }

  def editing(name: String) = Action { implicit request: MessagesRequest[AnyContent] =>
    val editData = personalDetail.find(_.name == name)
    editData.map{ e =>
      val (form, errors) =
        request.flash.get("errors") match {
          case Some(errorsStr) =>
            (WidgetForm.form.bind(request.flash.data), errorsStr.split(","))
          case None =>
            (WidgetForm.form.fill(Data(e.name, e.age, e.address)), Array.empty[String])
        }
    Ok(views.html.edit(form, errors, postUpdate))
  }.getOrElse(NotFound)
  }

//  def editing(name: String) = Action { implicit request: MessagesRequest[AnyContent] =>
//    Ok(views.html.edit(personalDetail.toSeq, form, postUpdate))
//  }
//
  def editList = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { form: Form[Data] =>
      BadRequest(views.html.listWidgets(personalDetail.toSeq, form, postUpdate))
    }

    val successFunction = { data: Data =>
      val editData = personalDetail.find(_.name == data.name)

      val insertData = PersonalData(name = data.name, age = data.age, address = data.address)

      editData.foreach(e => personalDetail.update(personalDetail.indexOf(e), insertData: PersonalData))

      Redirect(routes.WidgetController.list).flashing("note" -> "Personal Details edited!")
    }

    val formValidationResult = form.bindFromRequest()
    formValidationResult.fold(errorFunction, successFunction)
  }


  // This will be the action that handles our form post
  def create = Action { implicit request: MessagesRequest[AnyContent] =>
    val errorFunction = { form: Form[Data] =>
      // This is the bad case, where the form had validation errors.
      // Let's show the user the form again, with the errors highlighted.
      // Note how we pass the form with errors to the template.
      BadRequest(views.html.listWidgets(personalDetail.toSeq, form, postUrl))
    }

    val successFunction = { data: Data =>
      // This is the good case, where the form was successfully parsed as a Data object.
      val personalData = PersonalData(name = data.name, age = data.age, address = data.address)
      personalDetail += personalData
      Redirect(routes.WidgetController.list).flashing("note" -> "Personal Details added!")
    }

    val formValidationResult = form.bindFromRequest()
    formValidationResult.fold(errorFunction, successFunction)
  }

  def delete(name: String) = Action { implicit request =>

    val del = personalDetail.find(_.name == name)
    del.map(d => personalDetail.remove(personalDetail.indexOf(d)))
    Redirect(routes.WidgetController.list).flashing("note" -> "Personal Details Deleted!")
  }

//  def editCurrency(id: Long) = SecuredAction(AccessRight.CURRENCIES_SETUP) { implicit request =>
//    db.withConnection { implicit conn =>
//      Currency.findById(id).map { currency =>
//        val (form, errors) =
//          request.flash.get("errors") match {
//            case Some(errorsStr) =>
//              (currencyDataForm.bind(request.flash.data), errorsStr.split(","))
//            case None =>
//              (currencyDataForm.fill(Currency(currency.id, currency.code, currency.description, currency.sign)), Array.empty[String])
//          }
//        Ok(views.html.vanli_ui.currencies.currencyForm("edit", form, errors))
//      }.getOrElse(NotFound)
//    }
//  }

//  def edit(name: String) = Action { implicit request: MessagesRequest[AnyContent] =>
//    val errorFunction = { form: Form[Data] =>
//      BadRequest(views.html.listWidgets(personalDetail.toSeq, form, postUrl))
//    }
//
//    val successFunction = { e:Data =>
//      val editData = personalDetail.find(_.name == name)
//
//      Redirect(routes.WidgetController.list).flashing("note" -> "Personal Details edited!")
//    }
//
//    val formValidationResult = editForm.bindFromRequest()
//    formValidationResult.fold(errorFunction, successFunction)
//  }


}
