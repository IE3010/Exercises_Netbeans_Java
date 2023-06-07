
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SiDoble2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        int edad;
        String nombre;
        System.out.println("Introduzca el nombre de la persona");
        nombre=entrada.next();
        System.out.println("      ");
        System.out.println("Introduzca su edad: ");
        edad=entrada.nextInt();

        if(edad>=18)
        {
            System.out.println(nombre+" usted es mayor de edad");
        }
        else
        {
            System.out.println(nombre+" usted es menor de edad");
        }
    }
    
}
