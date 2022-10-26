package Despacho;

import Despacho.Comidas.Comida;
import Despacho.Criterios.Criterio;

import java.util.ArrayList;
import java.util.List;

public class EstacionTrabajo {
    private List<Comida> comidas;
    private Criterio especialidad;

    // Este constructor solo para la estacion default ya que asumimos que no tiene especialidad.
    public EstacionTrabajo() {
        this.comidas = new ArrayList<Comida>();
        this.especialidad = null;
    }

    public EstacionTrabajo(Criterio especialidad) {
        this.especialidad = especialidad;
        this.comidas = new ArrayList<Comida>();
    }

    public Criterio getEspecialidad() {
        return especialidad;
    }
    public void setEspecialidad(Criterio especialidad) {
        this.especialidad = especialidad;
    }

    public void addComida(Comida c){
        if(!comidas.contains(c))
            comidas.add(c);
    }

    public void removeComida(Comida c){
        if(!comidas.contains(c))
            comidas.remove(c);
    }

    @Override
    public boolean equals(Object obj) {
        try{
            EstacionTrabajo e = (EstacionTrabajo) obj;
            return (this.especialidad.equals(e.getEspecialidad()));
        } catch (Exception e){
            return false;
        }
    }

    public boolean aceptaPrepararComida(Comida c){
        if (especialidad.acepta(c))
            return true;
        else return false;
    }

}
