package controllers

import javax.inject.Inject
import play.api.mvc.{AbstractController, ControllerComponents}

class HolaMundoController @Inject()(controllerComponents: ControllerComponents) extends AbstractController(controllerComponents){

  def holaMundo = Action {
    Ok(views.html.holaMundo())
  }

  def holaMundoConParams(name: String) =Action {
    Ok(views.html.holaMundoConParam(name))
  }

}
