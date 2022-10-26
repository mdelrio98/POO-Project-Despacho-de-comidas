package Despacho.Criterios;

import Despacho.Comidas.Comida;

public class CriterioModoPreparacion implements Criterio{
    private String modoPreparacion;

    public CriterioModoPreparacion(String modoPraparacion) {
        this.modoPreparacion = modoPraparacion;
    }

    public String getModoPraparacion() {
        return modoPreparacion;
    }

    public void setModoPraparacion(String modoPraparacion) {
        this.modoPreparacion = modoPraparacion;
    }

    @Override
    public boolean acepta(Comida c) {
        return this.modoPreparacion.equals(c.getModoPreparacion());
    }
}
