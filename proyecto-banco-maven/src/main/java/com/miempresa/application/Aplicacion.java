/**
 * Clase Application.java
 * 
 * @author ISABEL JARDÓN RUDEIROS
 * @version 1.0
 */

package com.miempresa.application;

import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

import com.miempresa.SpringBootApp;
import com.miempresa.application.config.StageManager;
import com.miempresa.view.FxmlView;

import javafx.application.Application;
import javafx.stage.Stage;

public class Aplicacion extends Application {
	protected ConfigurableApplicationContext springContext;
	protected StageManager stageManager;

	@Override
	public void init() {
		springContext = new SpringApplicationBuilder(SpringBootApp.class).run();
	}

	@Override
	public void start(Stage primaryStage) {

		// 1) Obtener StageManager
		stageManager = springContext.getBean(StageManager.class);

		// 2) Pasar Stage de JavaFX
		stageManager.setPrimaryStage(primaryStage);

		// 3) Cargar primera vista
		displayInitialScene();
	}

	@Override
	public void stop() {
		springContext.close();
	}

	public static void main(String[] args) {
		launch(args);
	}

	/**
	 * Useful to override this method by sub-classes wishing to change the first
	 * Scene to be displayed on startup. Example: Functional tests on main
	 * window.
	 */
	protected void displayInitialScene() {
		stageManager.switchScene(FxmlView.PRINCIPAL);
	}

//	private ConfigurableApplicationContext springBootApplicationContext() {
//
//		SpringApplicationBuilder builder = new SpringApplicationBuilder(
//				Aplicacion.class);
//		String[] args = getParameters().getRaw().stream()
//				.toArray(String[]::new);
//		return builder.run(args);
//	}

}
