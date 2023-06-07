
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class SiDoble1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner (System.in);
        float nota;
        String nombre;
        System.out.println("Introduce tu calificacion");
        nota=entrada.nextFloat();
        
        if(nota>=8)
        {
            System.out.println("Introduce el nombte del estudiante: ");
            nombre=entrada.next();
            System.out.println(nombre+" Tu éstas aprobado");
        }
        else{
            System.out.println("Tu estas reprobado");
        }
    }
    
}
