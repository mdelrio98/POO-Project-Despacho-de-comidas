package Despacho.Comidas;

import java.util.Objects;

public class ComidaSimple extends Comida{
    private double calorias;
    private double precio;
    private int tiempoPreparacion;

    public ComidaSimple(String nombre, String tipo, String modoPreparacion, double calorias, double precio, int tiempoPreparacion) {
        super(nombre, tipo, modoPreparacion);
        this.calorias = calorias;
        this.precio = precio;
        this.tiempoPreparacion = tiempoPreparacion;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }
    public void setPrecio(double precio) {
        this.precio = precio;
    }
    public void setTiempoPreparacion(int tiempoPreparacion) {
        this.tiempoPreparacion = tiempoPreparacion;
    }
    @Override
    public double getPrecio() {
        return this.precio;
    }
    @Override
    public double getCalorias() {
        return this.calorias;
    }
    @Override
    public int getTiempoPreparacion() {
        return this.tiempoPreparacion;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        ComidaSimple that = (ComidaSimple) o;
        return Double.compare(that.calorias, calorias) == 0 && Double.compare(that.precio, precio) == 0 && tiempoPreparacion == that.tiempoPreparacion;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\ncalorias= " + calorias +
                ", \nprecio= " + precio +
                ", \ntiempoPreparacion= " + tiempoPreparacion +
                "\n}";
    }
}
