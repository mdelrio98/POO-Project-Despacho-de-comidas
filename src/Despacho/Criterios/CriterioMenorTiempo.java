package Despacho.Criterios;

import Despacho.Comidas.Comida;

public class CriterioMenorTiempo implements Criterio{
    private int tiempo;

    public CriterioMenorTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    @Override
    public boolean acepta(Comida c) {
        return c.getTiempoPreparacion() < this.tiempo;
    }
}
