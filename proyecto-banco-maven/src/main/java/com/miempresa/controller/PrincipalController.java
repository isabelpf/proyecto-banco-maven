/**
 * Clase PrincipalController.java
 * 
 * @author ISABEL JARDÓN RUDEIROS
 * @version 1.0
 */

package com.miempresa.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.miempresa.application.config.SpringFXMLLoader;
import com.miempresa.view.FxmlView;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.layout.BorderPane;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.stage.Modality;
import javafx.stage.Stage;

@Component
public class PrincipalController implements Initializable {

	@FXML
	private BorderPane root;

	@Autowired
	private SpringFXMLLoader loader;
	
	@FXML
	private MenuItem openHelp;

	/**
	 * Caraga la vista que se le pasa en el centro del layout
	 * 
	 * @param view
	 */
	public void loadCenter(FxmlView view) {
		try {
			Parent vista = loader.load(view.getFxmlFile());
			root.setCenter(vista);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	@FXML
	private void listarClientes() {
		loadCenter(FxmlView.LISTAR_CLIENTES);
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		// TODO Auto-generated method stub

	}

	@FXML
	public void handleAyuda() {
		try {
			// 1- Hay que localiza el recurso en el classpath:
			// src/main/resources/help/help.html
			URL helpUrl = getClass().getResource("/help/help.html");
			if (helpUrl == null) {
				// Si no se puede encontrar el recurso, se muestra un aviso
				mostrarMensajeAyudaNoDisponible("No disponible");
				return;
			}

			// 2- Se crea el visor WebView y se carga la página html
			WebView webView = new WebView();
			WebEngine engine = webView.getEngine();
			engine.load(helpUrl.toExternalForm());

			// 3- Se crea y se muestra la ventana modal con el visor
			Stage helpStage = new Stage();
			helpStage.setTitle("Sistema de Ayuda de la Aplicación");
			helpStage.initModality(Modality.APPLICATION_MODAL);
			helpStage.setScene(new Scene(webView, 400, 500));
			helpStage.show();
		} catch (Exception ex) {
			ex.printStackTrace();
			mostrarMensajeAyudaNoDisponible("No Disponible");
		}
	}
	private void mostrarMensajeAyudaNoDisponible(String msg) {
		Alert a = new Alert(Alert.AlertType.ERROR);
		a.setTitle("Sistema de Ayuda");
		a.setHeaderText("No se pudo cargar la ayuda");
		a.setContentText(msg);
		a.showAndWait();
	}


}
