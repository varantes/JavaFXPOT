package br.neto.javafxpot

import javafx.application.Platform
import javafx.event.ActionEvent
import javafx.fxml.FXML
import javafx.scene.control.Label
import java.net.URL
import java.util.*
import kotlin.concurrent.thread

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
        }
        println("[${Thread.currentThread().name}]  Botão acionado fora do runLater")
    }

    @FXML
    fun onBtn2Action(event: ActionEvent) {
        Platform.runLater {
            thread {
                println("[${Thread.currentThread().name}]  Botão 2 acionado dentro do runLater")

                // Sem usar o runLater, dá erro de Thread-* não pode manipular componentes do JavaFX
                Platform.runLater {
                    lblStatusValue.text = "Botão 2 acionado"
                }
            }
        }
        println("[${Thread.currentThread().name}]  Botão 2 acionado fora do runLater")
    }

}
