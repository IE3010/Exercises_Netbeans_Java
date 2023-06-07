
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SumaNumeros3 {
        public static void main(String[] args){
        Scanner entrada=new Scanner (System.in);
        
        float num1,num2,num3,suma;
        System.out.println("Introduce el primer número");
        num1=entrada.nextFloat();  //pedimos la entrada desde el teclado
        System.out.println("Introduce el segundo número");
        num2=entrada.nextFloat();
        System.out.println("Introduce el tercer número");
        num3=entrada.nextFloat();
        
       //realizamos la operacion
       suma=num1+num2+num3;
       //impresion de resultados
       System.out.println("El resultado es:"+suma);
        }
}
