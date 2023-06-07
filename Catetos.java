
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author HP
 */
public class Catetos {
    
    public static void main(String[] args){
        
        
       Scanner entrada=new Scanner(System.in);
       
       double cat1,cat2,hipotenusa;
       System.out.println("Introduce el valor del cateto 1");
       cat1=entrada.nextDouble();
       System.out.println("Introduce el valor del cateto 2");
       cat2=entrada.nextDouble();
       
       hipotenusa=Math.sqrt((Math.pow(cat1,2)+Math.pow(cat2,2)));
       
       System.out.println("El valor de la Hipotenusa es de:"+hipotenusa);
    }
}
