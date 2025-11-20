package main.java.com.example.ejercicios.pagos;

import java.time.LocalDate;

public class PagoEfectivo extends Pago {

    
    public PagoEfectivo(int valor, LocalDate  fecha, String referencia) {
        super(valor, fecha, referencia, Pago.Metodo.EFECTIVO);
    }

    @Override
    public String informacion() {
        StringBuilder info = new StringBuilder();
        info.append("Referencia: " + getReferencia());
        info.append("\nValor: " + String.format("%s $%20d","COP" ,getValor()));
        info.append("\nMetodo: " + String.format("%S", getMetodo().toString()));
        info.append("\nFecha: " + String.format("%tY-%tm-%td",getFecha(),getFecha(),getFecha()));
        return info.toString();
    }
    
}