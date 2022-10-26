package Despacho.Costos;

import Despacho.Comidas.Comida;

public class CostoACobrarAND implements CostoACobrar{
    private CostoACobrar c1;
    private CostoACobrar c2;

    public CostoACobrarAND(CostoACobrar c1, CostoACobrar c2) {
        this.c1 = c1;
        this.c2 = c2;
    }

    public CostoACobrar getC1() {
        return c1;
    }
    public void setC1(CostoACobrar c1) {
        this.c1 = c1;
    }
    public CostoACobrar getC2() {
        return c2;
    }
    public void setC2(CostoACobrar c2) {
        this.c2 = c2;
    }

    @Override
    public double cobrar(Comida c) {
        return (c1.cobrar(c) + c2.cobrar(c));
    }
}
