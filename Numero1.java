
package com.mycompany.practicagetysetiv;

import java.util.Scanner;

/**
 *
 * @author milanez.katia01
 */
public class Numero1 {
    
    public Numero1(){
        
    }
    
    public int number(){
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduzca un numero: ");
        int numero = scan.nextInt();
        return numero;
    }
    
    
    public double sumar(double num1, double num2){
        return num1+num2;
    }
    
    public double restar(double num1, double num2){
        return num1 - num2;
    }
    
    public double multiplicar (double num1, double num2){
        return num1 * num2;
    }
    
    public double dividir (double num1, double num2){
        return num1 / num2;
    }
    
    
}
