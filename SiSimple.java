
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SiSimple {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner entrada=new Scanner(System.in);
        int numero,edad;
        String nombre;
        
        System.out.println("Introduce un valor distinto de cero, o pon 0 para salir:");
        numero=entrada.nextInt();
        //colocamos la condicion
        if (numero!=0)
        {
            System.out.println("Introduce tu nombre:");
            nombre=entrada.next();
            System.out.println("Introduce tu edad:");
            edad=entrada.nextInt();
            System.out.println("-------  ");
            System.out.println("Hola "+nombre+" Tu tienes "+edad+" años");
            
        }
    }
    
}
