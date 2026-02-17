
package com.miempresa.banco;

import java.util.ArrayList;
import java.util.List;

/**
 * Cliente bancario que puede poseer múltiples {@link Cuenta cuentas}.
 */
public class Cliente {
    private String nombreCompleto;
    private String nombre;
    private String apellidos;
    private String email;
    private String telefono;
    
    private final List<Cuenta> cuentas = new ArrayList<>();
   
    public Cliente(String nombre, String apellidos, String email, String tf) {
        this.nombre = nombre;
        this.apellidos=apellidos;
        this.email=email;
        this.telefono=tf;
    }
    
    public void abrirCuenta(Cuenta cuenta) { cuentas.add(cuenta); }
    
    public List<Cuenta> getCuentas() { return cuentas; }

    /** @return nombre completo del cliente */
    public String getNombreCompleto() { return nombreCompleto; }

	public String getNombre() {
		return nombre;
	}

	public String getApellidos() {
		return apellidos;
	}

	public String getEmail() {
		return email;
	}

	public String getTelefono() {
		return telefono;
	}
    
}
