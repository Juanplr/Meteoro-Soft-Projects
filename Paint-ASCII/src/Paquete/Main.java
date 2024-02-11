package Paquete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int largo;
        int ancho;
        Scanner lectura = new Scanner (System.in);
        System.out.println("Ingrese el ancho del lienzo: ");
        ancho = lectura.nextInt();
        System.out.println("Ingrese el largo del lienzo: ");
        largo = lectura.nextInt();
        
        Lienzo l = new Lienzo(largo+1, ancho+1);
        l.crearLienzo();
        l.pintar(-1, -1, 'a');
        l.mostrarLienzo();
    }
    
}
