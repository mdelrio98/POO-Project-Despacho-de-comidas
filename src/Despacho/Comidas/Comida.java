package Despacho.Comidas;

public abstract class Comida {
    private String nombre;
    private String tipo;
    private String modoPreparacion;

    public Comida(String nombre, String tipo, String modoPreparacion) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.modoPreparacion = modoPreparacion;
    }

    @Override
    public boolean equals(Object obj) {
        try{
            Comida c = (Comida) obj;
            return ((c.nombre.equals(this.nombre)) && (c.tipo.equals(this.tipo)) && (c.modoPreparacion == this.modoPreparacion));
        }catch (Exception e){
            return false;
        }
    }

    public abstract double getPrecio();
    public abstract double getCalorias();
    public abstract int getTiempoPreparacion();
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public String getModoPreparacion() {
        return modoPreparacion;
    }
    public void setModoPreparacion(String modoPreparacion) {
        this.modoPreparacion = modoPreparacion;
    }

    @Override
    public String toString() {
        return "\nComida{ " +
                "\nnombre= '" + nombre + '\'' +
                ", \ntipo= '" + tipo + '\'' +
                ", \nmodoPreparacion= '" + modoPreparacion + '\''
                ;
    }
}
