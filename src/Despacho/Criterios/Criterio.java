package Despacho.Criterios;


import Despacho.Comidas.Comida;

public interface Criterio {
    boolean acepta (Comida c);
}
