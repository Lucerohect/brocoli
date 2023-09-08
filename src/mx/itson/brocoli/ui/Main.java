/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package mx.itson.brocoli.ui;

import java.util.Scanner;
import mx.itson.brocoli.negocios.Operacion;

/**
 *
 * @author Hector Lucero
 */
public class Main {
    
    public static void main(String[] args){
        
        System.out.println("Escriba dl texto a separar:");
        
        Scanner scanner = new Scanner(System.in);
        String oracion= scanner.nextLine();
        
        String[] resultado = new Operacion().separar(oracion);
        for(String s : resultado){
            System.out.println(s);
            
        }
    }
}
