package Paquete;

import java.io.IOException;

public class Lienzo {
    private int largo;
    private int ancho;
    private char [][] matriz;

    public Lienzo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        this.matriz = new char [this.largo][this.ancho];
    }

    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }

    public char[][] getMatriz() {
        return matriz;
    }

    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }
    
    public void crearLienzo(){
        for(int i = 1; i<ancho; i++){
            for(int j=1;  j<largo; j++){
                matriz[j][i]= ' ';
                if(j==1 || j==largo-1){
                    matriz[j][i]= '│';
                }
                if(i==1 || i==ancho-1){
                    matriz[j][i]= '-';
                }
            }
        }
        for(int i = 1; i<ancho; i++){
            String letra = ""+i;
            matriz[0][i]= letra.charAt(0);
        }
        for(int j = 1; j<largo; j++){
            String letra = ""+j;
            matriz[j][0]= letra.charAt(0);
        }
        matriz[0][0] = ' ';
        matriz[1][1] = '┌';
        matriz[1][ancho-1] = '└';
        matriz[largo-1][1] = '┐';
        matriz [largo-1][ancho-1] = '┘';
        
       mostrarLienzo();
    }
    
  public boolean pintar(int fila, int columna, char c){
      boolean respuesta = false;
      if(columna<=0 || columna>=largo || fila<=0 || fila>=ancho){
          respuesta = false; 
      }else{
          matriz[columna][fila] = c;
          respuesta = true;
      }
    return respuesta;
  }
  
  
  public static void LimpiarConsola() throws IOException {
    for (int i = 0; i < 50; i++) {
        System.out.println();
    }
}
  
  
  public void mostrarLienzo(){
      for(int i = 0; i<ancho; i++){
            for(int j=0;  j<largo; j++){
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
  }
  public void pintarA(){
      String lienzo;
      lienzo = "           ....\n" +
"         ,''. :   __\n" +
"             \\|_.'  `:       _.----._//_\n" +
"            .'  .'.`'-._   .'  _/ -._ \\)-.----O\n" +
"           '._.'.'      '--''-'._   '--..--'-`\n" +
"            .'.'___    /`'---'. / ,-'`\n" +
"snd       _<__.-._))../ /'----'/.'_____:'.\n" +
"   \\_    :            \\ ]              :  '.\n" +
"     \\___:             \\\\              :    '.\n" +
"         :              \\\\__           :    .'\n" +
"         :_______________|__]__________:  .'\n" +
"                    .' __ '.           :.'\n" +
"                  .' .'  '. '.\n" +
"                .' .'      '. '.\n" +
"              .' .'          '. '.\n" +
"           _.' .'______________'. '._\n" +
"          [_0______________________0_]";
      
      System.out.println(lienzo);
  }
  
  
}
