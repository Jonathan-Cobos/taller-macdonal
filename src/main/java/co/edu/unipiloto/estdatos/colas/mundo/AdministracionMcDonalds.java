package co.edu.unipiloto.estdatos.colas.mundo;

import co.edu.unipiloto.estdatos.colas.estructuras.Cola;
import java.util.Iterator;



public class AdministracionMcDonalds{
	
	private Cola<String> colaClientes;
	private Cola<Pedido> colaPedidos;
        private ListaDobleEncadenada<String> listaProductos;
	


////pedidos 
        
        public Pedido nuevoPedido(int hora, Producto pro, String direc){
         Pedido orden= new Pedido(hora, pro, direc);
            
            return orden;
        }
        public Producto buscarProducto(String item){
        return listaProductos.BuscarItem(item);   
        }
	
        
     //administracion    
	public AdministracionMcDonalds(){
		colaClientes=new Cola<String>();
		colaPedidos=new Cola<Pedido>();
                listaProductos=new ListaDobleEncadenada<String>();
	}
	
        ////producto   
        public void agregarProductoFirst(String nom,int tiempo,int valor ){
        listaProductos.addFirst(nom, tiempo, valor);
        }
        public void agregarProductoLast(String nom,int tiempo,int valor ){
        listaProductos.addLast(nom, tiempo, valor);
        }
        public void quitarProductoFisrt(){
        listaProductos.removeFirst();
        }
        public void quitarProductoLast(){
        listaProductos.removeLast();
        }
        public void cantidadProductos(){
        listaProductos.size();
        }
        
        public Iterator<String> Productos(){
		return listaProductos.iterator();
	}
        
        
        
        /////////clientes      
	public void agregarCliente(String nombre){
		colaClientes.encolar(nombre);
	}
///	
	public String atenderCliente(Pedido pedido){
		try {
			Thread.sleep(100);
		} catch (InterruptedException e) {

		}
		colaPedidos.encolar(pedido);
		return colaClientes.desencolar();
	}
	
	public String entregarPedido(){
		Pedido p = colaPedidos.desencolar();
               
                String c= colaClientes.desencolar();
                return c;
	}
	
	public int clientesEnFila(){
		return colaClientes.tamanio();
	}
	
	public int pedidosEnEspera(){
		return colaPedidos.tamanio();
	}
	
	public Iterator<String> clientes(){
		return colaClientes.iterator();
	}
	
	public Iterator<Pedido> mostarPedidos(){
		return colaPedidos.iterator();
	}
}

