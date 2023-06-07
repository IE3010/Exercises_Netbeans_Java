
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
//programa que pide que introduzca una calificacion o nota por teclado y muestre un mensaje de aprobado si dicha nota es mayor
//o igual a 8
/**
 *
 * @author HP
 */
public class SiSimple2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada=new Scanner(System.in);
        float nota;
        System.out.println("Introduzca una nota:");
       nota=entrada.nextFloat();
       if(nota>=8)
       {
           System.out.println("Estas aprobado");
       }
    }
    
}
