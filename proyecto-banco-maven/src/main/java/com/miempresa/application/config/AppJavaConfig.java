/**
 * Clase AppJavaConfig.java
 * 
 * @author ISABEL JARDÓN RUDEIROS
 * @version 1.0
 */

package com.miempresa.application.config;


import java.util.ResourceBundle;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;


@Configuration
public class AppJavaConfig {

	@Autowired
	SpringFXMLLoader springFXMLLoader;

//    /**
//     * Useful when dumping stack trace to a string for logging.
//     * @return ExceptionWriter contains logging utility methods
//     */
//    @Bean
//    @Scope("prototype")
//    public ExceptionWriter exceptionWriter() {
//        return new ExceptionWriter(new StringWriter());
//    }

	@Bean
	public ResourceBundle resourceBundle() {
		return ResourceBundle.getBundle("Bundle");
	}

	/* @Bean */
//    @Lazy(value = true) //Stage only created after Spring context bootstap
//    public StageManager stageManager(Stage stage) throws IOException {
//        return new StageManager(springFXMLLoader);
//    }

}
