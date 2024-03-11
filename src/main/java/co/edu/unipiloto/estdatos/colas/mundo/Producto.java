/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;

import co.edu.unipiloto.estdatos.colas.estructuras.ItemCola;
import java.util.Iterator;

/**
 *
 * @author Acer
 */
public class Producto<T> {
    private Producto<T> siguiente;
	 T valor;
       
        private int tiempoPreparacion;
        private int costo;
	
	public Producto(T cont, int tiempoPreparacion, int costo){
	 
       
        this.tiempoPreparacion = tiempoPreparacion;
        this.costo = costo;
            valor = cont;
		siguiente = null;	
	}
      
	public Producto<T> getSiguiente() {
		return siguiente;
	}

	public void setSiguiente(Producto<T> siguiente) {
		this.siguiente = siguiente;
	}

	public T getValor() {
		return valor;
	}

	public void setValor(T valor) {
		this.valor = valor;

        }


    public int getTiempoPreparacion() {
        return tiempoPreparacion;
    }

    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public int getCosto() {
        return costo;
    }

    public void setCosto(int costo) {
        this.costo = costo;
    }


	
	
    

	
        
}
