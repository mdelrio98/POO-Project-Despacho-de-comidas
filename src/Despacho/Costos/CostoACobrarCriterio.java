package Despacho.Costos;

import Despacho.Comidas.Comida;
import Despacho.Criterios.Criterio;

public class CostoACobrarCriterio implements CostoACobrar {
    private Criterio criterio;
    private double pMin,pMax;

    public CostoACobrarCriterio(Criterio c1, double pMin, double pMax) {
        this.criterio = c1;
        this.pMin = pMin;
        this.pMax = pMax;
    }

    public Criterio getCriterio() {
        return criterio;
    }
    public void setCriterio(Criterio criterio) {
        this.criterio = criterio;
    }
    public double getpMin() {
        return pMin;
    }
    public void setpMin(double pMin) {
        this.pMin = pMin;
    }
    public double getpMax() {
        return pMax;
    }
    public void setpMax(double pMax) {
        this.pMax = pMax;
    }

    @Override
    public double cobrar(Comida c) {
        if (this.criterio.acepta(c))
            return pMin;
        else
            return pMax;
    }
}
