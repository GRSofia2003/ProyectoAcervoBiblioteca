package com.mycompany.clases;

public class Clases {

    public static void main(String[] args) {
        Clase_Libros M1=new Clase_Libros("Larousse","20/01/04","9-785-3456",332,"JORGE","SOL","LAROUSSE",2,"ci","ISBN",true);
        M1.Mostrar1();
        System.out.println("\n");
        Clase_Revistas M2=new Clase_Revistas("Edid","20/10/20","hola",4,"ci","fe","dr","fds",54,"no","sdd",false);
        M2.Mostrar2();
        System.out.println("\n");
        Clase_Tesis M3=new Clase_Tesis("Sexto Semestre","Mecatrónica","20/01/20",300,"4323453","SOL",2,"ciMArisol","ISBN",true);
        M3.Mostrar3();
        System.out.println("\n");
        Clase_RecursosAudiovisuales M4=new Clase_RecursosAudiovisuales("Blum House","2004",190,"B15","México","4323453","SOL",2,"ciMArisol","ISBN",true);
        M4.Mostrar4();
        System.out.println("\n");
        Clase_RepositoriosDigitales M5=new Clase_RepositoriosDigitales("http:/Shkdje","PASSWORD","4323453","SOL",2,"ciMArisol","ISBN",true);
        M5.Mostrar5();
        System.out.println("\n");
        Clase_Prestamo M6=new Clase_Prestamo("48374","20/12/01","31/12/22","GOME0123","LBM01");
        M6.Mostrar6();   
        System.out.println("\n");
        Clase_Reporte M7=new Clase_Reporte("R01","Usuario no Identificado","20/01/32","C:\\ejemplo\\archivo.txt");
        M7.Mostrar7();           
    }
}
