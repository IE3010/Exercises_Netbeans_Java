
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Potencias {
    
    public static void main(String[] agrs){
        
        Scanner entrada=new Scanner(System.in);
        
        double num1,cuadrado,cubo;
        
        System.out.println("Introduzaca un número");
        num1=entrada.nextDouble();
        
       cuadrado=Math.pow(num1, 2);
         cubo=Math.pow(num1, 3);
        
        System.out.println("El cuadrado del número es:"+cuadrado);
        System.out.println("El cubo del número es:"+cubo);
        
        
    }
}
