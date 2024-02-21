package Paquete;

import java.io.*;

public class LienzoManuel extends Lienzo{
    
    private char [][] matriz;

    public LienzoManuel(int largo, int ancho) {
        super(largo, ancho);
        this.matriz = new char [this.largo][this.ancho];
    }
    
    public char[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(char[][] matriz) {
        this.matriz = matriz;
    }

    @Override
    public void crearLienzo() {
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

    public boolean pintar(int fila, int columna, char c) {
      boolean respuesta = false;
      if(columna<=0 || columna>=largo || fila<=0 || fila>=ancho){
          respuesta = false; 
      }else{
          matriz[columna][fila] = c;
          respuesta = true;
      }
    return respuesta;
    }

    @Override
    public void LimpiarConsola() {
        for (int i = 0; i < 50; i++) {
            System.out.println();
        }   
    }

    @Override
    public void mostrarLienzo() {
        for(int i = 0; i<ancho; i++){
            for(int j=0;  j<largo; j++){
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
    }

    @Override
    public boolean exportar() {
        File archivo = null;
		FileWriter fw = null;
		BufferedWriter bw = null;
		try{
			archivo = new File("./"+nombre+".txt");
			fw = new FileWriter(archivo);
			bw = new BufferedWriter(fw);
                        for(int i = 1; i<ancho; i++){
                            for(int j=1;  j<largo; j++){
                                bw.write(matriz[j][i]);
                            }
                            bw.write("\n");
                        }
			bw.flush();
			fw.close();
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
       return true;
    }

    public boolean eliminarC(int fila, int columna) {
        boolean respuesta = false;
        if(columna<=0 || columna>=largo || fila<=0 || fila>=ancho){
            respuesta = false; 
        }else{
            matriz[columna][fila] = ' ';
            respuesta = true;
        }
      return respuesta;
    }

    @Override
    public boolean pintar() {
        return false;
    }

    @Override
    public boolean eliminarC() {
        return false;
    }
    
    
}
