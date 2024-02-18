package Paquete;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int largo;
        int ancho;
        int x;
        int y;
        int opcion;
        char caracter;
        boolean bandera = true;
        boolean bandera2 = true;
        Scanner lectura = new Scanner (System.in);
        while (bandera) {            
            System.out.println("Bienvenido para empezar con el programa.");
            System.out.println("Ingrese el ancho del lienzo: ");
            ancho = lectura.nextInt();
            System.out.println("Ingrese el largo del lienzo: ");
            largo = lectura.nextInt();
            if(ancho >0 && largo>0){
                Lienzo l = new Lienzo(largo+1, ancho+1);
                l.crearLienzo();
                while (bandera2) {                    
                    System.out.println("Escoge una opcion");
                    System.out.println("1)Pintar un caracter");
                    System.out.println("2)Borrar un Caracter");
                    System.out.println("3)exportar lienzo");
                    opcion = lectura.nextInt();
                    
                    switch (opcion) {
                        case 1:
                            System.out.println("Da la cordenada en X:");
                            x = lectura.nextInt();
                            System.out.println("Da la cordenada en Y:");
                            y = lectura.nextInt();
                            System.out.println("Da el caracter:");
                            caracter = lectura.next().charAt(0);
                            l.pintar(y, x, caracter);
                            break;
                        case 2:
                           System.out.println("Da la cordenada en X:");
                            x = lectura.nextInt();
                            System.out.println("Da la cordenada en Y:");
                            y = lectura.nextInt();
                            l.eliminarC(y,x);
                            System.out.println("Caracter eliminado");
                            break;
                        case 3:
                            bandera2 = false;
                            break;
                        default:
                            throw new AssertionError();
                    }
                    l.mostrarLienzo();
                }
                
               bandera = false;
            }else{
                System.out.println("ERROR. Solo acepta numeros positivos :(");
                System.out.println();
            } 
        }
    }
    
}
