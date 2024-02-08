package Paquete;

public class Lienzo {
    private int largo;
    private int ancho;
    private char [][] matriz;

    public Lienzo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
        this.matriz = new char [(this.largo+2)][(this.ancho+2)];
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
        
        for(int i = 0; i<ancho; i++){
            for(int j=0;  j<largo; j++){
                System.out.print(matriz[j][i]);
            }
            System.out.println("");
        }
    }
    
    
    
}
