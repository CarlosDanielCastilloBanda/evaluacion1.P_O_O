/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author invitado
 */
public class CuentaBancaria {
    private int noCuenta;
    private double saldo;
    private String cliente;
    
    //constructor
    public CuentaBancaria(){
    noCuenta = 0;
    cliente = "SIN CLIENTE";
    saldo = 1000000;
    }
    
    public int getnOcuenta(){
        return noCuenta;
    }
    public void setnoCuenta (int cuenta){
        noCuenta = cuenta;
    }
    public String getcliente(){
        return cliente;
    }
    public void setcliente(String nomcliente){
        cliente = nomcliente;
    }
    public double getsaldo(){
        return saldo;
    }
    public void retirar(double monto){
        if(saldo >=monto)
            saldo = saldo = monto;
    }
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
}
