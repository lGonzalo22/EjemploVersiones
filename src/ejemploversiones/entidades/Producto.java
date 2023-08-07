/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploversiones.entidades;

/**
 *
 * @author gonza
 */
public class Producto {
    
    
    private String comida;
    private int numero;

    public Producto(String comida, int numero) {
        this.comida = comida;
        this.numero = numero;
    }

    public String getComida() {
        return comida;
    }

    public void setComida(String comida) {
        this.comida = comida;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
    
    
}
