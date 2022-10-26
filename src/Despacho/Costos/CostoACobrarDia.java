package Despacho.Costos;

import Despacho.Comidas.Comida;
import java.time.DayOfWeek;
import java.time.LocalDate;

public class CostoACobrarDia implements CostoACobrar{
    private final DayOfWeek dia;
    private CostoACobrar c1;

    public CostoACobrar getC1() {
        return c1;
    }
    public void setC1(CostoACobrar c1) {
        this.c1 = c1;
    }

    public CostoACobrarDia(DayOfWeek  dia, CostoACobrar c1) {
        this.dia = dia;
        this.c1 = c1;
    }

    @Override
    public double cobrar(Comida c) {
        LocalDate diaActual = LocalDate.now();
        if(this.dia.equals(diaActual.getDayOfWeek()))
            return c1.cobrar(c);
        else
            return 0;
    }
}
