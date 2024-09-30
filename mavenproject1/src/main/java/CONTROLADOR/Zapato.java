/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

/**
 *
 * @author SAlA-9
 */
public class Zapato {
    
    //Atributos
    String nombre;
    int talla;
    double precio;

    public Zapato(String nombre, int talla, double precio) {
        this.nombre = nombre;
        this.talla = talla;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getTalla() {
        return talla;
    }

    public void setTalla(int talla) {
        this.talla = talla;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Zapato{" + "nombre=" + nombre + ", talla=" + talla + ", precio=" + precio + '}';
    }
    
    
    
    
}
