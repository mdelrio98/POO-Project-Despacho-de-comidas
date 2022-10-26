package Despacho.Criterios;

import Despacho.Comidas.Comida;

public class CriterioTipo  implements Criterio{
    private String tipo;

    public CriterioTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    @Override
    public boolean acepta(Comida c) {
        return this.tipo.equals(c.getTipo());
    }
}