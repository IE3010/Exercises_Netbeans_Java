
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class AreaCirculo {
    
    public static void main(String[] args){
        
        Scanner entrada=new Scanner(System.in);
        double radio,area,pi,perimetro;
        pi=3.1416;
        System.out.println("Introduce el valor del radio");
        radio=entrada.nextDouble();
        area=pi*(Math.pow(radio,2));
        perimetro=2*pi*radio;
        
        System.out.println("El área del circulo es de:"+area+"u2");
        System.out.println("El perimetro del circulo es de:"+perimetro+"u");
    }
}
