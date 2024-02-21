/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package eva1.constructores;

/**
 *
 * @author invitado
 */
public class EVA1CONSTRUCTORES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        System.out.println("cliente: " + cuenta.getcliente());
        System.out.println("cuenta: "+ cuenta.getnoCuenta());
        System.out.println("saldo: " + cuenta.getsaldo());
    }
    
}
