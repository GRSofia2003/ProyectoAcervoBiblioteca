package com.mycompany.clases;

import java.util.Date;

public class Clase_Tesis extends Clase_MaterialDidactico{
    public String Nivel;
    public String Carrera;
    public String Fecha;//Date
    public int Nodepáginas;
    
    Clase_Tesis(String Niv,String Car,String Fe,int No,String ID,String Tí,int Exists,String Aut,String Tem,Boolean Est){
        super(ID,Tí,Exists,Aut,Tem,Est);
        Nivel=Niv;
        Carrera=Car;
        Fecha=Fe;
        Nodepáginas=No;
    };
    
    void Mostrar3(){
        System.out.println("ID Control: "+ID_Control);
        System.out.println("Título: "+Título);
        System.out.println("Existencia: "+Existencia);
        System.out.println("Autor: "+Autor);
        System.out.println("Tema: "+Tema);
        System.out.println("Estado: "+Estado);
        System.out.println("Nivel: "+Nivel);
        System.out.println("Carrera: "+Carrera);
        System.out.println("Fecha: "+Fecha);
        System.out.println("No. de páginas: "+Nodepáginas);
};
    
}
