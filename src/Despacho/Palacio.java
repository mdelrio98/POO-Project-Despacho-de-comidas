package Despacho;

import Despacho.Comidas.Comida;
import Despacho.Comidas.ComidaCompleja;
import Despacho.Comidas.ComidaSimple;
import Despacho.Criterios.*;
import Despacho.Costos.*;
import java.time.*;
import java.time.LocalDate;


public class Palacio {

    public static void main(String[] args) {
        Cocina cocinaDuhau = new Cocina();
        Pedido p1 = new Pedido("Raul",1);
        Pedido p2 = new Pedido("Maria",2);
        Pedido p3 = new Pedido("Sergio",3);

        //Comida Simple 1 = Pizza.
        Comida c1 = new ComidaSimple("Pizza","plato principal","al horno",900,500,60);

        //Comida Compleja 1 = Fideos con tuco.
        Comida c2 = new ComidaSimple("Fideos","segundo plato","hervidos",150,200,20);
        Comida c3 = new ComidaSimple("Tuco","segundo plato","a la olla",100,120,60);
        Comida cp1 = new ComidaCompleja("Fideos con tuco","segundo plato","hervidos");
        ((ComidaCompleja) cp1).addComida(c2);
        ((ComidaCompleja) cp1).addComida(c3);

        //Comida Compleja 2 = Ensalada Fresca
        Comida c4 = new ComidaSimple("Lechuga","ensalada","solo",150,10,20);
        Comida c5 = new ComidaSimple("Tomate","ensalada","solo",100,10,60);
        Comida c6 = new ComidaSimple("Zanahoria","ensalada","solo",150,10,20);
        Comida c7 = new ComidaSimple("Durazno","ensalada","solo",10,10,60);
        Comida cp2 = new ComidaCompleja("EnsaladaFresca","ensalada","solo");
        ((ComidaCompleja)cp2).addComida(c4);
        ((ComidaCompleja)cp2).addComida(c5);
        ((ComidaCompleja)cp2).addComida(c6);
        ((ComidaCompleja)cp2).addComida(c7);

        //P1 ordena pizza, P2 ordena Fideos con tuco y P3 ordena Pizza y ensalada fresca.
        p1.addComida(c1);
        p2.addComida(cp1);
        p3.addComida(cp2);
        p3.addComida(c1);
        cocinaDuhau.addPedido(p1);
        cocinaDuhau.addPedido(p2);
        cocinaDuhau.addPedido(p3);

        Criterio criterio1 = new CriterioModoPreparacion("al horno");
        EstacionTrabajo estacion1 = new EstacionTrabajo(criterio1);
        cocinaDuhau.addEstacionTrabajo(estacion1);

        Criterio criterio2 = new CriterioTipo("ensalada");
        EstacionTrabajo estacion2 = new EstacionTrabajo(criterio2);
        cocinaDuhau.addEstacionTrabajo(estacion2);

        Criterio criterio4 = new CriterioMenorTiempo(15);
        Criterio criterio3And = new CriterioAND(criterio2,criterio4);
        EstacionTrabajo estacion3 = new EstacionTrabajo(criterio3And);
        cocinaDuhau.addEstacionTrabajo(estacion3);

        // Sumamos un costo de 100 cuando las calorias son mayores a 500
        CostoACobrar costoDelDia = new CostoACobrarSuma(100,new CriterioNOT(new CriterioMenorCalorias(500)));
        CostoACobrar costoDelDia2 = new CostoACobrarPorcentaje(10);
        CostoACobrar costoAND = new CostoACobrarAND(costoDelDia,costoDelDia2);
        cocinaDuhau.setMontoACobrar(costoAND);
        System.out.println(cocinaDuhau.getCostoFinal(p3));

        // Descontar un 20% los días miércoles.
        DayOfWeek d1 = LocalDate.of(2021,6,2).getDayOfWeek();
        cocinaDuhau.setMontoACobrar(new CostoACobrarDia(d1,new CostoACobrarDescuento(20)));
        System.out.println(cocinaDuhau.getCostoFinal(p3));


    }
}
