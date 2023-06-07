
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class PesoConversion {
    public static void main(String[] args){
        Scanner entrada=new Scanner (System.in);
        String nombre;
        float estatura, peso, centi, milim, gramos;
        
        System.out.println("Introduce el nombre de la persona: ");
        nombre=entrada.next();
        System.out.println("Introduce tu estatura: ");
        estatura=entrada.nextFloat();
        System.out.println("Introduce tu peso en kilogramos: ");
        peso=entrada.nextFloat();
        
        centi=estatura*100;
        milim=centi*10;
        
        gramos=peso*1000;
        
        System.out.println(nombre+"Tu estatura en cm es de: "+centi+"cm");
        System.out.println(nombre+"Tu estatura en mm es de: "+milim+"mm");
        System.out.println(nombre+"Tu peso en gramos es de: "+gramos+"gramos");
    }
    
}
