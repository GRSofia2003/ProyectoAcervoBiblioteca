package com.mycompany.clases;

import java.io.File;
import java.util.Date;

public class Clase_Reporte {
    public String ID_Reporte;
    public String Tipodereporte;
    public String Fecha;//Date
    public String Datos;//File
    
    Clase_Reporte(String IDR,String TR,String Fe,String Dts){
        ID_Reporte=IDR;
        Tipodereporte=TR;
        Fecha=Fe;
        Datos=Dts;
    };

void Mostrar7(){
        System.out.println("ID del Reporte: "+ID_Reporte);
        System.out.println("Tipo de reporte: "+Tipodereporte);
        System.out.println("Fecha: "+Fecha);
        System.out.println("Datos: "+Datos);
};

}
