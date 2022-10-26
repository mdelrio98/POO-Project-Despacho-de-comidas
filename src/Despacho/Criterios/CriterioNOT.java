package Despacho.Criterios;

import Despacho.Comidas.Comida;

public class CriterioNOT implements  Criterio {
    private Criterio c1;

    public Criterio getC1() {
        return c1;
    }

    public void setC1(Criterio c1) {
        this.c1 = c1;
    }

    public CriterioNOT(Criterio c1) {
        this.c1 = c1;
    }

    @Override
    public boolean acepta(Comida c) {
        return (!this.getC1().acepta(c));
    }
}