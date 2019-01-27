package Operaciones.Numbers;

import java.util.ArrayList;
import java.util.Scanner;

public class PerfectNumbers {

    Scanner scan = new Scanner(System.in);
    long numero = 0;//numero de tipo entero de mayor capacidad
    ArrayList<Integer> divisores = new ArrayList<>();//arreglo en donde se almacenaran los numeros que dividan el numero ingresado

    public void opciones() {
        do {
            numero=0;
            System.out.println("Ingrese el numero a probar");
            try {//inicio controlador de errores
                numero = scan.nextLong();
                if (numero > 0) {//verificamos que el numero sea mayor a 0
                    int a = 1;
                    System.out.println("Divisores:");
                    while (a < numero) {//ciclo en donde vamos a verificar todos los divisores
                        if (Divisor(numero, a)) {//verificamos si es un divisor
                            divisores.add(a);//agregamos el divisor a la lista
                            System.out.print(a+" ");// lo mostramos al usuario
                        }
                        a++;//aumentamos el numero
                    }
                    System.out.println();
                    long suma = 0;//variable donde sumaremos todos lo divisores
                    for (Integer divisore : divisores) {//ciclo foreach, recorriendo la variable divisores
                        suma += divisore;//sumamos todos los divisores
                    }
                    if (numero == suma) {//comprovamos si la suma de los divisores es igual al numero ingresado
                        System.out.println("Es un numero perfecto");
                    } else {
                        System.out.println("No es un numero perfecto");
                    }
                    divisores.clear();//limpiamos la lista
                } else {// si no
                    System.out.println("No existe numero numeros perfectos negativos");
                }
            } catch (Exception e) {//capturador de errores
                System.out.println("Solo se puede ingresar numeros");
            }
            scan.nextLine();//limpiamos el cache
            System.out.println("\nDesea probar otro numero?");
        } while (scan.nextLine().trim().toLowerCase().equals("si"));
    }

    public boolean Divisor(long a, long b) {//funcion que retorna true si es divisor
        return a % b == 0;//if compacto
    }
}
