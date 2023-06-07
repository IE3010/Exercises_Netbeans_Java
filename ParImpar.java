
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class ParImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        int numero, residuo;
        
       System.out.println("Introduce el número a verificar: ");
       numero=entrada.nextInt();
       
       //motd o residuo, par o impar (impar 1, par 0)
       residuo=numero%2;
        
       if (residuo==0)
       {
           System.out.println("El número es par.");
       }
       else
       {
           System.out.println("El número es impar.");
       }
    }
    
}
