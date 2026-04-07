

package com.mycompany.practicagetysetiv;

import java.util.Scanner;
import persona.Persona;
import vector.Vector1;
import vector.Vector2;

/**
 *
 * @author milanez.katia01
 */
public class PracticaGetySetIV {

    public static void main(String[] args) {
        int operacion;
        int numero;
        int num1;
        int num2;
        int[] vectorA = new int[20];
        int[] vectorB = new int[20];
        int[] vectorC = new int[20];
        
        Numero1 calculo1 = new Numero1();
        Persona persona1=new Persona();
        Persona persona2 = new Persona();
        Persona persona3 = new Persona();
        Vector1 v1 = new Vector1();
        Vector2 v2 = new Vector2();

        Scanner scan = new Scanner(System.in);
        do{
        System.out.println("*************Menu*************");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("5. Salir");
        System.out.println("\nElija una opcion:");
        operacion = scan.nextInt();
        
        switch(operacion){
            case 1: num1=calculo1.number();
                    num2=calculo1.number();
                    System.out.println(num1 +" + "+num2+" = "+calculo1.sumar(num1, num2));
                    break;
            case 2: num1=calculo1.number();
                    num2=calculo1.number();
                    System.out.println(num1 +" - "+num2+" = "+calculo1.restar(num1, num2));
                    break;
            case 3: num1=calculo1.number();
                    num2=calculo1.number();
                    System.out.println(num1 +" * "+num2+" = "+calculo1.multiplicar(num1, num2));
                    break;
            case 4: num1=calculo1.number();
                    num2=calculo1.number();
                    System.out.println(num1 +" / "+num2+" = "+calculo1.dividir(num1, num2));
                    break;
            case 5: System.out.println("*****Hasta luego!******");
                    break;
            default: System.out.println("Opcion invalida!");
        }
        }while(operacion!=5);
        
        
        v1.rellenarVector();
        v1.imprimirVector();
        v1.imprimirReves();
        
        
        v2.rellenarVector(vectorA);
        v2.rellenarVector(vectorB);
        v2.calcular(vectorA, vectorB, vectorC);
        v2.mostrarVectores(vectorA, vectorB, vectorC);
        

        
        persona1.setNombre("Joana");
        persona1.setApellido("Sanchez");
        persona1.setCalle("Gran Via 2");
        persona1.setTelefono("986548687");
        persona1.setAficiones("leer, viajar, correr");
        persona1.mostrarDatos();
        
        persona2.setNombre("Pedro");
        persona2.setApellido("Martinez");
        persona2.setCalle("Ramon y Cajal 13");
        persona2.setTelefono("654987123");
        persona2.setAficiones("Pintar, dibujar , leer");
        persona2.mostrarDatos();
              
        persona3.setNombre("Lucas");
        persona3.setApellido("Fernandez");
        persona3.setCalle("Blasco Ibañez 15");
        persona3.setTelefono("698574321");
        persona3.setAficiones("deportes, escribir, comprar");
        persona3.mostrarDatos();
        persona3.cambiarDatos();
        persona3.mostrarDatos();
    }
}
