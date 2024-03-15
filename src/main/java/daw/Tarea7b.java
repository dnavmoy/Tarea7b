/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package daw;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author daniel
 */
public class Tarea7b {

    public static void main(String[] args) {
        
        
       
        Scanner teclado = new Scanner(System.in);      
        String texto="";
        
        do{
            System.out.println("Introduce texto: (salir para terminar)");
        texto=teclado.nextLine();
    
        System.out.println("Contiene nombre Autopista " + autopistaContiene(texto));
        System.out.println("coincide nombre Autopista " + autopistaCoincide(texto));
        System.out.println("Matricula Coincide: "+ matriculaCoincide(texto));
        System.out.println("patron LetraNumero : "+ patronLetraNumero(texto));
        System.out.println("Codigo Postal: " + codigoPostal(texto));
        System.out.println("Ipasen: " + ipasen(texto));
        System.out.println("Cinco FRK : " + cincofrk(texto));
        System.out.println("Software o hardware? " + palabra(texto));
        }while (!texto.equalsIgnoreCase("salir"));
        
        
        
        
        
    }
    //Saber si una cadena contiene el patrón AP-Nº (nombre de las autopistas), 
    //siendo Nº cualquier número de uno o dos dígitos. 
    //Ejemplos que cumplen el patrón: AP-7, AP-77...
    
    public static boolean autopistaContiene(String texto){
        Pattern p=Pattern.compile("(AP-7Nº[0-9]{1,2})");
        Matcher m=p.matcher(texto);
       return m.find();
    }
    //Saber si una cadena coincide exactamente con el patrón anterior.
      public static boolean autopistaCoincide(String texto){
        Pattern p=Pattern.compile("(AP-7Nº[0-9]{1,2})");
        Matcher m=p.matcher(texto);
       return m.matches();
    }
      //Saber si una cadena coincide exactamente con el patrón anterior.
    public static boolean matriculaCoincide(String texto){
        Pattern p=Pattern.compile("([0-9]{4}[A-Z]{3})");
        Matcher m=p.matcher(texto);
        return m.matches();
        
    }
    
    //Saber si una cadena contiene el patrón letraNumero, tantas veces como se 
    //repita. Ejemplos que cumplen el patrón: e3, e3r4, q1w2d4, ...
    public static boolean patronLetraNumero(String texto){
        Pattern p=Pattern.compile("([a-z][0-9]){1}");
        Matcher m=p.matcher(texto);
       return m.find();
    }
    
    //Saber si una cadena es un código postal (5 dígitos)
    public static boolean codigoPostal(String texto){
        Pattern p=Pattern.compile("([0-9]){5}");
        Matcher m=p.matcher(texto);
         return m.matches();
    }
    
    //Saber si una cadena es un usuario de IPasen, sabiendo que tiene entre 7 y 8 
    //caracteres seguidos de 3 o 4 dígitos numéricos.
    
    public static boolean ipasen( String texto){
        Pattern p= Pattern.compile("([a-zA-Z]{7,8})([0-9]{3,4})");
        Matcher m=p.matcher(texto);
        return m.matches();
        
    }
    
    //Saber si una cadena tiene tamaño 5 y no contiene ni F, ni R, ni K.
    public static boolean cincofrk(String texto){
         Pattern p= Pattern.compile("([^FRKfrk]){5}");
        Matcher m=p.matcher(texto);
        return m.matches();
        
    }
    
    public static boolean palabra(String texto){
        
        Pattern p=Pattern.compile("(Hardware)|(Software)");
        Matcher m=p.matcher(texto);
        return m.find();
    }
}
