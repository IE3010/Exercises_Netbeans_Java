
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Heron {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        double a,b,c,s,area;
        
        System.out.println("Introduzca el valor del lado a:");
        a=entrada.nextDouble();
        System.out.println("Introduzca el valor del lado b:");
        b=entrada.nextDouble();
        System.out.println("Introduza el valor del lado c:");
        c=entrada.nextDouble();
        
        s=(a+b+c)/2;
        area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        
        System.out.println("El area del triangulo es: "+area);
        
    }
    
}
