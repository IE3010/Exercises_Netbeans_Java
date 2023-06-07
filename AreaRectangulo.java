
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class AreaRectangulo {
    /**
     *
     * @param args
     */
    
    public static void main(String[] args) {
        Scanner entrada=new Scanner (System.in);
        
        float num1,num2,multiplicacion;        
        System.out.println("Introduce el largo del rectangulo");
        num1=entrada.nextFloat();
        System.out.println("Introduce el ancho del rectangulo");
        num2=entrada.nextFloat();
        
        multiplicacion=num1*num2;
        System.out.println("El area del rectangulo es:"+multiplicacion+"cm2");
    }
}
