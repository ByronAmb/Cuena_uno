package com.mycompany.cuena_uno;

import java.util.Scanner;

public class Cuena_uno {

    public void Banco_GYT() {
        Cuenta_dos cuenta1 = new Cuenta_dos(60);
        Cuenta_dos cuenta2 = new Cuenta_dos(100);
        while (true) {
            Scanner sp = new Scanner(System.in);
            System.out.println("***************************");
            System.out.println("*|            MENU        |");
            System.out.println("*| 1. Mostrar Saldo       |");
            System.out.println("*| 2. Abonar              |");
            System.out.println("*| 3. Debitar             |");
            System.out.println("*| 4. Salir               |");
            System.out.println("***************************");

            int opcion = sp.nextInt();
            switch (opcion) {
                case 1:
                    cuenta1.mostrar();
                    cuenta2.mostrar();
                    break;
                case 2:

                    Scanner sp1 = new Scanner(System.in);
                    System.out.println("¿A que cuenta desea abonar: 1 o 2 ?");
                    int cuentas = sp1.nextInt();
                    
                    if (cuentas == 1) {
                        
                        System.out.println("Ingresa el valor de tu abono a tu cuenta uno");
                        int abonar= sp1.nextInt();
                        cuenta1.abonar(abonar);
                        cuenta1.mostrar();
                        

                    } else {
                        System.out.println("Ingres el valor a su cuenta dos");
                        int abonar= sp1.nextInt();
                        cuenta1.abonar(abonar);
                        cuenta2.mostrar();
                    }
                    break;
                case 3:
                    Scanner sp2 = new Scanner(System.in);
                    System.out.println("¿A que cuenta desea debitar: 1 o 2 ?");
                     int resp_cuenta = sp2.nextInt();
                    
                    if (resp_cuenta == 1) {
                        System.out.println("Ingresa el valor de tu debito a tu cuenta uno");
                        int abonar= sp2.nextInt();
                float saldo = 0;
                        cuenta1.abonar(saldo);
                        cuenta1.saldo();

                    } else {
                        System.out.println("Ingres el valor de tu debito de tu cuenta dos");
                        int debi= sp2.nextInt();
                        cuenta2.debitar(debi);
                        cuenta2.mostrar();
                    }
                    break;

                case 4:
                    System.exit(0);
                default:
                    throw new AssertionError();

            }
        }

    }

    public static void main(String[] args) {
        Cuena_uno saldo = new Cuena_uno();

        saldo.Banco_GYT();

    }
}
