package Operaciones.Numbers;

import java.util.Scanner;

public class TrimorphicNumbers {

    Scanner scan = new Scanner(System.in);
    long numero = 0;

    public void opciones() {
        do {
            System.out.println("Ingrese el numero a probar");
            try {
                numero = scan.nextLong();
                if (numero > 0) {
                    String resultado = (numero * numero * numero) + "";/*elevamos el numero al cubo y lo almacenamos en una cadena para 
                    poder acceder a los numeros por indice para facilitar las cosas*/ 
                    String a = numero + "";//los mismo con la variable que ingreso el usuario
                    boolean b = true;// creamos una variable de tipo boolean inicializada en verdadero
                    int o = resultado.length() - 1;//obtenemos que tan grande es el numero y lo alamcenamos en una variable
                    int c = a.length() - 1;//igual con el numero ingresado
                    while (c > -1) {//ejecutamos un ciclo mientras y verificamos que termine cuando c sea igual a -1
                        if (resultado.charAt(o) != a.charAt(c)) {//verificamos que sea diferrente
                            b = false;//asignamos la variable en false
                            break;//concluimos el ciclo
                        }
                        o--;//le restamos 1 a la variable
                        c--;//igual
                    }
                    if (b) {//usamos la variable booleana para saber el resultado
                        System.out.print("Es un numero trimorfico");
                    } else {
                        System.out.print("No es un numero trimorfico");
                    }
                    System.out.println(" y el valor del numero: " + resultado);//imprimimos el valor del numero elevado al cubo
                } else {
                    System.out.println("No existe numero numeros trimorficos negativos");
                }
            } catch (Exception e) {
                System.out.println("Solo se puede ingresar numeros");
            }
            System.out.println("\nDesea probar otro numero?");
            scan.nextLine();
        } while (scan.nextLine().trim().toLowerCase().equals("si"));
    }

}
