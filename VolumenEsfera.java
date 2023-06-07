
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class VolumenEsfera {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        double radio, volumen, pi;
        
        pi= 3.1416;
        
        System.out.println("Introduzca el radio: ");
        radio=entrada.nextFloat();
        
        volumen= ((4*pi)* Math.pow(radio, 3)/3);
    
        System.out.println("El voluemen de la esfera es: "+volumen);
        
        
    }
    
}
