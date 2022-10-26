package Despacho.Criterios;

import Despacho.Comidas.Comida;

public class CriterioAND implements  Criterio{
    private  Criterio c1;
    private  Criterio c2;

    public Criterio getC1() {
        return c1;
    }
    public void setC1(Criterio c1) {
        this.c1 = c1;
    }
    public Criterio getC2() {
        return c2;
    }
    public void setC2(Criterio c2) {
        this.c2 = c2;
    }

    public  CriterioAND(Criterio c1, Criterio c2){
        this.c1 = c1;
        this.c2 = c2;
    }

    @Override
    public boolean acepta(Comida c) {
        return (this.getC1().acepta(c) && this.getC2().acepta(c));
    }

}
