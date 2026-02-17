package com.miempresa.controller;

import java.net.URL;
import java.util.ResourceBundle;

import org.springframework.stereotype.Component;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import com.miempresa.banco.Cliente;

@Component
public class ListaClientesController implements Initializable {

    @FXML 
    private TableView<Cliente> tablaClientes;
    @FXML 
    private TableColumn<Cliente, String> colNombre;
    @FXML 
    private TableColumn<Cliente, String> colApellido;
    @FXML
    private TableColumn<Cliente, String> colEmail;
    @FXML
    private TableColumn<Cliente, String> colTelefono;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    	tablaClientes.setColumnResizePolicy(TableView.UNCONSTRAINED_RESIZE_POLICY);

    	colNombre.setPrefWidth(120);
    	colApellido.setPrefWidth(140);
    	colEmail.setPrefWidth(220);
    	colTelefono.setPrefWidth(120);    
        // Configurar columnas      
        colNombre.setCellValueFactory(new PropertyValueFactory<>("nombre"));
        colApellido.setCellValueFactory(new PropertyValueFactory<>("apellidos"));
        colEmail.setCellValueFactory(new PropertyValueFactory<>("email"));
        colTelefono.setCellValueFactory(new PropertyValueFactory<>("telefono"));
        // Datos de prueba
        ObservableList<Cliente> clientes = FXCollections.observableArrayList(
                new Cliente("Ana", "López","analopez@gmail.com","985111212"),
                new Cliente("Carlos", "Pérez","carlospe@gmail.com","984112563"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("Carlos", "Pérez","carlospe@gmail.com","984112563"),
                new Cliente("Carlos", "Pérez","carlospe@gmail.com","984112563"),
                new Cliente("Carlos", "Pérez","carlospe@gmail.com","984112563"),
                new Cliente("Carlos", "Pérez","carlospe@gmail.com","984112563"),
                new Cliente("Carlos", "Pérez","carlospe@gmail.com","984112563"),
                new Cliente("Carlos", "Pérez","carlospe@gmail.com","984112563"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269"),
                new Cliente("María", "Gómez","mariagomez@gmail.com","985125269")
        );

        tablaClientes.setItems(clientes);
    }
}