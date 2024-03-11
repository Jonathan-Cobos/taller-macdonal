/*
 * CentralPacienteCLI.java
 * This file is part of ISIS1206
 *
 * Copyright (C) 2015 - ISIS1206 Team
 */
package co.edu.unipiloto.estdatos.colas.interfaz;

import co.edu.unipiloto.estdatos.colas.mundo.AdministracionMcDonalds;

import co.edu.unipiloto.estdatos.colas.mundo.Pedido;
import co.edu.unipiloto.estdatos.colas.mundo.Producto;
import java.util.Iterator;
import java.util.Scanner;

//import taller.mundo.*;
//import taller.mundo.AdministracionMcDonalds.Pedido;

public class McDonaldsCLI
{

	private AdministracionMcDonalds admin;

	private Scanner in;

	public McDonaldsCLI() {
		admin = new AdministracionMcDonalds();
		in = new Scanner(System.in);
	}

	public void mainMenu() throws InterruptedException {
		boolean finish = false;
		while (!finish) {
			System.out.println("------------------------------------------");
			System.out.println("-                                        -");
			System.out.println("-        McDonalds - Candelaria          -");
			System.out.println("                                                        \n"+
					"                  ╥╣▒▒▒▒@,        ╥╢▒▒▒▒@╖                            \n"+
					"                ╥▒▒▒▒▄▒▒▒▒▀█▄   ╓╣▒▒▒▄▒▒▒▒▒█▄                         \n"+
					"               ╣▒▒▒▒███╢▒▒▒▒██ ╓▒▒╣▒███╚▒▒╢▒██                        \n"+
					"              ╣▒▒▒▒███  ▒▒▒▒▒█▌▒▒╣▒▓██  ║▒▒▒▒██▄                      \n"+
					"             ╣▒▒▒▒███   ]▒▒╢▒▒╣░║▒▒██U   ╢▒▒▒▒██µ                     \n"+
					"            ║▒▒╣▒▐██     ▒▒▒▒▒░░▒▒▐██     ▒▒▒▒▒██                     \n"+
					"            ╣▒▒▒▒███     ╢▒▒╢╣░║▒▒██▌     ╢▒▒▒▒▀██                    \n"+
					"           ╢▒▒╢▒▒██      ]▒▒▒╣░▒▒▒██      ]▒▒▒▒▒██µ                   \n"+
					"           ╣▒▒▒▒███       ▒▒▒╣░▒▒▐██       ▒▒▒▒▒▀██                   \n"+
					"          ║░░╢▒▒██▌       ▒▒░╢║▒▒██▌       ║▒▒╢▒▒██                   \n"+
					"          ▒░▒▒▒▒██        ╢▒░▒╢▒▒██▌       ]▒▒▒▒▒██▌                  \n"+
					"          ╣░▒▒▒▐██        ║▒░▒▒▒▒██U        ▒▒▒▒▒▐██                  \n"+
					"         ]▒░▒▒▒▐██        ║▒░▒▒▒▒██         ▒▒░▒▒▒██                  \n"+
					"         ║▒░║▒▒██▌        ]▒▒╣▒▒▒██         ▒▒░▒▒▒██                  \n"+
					"         ║▒╢▒▒▒██▌         ╙▓██████         ▒▒╢▒▒▒██                \n"+
					"         ``██████▌          ╙▀▀▀▀▀▀         ``██████                ");
			System.out.println("-                                        -");
			System.out.println("------------------------------------------");
			System.out.println("Bienvenido McDonalds\n");

			System.out.println("Menú principal:");
			System.out.println("-----------------");
			System.out.println("1. Agregar cliente a la cola");
			System.out.println("2. Atender cliente");
			System.out.println("3. Entregar pedido");
			System.out.println("4. Cantidad de clientes en cola");
			System.out.println("5. Cola de pedidos en cocina");
			System.out.println("6. Menu productos");
                        System.out.println("7. Salir");
			System.out.print("\nSeleccione una opción: ");
			int opt1 = in.nextInt();
			in.nextLine();
			switch (opt1) {
			case 1:
				agregarCliente();
				break;
			case 2:
				atenderCliente();
				break;
			case 3:
				entregarPedido();
				break;
			case 4:
				numeroClientes();
				break;
			case 5:
				pedidos();
				break;
			case 6:
                                menuProductos();
				finish = true;
				break;
                        case 7:
                                finish = true;
				break;       
			default:
				break;
			}
		}
	}
        private void menuProductos() throws InterruptedException {
           
            boolean finish = false;
        System.out.println("Menú productos:");
			System.out.println("-----------------");
			System.out.println("1. Mostar productos");
			System.out.println("2. Eliminar ultimo producto");
			System.out.println("3. Eliminar primer producto");
			System.out.println("4. Adicionar al inicio");
			System.out.println("5. Adicionar al final");
			System.out.println("6. Salir");
			System.out.print("\nSeleccione una opción: ");
            
            
            
            int opt2 = in.nextInt();
        in.nextLine();
        switch(opt2){
            case 1: 
                admin.Productos();
                
                break;
            case 2:
                admin.quitarProductoLast();
                break;
            case 3:
                admin.quitarProductoFisrt();
                break;
            case 4:
                System.out.println("---------------------");
                System.out.println("Adicionar un producto");
                System.out.println("---------------------");
                System.out.println("Escriba el nombre del producto");
                String nom=in.nextLine();
                System.out.println("---------------------");
                System.out.println("Escriba el tiempo del producto");
                int tiempo=in.nextInt();
                System.out.println("---------------------");
                System.out.println("Escriba el precio ");
                int pres=in.nextInt();
                admin.agregarProductoFirst(nom, tiempo, pres);
                System.out.println("---------------------");
                System.out.println("se adiciono el producto ");
                admin.Productos();
                break;
            case 5:
                System.out.println("---------------------");
                System.out.println("Adicionar un producto");
                System.out.println("---------------------");
                System.out.println("Escriba el nombre del producto");
                String nom2=in.nextLine();
                System.out.println("---------------------");
                System.out.println("Escriba el tiempo del producto");
                int tiempo2=in.nextInt();
                System.out.println("---------------------");
                System.out.println("Escriba el precio ");
                int pres2=in.nextInt();
                admin.agregarProductoLast(nom2, tiempo2, pres2);
                System.out.println("---------------------");
                System.out.println("se adiciono el producto ");
                admin.Productos();
                break;
            case 6:
                        break;
                  
        }
        
        
        
        }

	private void agregarCliente() throws InterruptedException {
		boolean finish = false;
		String nombre = "";
		while (!finish) {
			System.out.println("Agregar un cliente nuevo a la cola del restaurante");
			System.out.println("----------------------------------");
			System.out.println("Ingrese el nombre del cliente:");
			nombre = in.nextLine();
			admin.agregarCliente(nombre);
			System.out.println("Se agregó el cliente llamando " + nombre + " a la cola del restaurante");
			System.out.println("Presione enter para volver al menú principal");
			in.nextLine();
			finish = true;
		}
		


	}

	private void atenderCliente() throws InterruptedException {
		boolean finish = false;
		if(admin.clientesEnFila() ==0)
		{
			System.out.println("No hay clientes en la fila");
			return;
		}
		while (!finish) {
			System.out.println("Atender al primer cliente de la cola");
			System.out.println("----------------------------------");
			System.out.println("Escoja la orden del cliente:");
			
			admin.cantidadProductos();
                          System.out.println("Escriba su Producto");
                       String pedido=in.nextLine();
                       Producto prod =admin.buscarProducto(pedido);
                       System.out.println("----------------------------------");
                        System.out.println("Escriba la hora del pedio ");
                        int hora=in.nextInt();
                        System.out.println("----------------------------------");
                        System.out.println("Escriba la direccion");
                      String dire= in.nextLine();
                      System.out.println("atendiendo cliente por favor espere...");  
                      Pedido or=admin.nuevoPedido(hora, prod, dire);
                      
			String nombre = admin.atenderCliente(or);
			System.out.println("Se agregó la orden  a la cola de pedidos de la cocina, a nombre del cliente "+nombre);
			System.out.println("Presione enter para volver al menú principal");
			in.nextLine();
			finish = true;
		}
		

	}

	private void entregarPedido() throws InterruptedException {
		if(admin.pedidosEnEspera()==0)
		{
			System.out.println("No hay pedidos en la cocina");
			return;
		}
		System.out.println("Entregar el primer pedido en lista de la cocina");
		System.out.println("----------------------------------");
		System.out.println("Prepadando pedido porfavor espere .......");
		String pedido = admin.entregarPedido();
		System.out.println("Se entregó el pedido: "+pedido);
		System.out.println("Presione enter para volver al menú principal");
		in.nextLine();
		Thread.sleep(3000);
                
	}

	private void numeroClientes() throws InterruptedException {
		System.out.println("Número de clientes esperando en fila");
		System.out.println("----------------------------------");
		int num = admin.clientesEnFila();
		System.out.println("Hay "+num+" clientes esperando en la fila.");
		System.out.println("Presione enter para volver al menú principal");
		in.nextLine();
		Thread.sleep(3000);
	}

	private void pedidos() throws InterruptedException {
		System.out.println("Listar pedidos en cocina");
		System.out.println("----------------------------------");
		Iterator<Pedido> it = admin.mostarPedidos();
		while(it.hasNext()){
			System.out.println("Pedido: "+it);
		}
		System.out.println("Presione enter para volver al menú principal");
		in.nextLine();
		Thread.sleep(3000);
                
	}
        

}