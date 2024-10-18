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
    
    /*Funcion para obtener el servicio registrado en el sistema segun su codigo.
    Toma por parametros un codigo a evaluar.
    Retorna el servicio que coincida con el codigo pasado, en caso de que este
    no se encuentre en el sistema, retorna null.*/
    
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
    /*Funcion para obtener los servicios en promocion (o no) registrados en el sistema.
    Toma por parametros un booleano que indica si se buscan servicios en promocion.
    Retorna los servicios que coincidan con las especificaciones pasadas.*/
    public List<Servicio> traerServicio(boolean enPromocion)
    {
        List<Servicio> serviciosEnPromocion = new ArrayList<>();
        for(Servicio s : this.lstServicio)
        {
            if(enPromocion)
            {
                if(s.isEnPromocion())
            {
                serviciosEnPromocion.add(s);
            }
            }
            else
            {
                    if(!s.isEnPromocion())
            {
                serviciosEnPromocion.add(s);
            }
            }
        }
        return serviciosEnPromocion;
    }
    /*Funcion para obtener los servicios registrados en el sistema, segun si 
    estan en promocion (o no) y que correspondan con la fecha pasada por el usuario.
    Toma por parametros un booleano que indica si se buscan servicios en promocion
    y una fecha a buscar.
    Retorna los servicios que coincidan con las especificaciones pasadas.*/
    public List<Servicio> traerServicio(boolean enPromocion, LocalDate dia)
    {
        List serviciosPorDia = new ArrayList<>();
        for(Servicio s : this.lstServicio)
        {
            if(s.getFechaDelServicio().equals(dia))
            {
                if(enPromocion == s.isEnPromocion())
                {
                    serviciosPorDia.add(s);
                }
            }
        }
        return serviciosPorDia;
    }
    /*Funcion para agregar una gastronomia al sistema.
    Toma por parametros todo lo necesario para crear una gastronomia.
    Retorna true si la gastronomia se pudo agregar al sistema, y tira una 
    excepcion en caso de que este ya se encuentre.
    Agrego en los parametros de la funcion el atributo "fechaDelServicio
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
    
    /*Funcion para agregar un hospedaje al sistema.
    Toma por parametros todo lo necesario para crear un hospedaje.
    Retorna true si el hospedaje se pudo agregar al sistema, y tira una 
    excepcion en caso de que este ya se encuentre.
    Agrego en los parametros de la funcion el atributo "fechaDelServicio
    para poder agregar la fecha de inicio del servicio."*/
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
