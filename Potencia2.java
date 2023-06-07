
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Potencia2 {
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        double num1,num2,potencia;
        
        System.out.println("Introduzaca un número");
        num1=entrada.nextDouble();
        System.out.println("Indique la potencia");
        num2=entrada.nextDouble();
        
        
       potencia=Math.pow(num1, num2);
        
        System.out.println("El número potenciado es:"+potencia);
       
        
    }
}
