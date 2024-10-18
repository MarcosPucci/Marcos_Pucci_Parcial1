/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author marco
 */
public class Sistema {
    private List<Servicio> lstServicio;

    public Sistema(List<Servicio> lstServicio) {
        this.lstServicio = lstServicio;
    }
    
    public Servicio traerServicio(String codServicio)
    {
        for(Servicio s : this.lstServicio)
        {
            if(s.getCodServicio() == codServicio)
            {
                return s;
            }
        }
        return null;
    }
    
    public List<Servicio> traerServicio(boolean enPromocion)
    {
        List<Servicio> serviciosEnPromocion = new ArrayList<>();
        for(Servicio s : this.lstServicio)
        {
            if(s.isEnPromocion())
            {
                serviciosEnPromocion.add(s);
            }
        }
        return serviciosEnPromocion;
    }
    
    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia)
    {
        List serviciosPorDia = new ArrayList<>();
        for(Servicio s : this.lstServicio)
        {
            if(s.getFechaDelServicio().equals(dia))
            {
                serviciosPorDia.add(s);
            }
        }
        return serviciosPorDia;
    }
    
    /*Agrego en los parametros de la funcion el atributo "fechaDelServicio
    para poder agregar la fecha de inicio del servicio."*/
    public boolean agregarGastronomia(String gastronomia, double precio, 
        int diaSemDesc, String codServicio, double porcentajeDescuento, 
        boolean enPromocion, LocalDate fechaDelServicio)
    {
        for(Servicio s : this.lstServicio)
        {
            if(s.getCodServicio() == codServicio)
            {
                throw new IllegalArgumentException("La gastronomia ya existe...");
            }
        }
        Gastronomia nuevaGastronomia = new Gastronomia(gastronomia, precio, diaSemDesc,
        codServicio, porcentajeDescuento, enPromocion, fechaDelServicio);
        this.lstServicio.add(nuevaGastronomia);
        return true;
    }
    
    public boolean agregarHospedaje(String hospedaje, double precioPorNoche, 
        String codServicio, double porcentajeDescuento, 
        boolean enPromocion, LocalDate fechaDelServicio)
    {
        for(Servicio s : this.lstServicio)
        {
            if(s.getCodServicio() == codServicio)
            {
                throw new IllegalArgumentException("El hospedaje ya existe...");
            }
        }
        Hospedaje nuevoHospedaje = new Hospedaje(hospedaje, precioPorNoche, 
        codServicio, porcentajeDescuento, enPromocion, fechaDelServicio);
        this.lstServicio.add(nuevoHospedaje);
        return true;
    }
}
