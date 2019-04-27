package br.neto.javafxpot

import javafx.application.Platform
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label
import java.net.URL
import java.util.*

class MainController {

    @FXML
    private var resources: ResourceBundle? = null

    @FXML
    private var location: URL? = null

    @FXML
    lateinit var lblStatusLabel: Label

    @FXML
    lateinit var lblStatusValue: Label

    @FXML
    fun onBtnAction(event: ActionEvent) {
        Platform.runLater {
            println("[${Thread.currentThread().name}]  Botão acionado dentro do runLater")
            lblStatusValue.text = "Botão acionado"
            lblStatusValue.style = "-fx-background-color: green;"
        }
        println("[${Thread.currentThread().name}]  Botão acionado fora do runLater")
    }

}
