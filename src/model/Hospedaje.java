/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.DayOfWeek;
import java.time.LocalDate;

/**
 *
 * @author marco
 */
public class Hospedaje extends Servicio{
    private String hospedaje;
    private double precioPorNoche;

    public Hospedaje(String hospedaje, double precioPorNoche, String codServicio, 
    double porcentaje, boolean enPromocion, LocalDate fechaDelServicio) {
        super(codServicio, porcentaje, enPromocion, fechaDelServicio);
        this.hospedaje = hospedaje;
        this.precioPorNoche = precioPorNoche;
    }

    /*Funcion para calcular el precio que deberia pagar el usuario, evaluando 
    si es un dia de semana y el servicio esta en promocion, el precio bajara
    segun corresponda.
    Toma por parametros una fecha para evaluar la promocion.
    Retorna el precio final calculado.*/
    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = this.precioPorNoche;
        DayOfWeek diaDeLaSemana = dia.getDayOfWeek();
        
        if(diaDeLaSemana != DayOfWeek.SATURDAY &&
        diaDeLaSemana != DayOfWeek.SUNDAY && this.enPromocion)
        {
            precioFinal = precioFinal - (precioFinal * this.porcentajeDescuento);
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Hospedaje{" + "hospedaje=" + hospedaje + ", precioPorNoche=" + precioPorNoche + '}';
    }
}
