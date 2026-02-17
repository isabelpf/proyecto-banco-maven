
package com.miempresa.banco;

/**
 * Representa una cuenta bancaria con operaciones de ingreso y retirada de saldo.
 * Cada cuenta pertenece a un {@link Cliente}.
 */
public class Cuenta {
   
    private String titular;
   
    private double saldo;

    
    public Cuenta(String titular, double saldoInicial) {
        this.titular = titular;
        this.saldo = saldoInicial;
    }

    /**
     * Ingresa una cantidad positiva en la cuenta.
     * 
     */
    public void ingresar(double cantidad) {
        if (cantidad <= 0) throw new IllegalArgumentException("cantidad debe ser > 0");
        saldo += cantidad;
    }

    /**
     * Retira una cantidad positiva si hay saldo suficiente.
     * 
     */
    public void retirar(double cantidad) {
        if (cantidad <= 0 || cantidad > saldo)
            throw new IllegalArgumentException("operación inválida");
        saldo -= cantidad;
    }

   
    public double getSaldo() { return saldo; }
  
    public String getTitular() { return titular; }
}
