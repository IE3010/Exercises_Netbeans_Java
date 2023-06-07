
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Sueldo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        
        double sueldo,operacion,suma;
        String nombre;
        
        System.out.println("Introduzca su nombre: ");
        nombre=entrada.next();
        System.out.println("Introduzca el sueldo del empleado: ");
        sueldo=entrada.nextFloat();
        
        if(sueldo<1000)
        {
            operacion=sueldo*0.15;
           suma=sueldo+operacion;
        }
        else
        {
            operacion=sueldo*0.05;
            suma=sueldo+operacion;
        }
        System.out.println(nombre+"Su nuevo salgo es"+suma);
        
    }
    
}
