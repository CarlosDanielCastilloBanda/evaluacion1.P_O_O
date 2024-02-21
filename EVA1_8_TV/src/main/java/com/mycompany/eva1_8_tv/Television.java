/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.eva1_8_tv;

/**
 *
 * @author nacho
 */
public class Television {
    //atributos privados
     private int  volumen;
    private  int canal;
    boolean estaEncendida;
    
    public Television(){
     volumen = 30;
     canal = 5;
     estaEncendida = false;
     
    }
    
     @SuppressWarnings("empty-statement")
    public void subirVolumen(){
      if (estaEncendida && (volumen < 100 ));
      volumen = volumen + 1 ;
      //volumen++;
      
    }
     @SuppressWarnings("empty-statement")
    public void bajarvolumen(){
    if (estaEncendida == true);
    volumen = volumen - 1;
    }
     @SuppressWarnings("empty-statement")
    public void subirCanal(){
    if (estaEncendida && true);
    canal = canal + 1;
    //canal+=1;
    //canal++;
    }
    public void bajarCanal(){
    if (estaEncendida && (canal > 0))
    canal = canal - 1 ;
    }
     @SuppressWarnings("empty-statement")
    public void cambiarCanal (int Nocanal){
    if (estaEncendida && (Nocanal < 0));
    canal = Nocanal;
    }
    public void power(){
     /*if (estaEncendida == true)
         estaEncendida = false;
     else
         estaEncendida = true;*/
     estaEncendida = !estaEncendida;
     
     
    }
    public void emprimirConfiguracion(){
    System.out.println("Volumen: "+ volumen);
    System.out.println("canal: "+ canal);
    System.out.println("power: "+ estaEncendida);
    }
}
