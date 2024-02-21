package Paquete;


public abstract class Lienzo {
    protected int largo;
    protected int ancho;
    protected String nombre;
    
    public Lienzo(int largo, int ancho) {
        this.largo = largo;
        this.ancho = ancho;
    }
    
    public int getLargo() {
        return largo;
    }

    public int getAncho() {
        return ancho;
    }
    
    public void setLargo(int largo) {
        this.largo = largo;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public abstract void crearLienzo();
    public abstract boolean pintar();
    public abstract void LimpiarConsola();
    public abstract void mostrarLienzo();
    public abstract boolean exportar();
    public abstract boolean eliminarC();
}
