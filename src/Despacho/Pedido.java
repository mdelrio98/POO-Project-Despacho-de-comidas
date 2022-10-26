package Despacho;

import Despacho.Comidas.Comida;

import java.util.ArrayList;
import java.util.List;

public class Pedido {
    private String mozo;
    private int nroMesa;
    private List<Comida> comidas;


    public Pedido(String mozo, int nroMesa) {
        this.mozo = mozo;
        this.nroMesa = nroMesa;
        this.comidas = new ArrayList<Comida>();
    }

    public String getMozo() {
        return mozo;
    }
    public void setMozo(String mozo) {
        this.mozo = mozo;
    }
    public int getNroMesa() {
        return nroMesa;
    }
    public void setNroMesa(int nroMesa) {
        this.nroMesa = nroMesa;
    }


    public void addComida(Comida c){
        if(!comidas.contains(c)){
            comidas.add(c);
        }
    }

    public void removeComida(Comida c){
        if(!comidas.contains(c)){
            comidas.remove(c);
        }
    }

    public List<Comida> getComidas(){
        List<Comida> aux = new ArrayList<Comida>();
        aux.addAll(comidas); // addAll(comidas) = Agrego todos los elementos de comida a aux
        return aux;
    }

    @Override
    public boolean equals(Object obj) {
        try{
            Pedido p = (Pedido) obj;
            return ((p.mozo.equals(this.mozo)) && (p.nroMesa == this.nroMesa));
        }catch (Exception e){
            return false;
        }
    }
}
