/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyecto1_clase4;

import java.util.Scanner;        
public class Proyecto1_clase4 {
    public static void main(String[] args) {
        //declarar variables
        int n1,n2,n3,suma;
        Scanner lectura = new Scanner(System.in);
        //entrada de datos
        System.out.print("Ingresar Nùmero 1:");
        n1=lectura.nextInt();
        System.out.print("Ingresar Nùmero 2:");
        n2=lectura.nextInt();
        System.out.print("Ingresar Nùmero 3:");
        n3=lectura.nextInt();
        //proceso de datos
        suma=n1+n2+n3;
        //salida de datos
        System.out.println("La suma de los nùmeros es:"+suma);
    }
    
}
