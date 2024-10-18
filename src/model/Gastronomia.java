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
public class Gastronomia extends Servicio{
    private String gastronomia;
    private double precio;
    private int diaSemDesc;

    public Gastronomia(String gastronomia, double precio, int diaSemDesc,
    String codServicio, double porcentaje, boolean enPromocion, LocalDate fechaDelServicio) {
        super(codServicio, porcentaje, enPromocion, fechaDelServicio);
        this.gastronomia = gastronomia;
        this.precio = precio;
        this.diaSemDesc = diaSemDesc;
    }

    /*Funcion para calcular el precio que deberia pagar el usuario, evaluando 
    si el dia pasado por los parametros es igual al dia en que el servicio esta 
    en promo, y evalua si el servicio esta en promocion, el precio bajara
    segun corresponda.
    Toma por parametros una fecha para evaluar la promocion.
    Retorna el precio final calculado.*/
    @Override
    public double calcularPrecioFinal(LocalDate dia) {
        double precioFinal = this.precio;
        int diaDeLaSemana = dia.getDayOfWeek().getValue();
        if(diaDeLaSemana == this.diaSemDesc && this.enPromocion)
        {
            precioFinal = precioFinal - (precioFinal * this.porcentajeDescuento);
        }
        return precioFinal;
    }

    @Override
    public String toString() {
        return "Gastronomia{" + "gastronomia=" + gastronomia + ", precio=" 
        + precio + ", diaSemDesc=" + diaSemDesc + '}';
    }
    
    
}
