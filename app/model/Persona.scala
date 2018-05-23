package model

import play.api.data.Form

case class Persona(nombre:String, apellido: String, telefono: String, edad: Int )

object Persona {
  val form = Form (
    mapping()
  )
}
