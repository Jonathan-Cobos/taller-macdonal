/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package co.edu.unipiloto.estdatos.colas.interfaz;

/**
 *
 * @author Acer
 */
public class MainTaller {
public static void main(String[] args){
    
    McDonaldsCLI mcDonaldsCLI = new McDonaldsCLI();
    try {
      mcDonaldsCLI.mainMenu();
    } catch (InterruptedException e) {
      e.printStackTrace();
    }

  }
  
}