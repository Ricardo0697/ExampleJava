/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstracta_2;

import Banco.Cuenta;
import Banco.CuentaJoven;

/**
 *
 * @author Ricardo
 */
public class Abstracta_2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Cuenta oCuenta=
                new Cuenta("Carlos",1000);
        System.out.println(oCuenta.Mostrar());
        oCuenta.Ingresar(2000);
        System.out.println(oCuenta.Mostrar());
        oCuenta.Retirar(500);
        System.out.println(oCuenta.Mostrar());
        
        CuentaJoven oCuentaJoven=
                new CuentaJoven("Ana",2500,22);
        System.out.println(oCuentaJoven.Mostrar());
        oCuentaJoven.Ingresar(2000);
        System.out.println(oCuentaJoven.Mostrar());
        oCuentaJoven.Retirar(500);
        System.out.println(oCuentaJoven.Mostrar());
    }
    
}
