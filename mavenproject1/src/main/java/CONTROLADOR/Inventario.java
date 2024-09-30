/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CONTROLADOR;

import java.util.ArrayList;

/**
 *
 * @author SAlA-9
 */
public class Inventario {
    ArrayList<Zapato> listaZapatos;

    public Inventario() {
        this.listaZapatos = new ArrayList<Zapato>();
    }

    public ArrayList getListaZapatos() {
        return listaZapatos;
    }

    public void setListaZapatos(ArrayList listaZapatos) {
        this.listaZapatos = listaZapatos;
    }
    
    public void agregarZapatoLista(Zapato z1){
    
        listaZapatos.add(z1);
    }
    
    public Zapato buscarZapato(String nombreZapato){
        
        for (Zapato cadaZapato : listaZapatos) {
            
            if(nombreZapato == cadaZapato.getNombre()){
                return cadaZapato;
            }
        }
        return null;
        
    }

    @Override
    public String toString() {
        return "Inventario{" + "listaZapatos=" + listaZapatos + '}';
    }
    
    public void mostrarTodosZapatos(){
        System.out.println(this.toString());
    }
    
}
