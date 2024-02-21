package Paquete;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int largo;
        int ancho;
        int x;
        int y;
        int opcion;
        int menu;
        char caracter;
        boolean bandera = true;
        boolean bandera2 = true;
        boolean bandera3 = true;
        Scanner lectura = new Scanner (System.in);
        while (bandera) {            
            System.out.println("Bienvenido para empezar con el programa. Elige una Opción");
            System.out.println("1)Pintar ASCII");
            System.out.println("2)ASCII-Random");
            System.out.println("3)Salir");
            menu = lectura.nextInt();
            switch (menu) {
                case 1:
                    System.out.println("Ingrese el ancho del lienzo: ");
                    ancho = lectura.nextInt();
                    System.out.println("Ingrese el largo del lienzo: ");
                    largo = lectura.nextInt();
                    if(ancho >0 && largo>0){
                        LienzoManuel l = new LienzoManuel(largo+1, ancho+1);
                        String nombrel;
                        l.crearLienzo();
                        l.mostrarLienzo();
                        while (bandera2) {                    
                            System.out.println("Escoge una opcion");
                            System.out.println("1)Pintar un caracter");
                            System.out.println("2)Borrar un Caracter");
                            System.out.println("3)Exportar lienzo");
                            System.out.println("4)Borrar todo el Lienzo");
                            System.out.println("5)Salir al menu Principal");
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
                                    l.LimpiarConsola();
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
                                    lectura.nextLine();
                                    System.out.println("Ponle un nombre al lienzo");
                                    nombrel = lectura.nextLine();
                                    l.setNombre(nombrel);
                                    if(l.exportar()){
                                        System.out.println("Exportado correctamente");
                                    }
                                    break;
                                case 4:
                                    l.crearLienzo();
                                    break;
                                case 5:
                                    System.out.println("Regresando al menu principal");
                                    bandera2 = false;
                                    break;
                                default:
                                     System.out.println("ERROR. Opcion incorrecta");
                            }
                            l.mostrarLienzo();
                        }                
                    }else{
                        System.out.println("ERROR. Solo acepta numeros positivos :(");
                        System.out.println();
                    }
                    break;
                case 2:
                    while (bandera3) {                        
                        System.out.println("Escoge una opcion");
                        System.out.println("1)Mostrar");
                        System.out.println("2)Exportar");
                        System.out.println("3)Salir");
                        opcion = lectura.nextInt();
                        switch (opcion) {
                                case 1:
                                    
                                    break;
                                case 2:
                                   
                                    break;
                                case 3:
                                    System.out.println("Regresando al menu principal");
                                    bandera3 = false;
                                    break;
                                default:
                                     System.out.println("ERROR. Opcion incorrecta");
                            }
                    }
                    break;
                case 3:
                    System.out.println("Hasta Luego");
                    bandera = false;
                    break;
                default:
                    System.out.println("ERROR. Opcion incorrecta");
            } 
        }
    }
    
}
