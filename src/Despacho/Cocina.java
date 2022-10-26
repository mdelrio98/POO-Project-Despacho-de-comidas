package Despacho;

import Despacho.Comidas.Comida;
import Despacho.Costos.CostoACobrar;

import java.util.ArrayList;
import java.util.List;

public class Cocina {
    private List<Pedido> pedidos;
    private List<EstacionTrabajo> estaciones;
    private EstacionTrabajo estacionDefault;
    private CostoACobrar montoACobrar;

    public Cocina() {
        this.pedidos = new ArrayList<Pedido>();
        this.estaciones = new ArrayList<EstacionTrabajo>();
        this.estacionDefault = new EstacionTrabajo();
    }

    public CostoACobrar getMontoACobrar() {
        return montoACobrar;
    }
    public void setMontoACobrar(CostoACobrar montoACobrar) {
        this.montoACobrar = montoACobrar; }
    public EstacionTrabajo getEstacionDefault() {
        return estacionDefault;
    }

    public void addPedido(Pedido p){
        if(!pedidos.contains(p)) {
            pedidos.add(p);
            for(int i=0; i < p.getComidas().size(); i++) {
                int j=0;
                boolean encontro = false;
                while((j < this.estaciones.size()) && (!encontro)) {
                        if (this.estaciones.get(j).aceptaPrepararComida(p.getComidas().get(i))){
                            this.estaciones.get(j).addComida(p.getComidas().get(i));
                            encontro = true;
                        }
                        j++;
                }
                if(!encontro) {
                    this.estacionDefault.addComida(p.getComidas().get(i));
                    encontro = true;
                }
            }
        }
    }

    public void removePedido(Pedido p){
        if(!pedidos.contains(p))
            pedidos.remove(p);
    }

    public void addEstacionTrabajo(EstacionTrabajo e){
        if(!estaciones.contains(e))
            estaciones.add(e);
    }

    public void removeEstacionTrabajo(EstacionTrabajo e){
        if(!estaciones.contains(e))
            estaciones.remove(e);
    }

    public double getCostoFinal (Pedido p){
        double costofinal = 0.0;
        if (pedidos.contains(p)){
            List<Comida> comidasOrdenadas = p.getComidas();
            for(int i =0;i < comidasOrdenadas.size();i++){
                costofinal += comidasOrdenadas.get(i).getPrecio() + montoACobrar.cobrar(comidasOrdenadas.get(i));
            }
            return costofinal;
        }
        return -1;
    }
}
