/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejecicion5;

/**
 *
 * @author kkmie
 */
public class EjecicioN5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float suma, x, y;
        suma = 0;
        x = 20;
        
        suma += x;
        y = 40;
        x += Math.pow(y,2);
        suma += x/y;
        
        System.out.println("EL VALOR DE LA SUMA ES: " + suma);
    }
    
}
