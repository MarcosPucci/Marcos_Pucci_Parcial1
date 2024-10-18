/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package test;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import model.Gastronomia;
import model.Hospedaje;
import model.Servicio;
import model.Sistema;

/**
 *
 * @author marco
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*System.out.println("1-1");
        Gastronomia gastronomia1 = new Gastronomia("Hamburguesa criolla", 180.0,
        4, "4892", 0.15, true, LocalDate.of(2024, 10, 18));*/
        
        /*System.out.println("1-2");
        Gastronomia gastronomia2 = new Gastronomia("Hamburguesa criolla", 180.0,
        4, "489235", 0.15, true, LocalDate.of(2024, 10, 18));*/
        
        /*System.out.println("1-3");
        Hospedaje hospedaje1 = new Hospedaje("Cabaña 3 personas", 1500.0, "2872",
        0.1, true, LocalDate.of(2024, 10, 18));*/
        
        /*System.out.println("1-4");
        Hospedaje hospedaje2 = new Hospedaje("Cabaña 3 personas", 1500.0, "287282",
        0.1, true, LocalDate.of(2024, 10, 18));*/
        
        /*System.out.println("2-1");
        System.out.println(gastronomia2.calcularPrecioFinal(LocalDate.of(2020, 10, 28)));*/
        
        /*System.out.println("2-2");
        System.out.println(hospedaje2.calcularPrecioFinal(LocalDate.of(2020, 10, 27)));*/
        
        System.out.println("3");
        List<Servicio> servicios = new ArrayList<>();
        
        Gastronomia gastronomia3 = new Gastronomia("Milanesa con pure", 350.0,
        3, "858927", 0.15, true, LocalDate.of(2020, 1, 1));
        Hospedaje hospedaje3 = new Hospedaje("Habitacion triple", 2200.0, "489259",
        0.1, true, LocalDate.of(2020, 9, 15));
        Gastronomia gastronomia4 = new Gastronomia("Gaseosa", 120.0,
        3, "182835", 0.2, false, LocalDate.of(2020, 10, 28));
        Hospedaje hospedaje4 = new Hospedaje("Habitacion simple", 1000.0, "758972",
        0.15, false, LocalDate.of(2020, 10, 28));
        
        servicios.add(gastronomia3);
        servicios.add(hospedaje3);
        servicios.add(gastronomia4);
        servicios.add(hospedaje4);
        
        Sistema sistema = new Sistema(servicios);
        
        sistema.agregarGastronomia("Pastel de papa", 400.0, 2, "151001", 0.2, true, LocalDate.of(2020, 4, 10));
        sistema.agregarHospedaje("Departamento para 2", 1760.0, "211510", 0.22, true, LocalDate.of(2020, 10, 28));
        
        System.out.println("4-1");
        System.out.println(sistema.traerServicio(true));
        
        System.out.println("4-2");
        System.out.println(sistema.traerServicio(true, LocalDate.of(2020, 10, 28)));
        
    }
    
}
