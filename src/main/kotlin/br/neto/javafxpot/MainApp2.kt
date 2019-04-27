package br.neto.javafxpot

import javafx.application.Application
import javafx.application.Application.launch
import javafx.scene.Scene
import javafx.stage.Stage
import javafx.fxml.FXMLLoader
import javafx.scene.Parent
import javafx.fxml.FXML
import javafx.scene.control.Label


class MyApp2 : Application() {

    override fun start(palco: Stage) {
        val arquivoFXML = javaClass.getResource(
                "./main.fxml")
        val fxmlLoader = FXMLLoader(arquivoFXML)
        val fxmlParent = fxmlLoader.load() as Parent
        palco.scene = Scene(fxmlParent, 600.0, 600.0)
        palco.title = "Olá mundo com FXML"

        val controller = fxmlLoader.getController<MainController>()
        println("controller.lblStatusValue = ${controller.lblStatusValue}")

        palco.show()

        println("depois de palco.show()")
    }
}

//fun main() = println("Oi, Valdemar.")
fun main() = launch(MyApp2::class.java)

