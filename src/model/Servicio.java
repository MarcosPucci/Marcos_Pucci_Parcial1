/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;

/**
 *
 * @author marco
 */
public abstract class Servicio {
    protected String codServicio;
    protected double porcentajeDescuento;
    protected boolean enPromocion;
    //Agrego el atributo de fechaDelServicio para poder guardar la fecha en que
    //se crea el servicio.
    protected LocalDate fechaDelServicio;

    public Servicio(String codServicio, double porcentaje, boolean enPromocion,
            LocalDate fechaDelServicio) {
        this.setCodServicio(codServicio);
        this.porcentajeDescuento = porcentaje;
        this.enPromocion = enPromocion;
        this.fechaDelServicio = fechaDelServicio;
    }

    public String getCodServicio() {
        return codServicio;
    }

    public void setCodServicio(String codServicio) {
        if(codServicio.length() == 6)
        {
            this.codServicio = codServicio;
        }
        else
        {
            throw new IllegalArgumentException("El codigo debe contener "
                    + "exactamente 6 caracteres...");
        }
    }

    public double getPorcentajeDescuento() {
        return porcentajeDescuento;
    }

    public void setPorcentajeDescuento(double porcentaje) {
        this.porcentajeDescuento = porcentaje;
    }

    public boolean isEnPromocion() {
        return enPromocion;
    }

    public void setEnPromocion(boolean enPromocion) {
        this.enPromocion = enPromocion;
    }

    public LocalDate getFechaDelServicio() {
        return fechaDelServicio;
    }

    public void setFechaDelServicio(LocalDate fechaDelServicio) {
        this.fechaDelServicio = fechaDelServicio;
    }
    
    public abstract double calcularPrecioFinal(LocalDate dia);

    @Override
    public String toString() {
        return "Servicio{" + "codServicio=" + codServicio + ", porcentajeDescuento=" 
        + porcentajeDescuento + ", enPromocion=" + enPromocion + '}';
    }
    
    
}
