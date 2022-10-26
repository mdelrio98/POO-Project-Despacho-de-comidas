package Despacho.Costos;

import Despacho.Comidas.Comida;
import Despacho.Criterios.Criterio;

public class CostoACobrarSuma implements CostoACobrar{
    private int valor;
    private Criterio c1;

    public CostoACobrarSuma(int valor, Criterio c1) {
        this.valor = valor;
        this.c1 = c1;
    }

    public int getValor() {
        return valor;
    }
    public void setValor(int valor) {
        this.valor = valor;
    }
    public Criterio getC1() {
        return c1;
    }
    public void setC1(Criterio c1) {
        this.c1 = c1;
    }

    @Override
    public double cobrar(Comida c) {
        if (c1.acepta(c))
            return valor;
        else
            return 0;
    }
}
