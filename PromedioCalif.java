
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class PromedioCalif {

    public static void main(String[] args) {
    Scanner entrada=new Scanner (System.in); 
    
    float calif1,calif2,calif3,suma,division;        
        System.out.println("Introduce la primera calificación");
        calif1=entrada.nextFloat();
        System.out.println("Introduce la segunda calificación");
        calif2=entrada.nextFloat();
        System.out.println("Introduce la tercera calificación");
        calif3=entrada.nextFloat();
        
        suma=calif1+calif2+calif3;
        division=suma/3;
        System.out.println("El promedio final es:"+division);
}
}
