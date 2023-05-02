package com.mycompany.clases;

import java.util.Date;

public class Clase_Prestamo {
    public String ID_Préstamo;
    public String Fecha_Préstamo;//Date
    public String Fecha_Entrega;//Date
    public String ID_Usuario;
    public String ID_Material;
    
    Clase_Prestamo(String IDP,String FP,String FE,String IDU,String IDM){
        ID_Préstamo=IDP;
        Fecha_Préstamo=FP;
        Fecha_Entrega=FE;
        ID_Usuario=IDU;
        ID_Material=IDM;
    };

void Mostrar6(){
        System.out.println("ID del Préstamo: "+ID_Préstamo);
        System.out.println("Fecha de Préstamo: "+Fecha_Préstamo);
        System.out.println("Fecha de Entrega: "+Fecha_Entrega);
        System.out.println("ID de Usuario: "+ID_Usuario);
        System.out.println("ID de Material: "+ID_Material);
};

}
