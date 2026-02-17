
package com.miempresa.banco;

import java.util.HashMap;
import java.util.Map;

/**
 * Banco que gestiona clientes por su nombre.
 */
public class Banco {
    private final Map<String, Cliente> clientes = new HashMap<>();

    
    public void registrarCliente(Cliente cliente) {
        clientes.put(cliente.getNombreCompleto(), cliente);
    }

    /** Busca un cliente por nombre.
     * 
     */
    public Cliente buscarCliente(String nombre) { return clientes.get(nombre); }

    /**  */
    public int getNumeroClientes() { return clientes.size(); }
}
