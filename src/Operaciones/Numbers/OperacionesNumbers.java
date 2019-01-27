package Operaciones.Numbers;

import java.util.Scanner;

public class OperacionesNumbers {
    
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);//creacion de variable para tomar la informacion de la consola
        do {//inicio ciclo repetitivo
            System.out.println("Que desea hacer:\n1)Numero Perfecto\n2)Numero Trimorfico"); //impresion de informacion por consola
            String o=scan.nextLine();//se crea una variable de tipo cadena y se le asigna lo que el usuario ingrese por consola
            if(o.trim()/*trim elimina los espacion antes y despues de los textos*/.equals("1")||o.trim().toLowerCase()/*para poner todos los caracteres en minuscula*/.equals("numero perfecto")){
                new PerfectNumbers().opciones();//creacion de objeto sin declarar de la clase
            }else if(o.trim().equals("2")||o.trim().toLowerCase().equals("numero trimorfico")){
                new TrimorphicNumbers().opciones();
            }
            System.out.println("Desea hacer otra operación?"); 
        } while (scan.nextLine().trim().toLowerCase().equals("si"));  //fin ciclo repetitivo      
    }
    
}
