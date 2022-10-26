package Despacho.Comidas;
import java.util.ArrayList;
import java.util.List;

public class ComidaCompleja extends Comida{

    private List<Comida> comidas;

    public ComidaCompleja(String nombre, String tipo, String modoPreparacion){
        super(nombre,tipo,modoPreparacion);
        this.comidas = new ArrayList<Comida>();
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

}
