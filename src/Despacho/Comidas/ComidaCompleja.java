package Despacho.Comidas;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ComidaCompleja extends Comida{

    private List<Comida> comidas;

    public ComidaCompleja(String nombre, String tipo, String modoPreparacion){
        super(nombre,tipo,modoPreparacion);
        this.comidas = new ArrayList<Comida>();
    }

    public ComidaCompleja(String nombre, String tipo, String modoPreparacion,List<Comida>comidas){
        super(nombre,tipo,modoPreparacion);
        this.comidas = comidas;
    }

    public void addComida(Comida c){
        if(!comidas.contains(c))
            comidas.add(c);
    }

    public void removeComida(Comida c){
        if(comidas.contains(c))
            comidas.remove(c);
    }

    public ComidaCompleja cloneComidaCompleja() {
        List<Comida> aux = new ArrayList<>();
        aux.addAll(this.comidas);
        return new ComidaCompleja(this.getNombre(),this.getTipo(),this.getModoPreparacion(),aux);
    }

    @Override
    public double getPrecio(){
        double precio = 0.0;
        for(int i=0; i<this.comidas.size() ;i++){
            precio = precio + this.comidas.get(i).getPrecio();
        }
        return precio;
    }

    @Override
    public double getCalorias(){
        double calorias = 0.0;
            for(int i=0; i<this.comidas.size() ;i++){
                calorias = calorias + this.comidas.get(i).getCalorias();
            }
        return calorias;
    }

    @Override
    public int getTiempoPreparacion(){
        int tiempo = 0;
        for(int i=0; i<this.comidas.size() ;i++){
            tiempo = tiempo + this.comidas.get(i).getTiempoPreparacion();
        }
        return tiempo;
    }

    @Override
    public String toString() {
        return "\nComidaCompleja{ " +
                "\n Conjunto de comidas = \n" + comidas.toString() +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;

        ComidaCompleja that = (ComidaCompleja) o;

        return Objects.equals(comidas, that.comidas);
    }


    @Override
    public int hashCode() {
        return comidas != null ? comidas.hashCode() : 0;
    }
}
