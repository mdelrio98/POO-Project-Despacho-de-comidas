package Despacho.Criterios;

import Despacho.Comidas.Comida;

public class CriterioMenorCalorias implements Criterio{
    private  double calorias;

    public CriterioMenorCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    @Override
    public boolean acepta(Comida c) {
        return (c.getCalorias() < this.calorias);
    }
}
