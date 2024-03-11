/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.mundo;


import java.util.Iterator;

/**
 *
 * @author Acer
 */
public class ListaDobleEncadenada<T extends Comparable<? super T>> implements Iterable<T>{
	
	private Producto<T> primero;
	private Producto<T> ultimo;
	private int tamanio;
         
        private class Node<T> {

        T item;
        Node next,previo;

        //constructor
        private Node() {
            this.next = null;
            this.item = null;
        }

        private Node(T item) {
            this.item = item;
            this.next = null;
        }

    }
	
        
	public boolean isEmpty(){
		return tamanio==0;
	}
	
	public int size(){
		return tamanio;
	}
	
	public void addLast(T valor,int temp,int val){
		Producto<T> nuevo = new Producto<T>(valor,tamanio, val);
		if(primero == null)
		{
			primero = ultimo = nuevo;
		}
		else{
			ultimo.setSiguiente(nuevo);
			ultimo = nuevo;
		}
		tamanio++;
	}
	public void addFirst(T valor,int temp,int val){
		Producto<T> nuevo = new Producto<T>(valor, tamanio, val);
		if(primero == null)
		{
			primero = ultimo = nuevo;
		}
		else{
			ultimo.setSiguiente(ultimo);
			primero = nuevo;
		}
		tamanio++;
	}
	
	public T removeFirst(){
		if (isEmpty())
			return null;
		T ret = primero.getValor();
		primero = primero.getSiguiente();
		tamanio--;
		return ret;
		
	}
        public T removeLast(){
		if (isEmpty())
			return null;
		T ret = ultimo.getValor();
		ultimo = ultimo.getSiguiente();
		tamanio--;
		return ret;
		
	}
        //buscar
      public Producto BuscarItem(T item, Producto temp){
        
        if(item==null){
        return null;
        }
        
        if(item.equals(temp.valor)){
        return temp;
        }
        
       
        return null;
    }
    
    public Producto BuscarItem(T item){
    Producto recorre = primero;
       return BuscarItem(item, recorre);
    } 
      

	@Override
	public Iterator<T> iterator() {
		// TODO Auto-generated method stub
		return new ListaIterator();
		
		
	}
	
	private class ListaIterator implements Iterator<T>{
		
		private Producto<T> actual = primero;

		@Override
		public boolean hasNext() {
			// TODO Auto-generated method stub
			return actual!=null;
		}

		@Override
		public T next() {
			// TODO Auto-generated method stub
			T ret = actual.getValor();
			actual = actual.getSiguiente();
			return ret;
		}

		@Override
		public void remove() {
			// TODO Auto-generated method stub
			
		}
		
	}

}
 
    

