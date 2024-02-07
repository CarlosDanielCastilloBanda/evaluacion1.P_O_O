/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package instance_pract2;


public class Instance_pract2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        int valor =100;
        //INSTANTACION; crear elobjeto --> darle memoria
        //CLASE IDENTIFICADOR = new constructor()
        //Constructor --> Metodo con el mismo nombre que la clase.
        Persona perso1 = new persona();//instanciacion
        System.out.println(perso1); 
        boolean mamalon1 = false;
        System.out.println (mamalon1);
        mamalon.marca = "ford";
        mamalon.modelo = "mustang";
        mamalon.annio =1965;
        System.out.println("marca:" + mamalon.marca);
        System.out.println("modelo:" + mamalon.modelo);
        System.out.println("año:" + mamalon.annio);
        
        
    }

    private static class persona extends Persona {

        public persona() {
        }
    }

    private static class mamalon {
        private static String marca;
        private static String modelo;
        private static int annio;

        public mamalon() {
        }
    }
    
}
class vehiculo {
    String marca;
    int annio;
    String modelo;
}
