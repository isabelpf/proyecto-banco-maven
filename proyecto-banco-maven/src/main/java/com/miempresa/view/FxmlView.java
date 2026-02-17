package com.miempresa.view;

import java.util.ResourceBundle;

public enum FxmlView {
	PRINCIPAL {
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("principal.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/Principal.fxml";
		}
	},
	LISTAR_CLIENTES{
		@Override
		public String getTitle() {
			return getStringFromResourceBundle("principal.title");
		}

		@Override
		public String getFxmlFile() {
			return "/fxml/ListaClientes.fxml";
		}
	};
	
	
	public abstract String getTitle();
	public abstract String getFxmlFile();

	String getStringFromResourceBundle(String key) {
		return ResourceBundle.getBundle("Bundle").getString(key);
	}
}
