package Despacho.Costos;

import Despacho.Comidas.Comida;

public class CostoACobrarDescuento implements CostoACobrar{
    private int valor;

    public CostoACobrarDescuento(int valor) {
        this.valor = valor;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }

    @Override
    public double cobrar(Comida c) {
        return ((c.getPrecio() * valor)/100) * -1;
    }
}
