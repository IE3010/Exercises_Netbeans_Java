
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ClaseCociente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        double dividendo, divisor, division;
        
        System.out.println("Introduzca el dividendo: ");
        dividendo=entrada.nextDouble();
        System.out.println("Introduzca el divisor: ");
        divisor=entrada.nextDouble();
        
        if(divisor==0)
        {
            System.out.println("DIVISION ENTRE CERO ES IMPOSIBLE");
        }
        else{
            division=dividendo/divisor;
            System.out.println("El resultado es: "+division);
        }
    }
    
}
