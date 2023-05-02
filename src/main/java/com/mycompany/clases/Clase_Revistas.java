package com.mycompany.clases;

import java.util.Date;

public class Clase_Revistas extends Clase_MaterialDidactico{
    public String Editorial;
    public String Fecha;//Date
    public String ISBN;
    public int Nodepáginas;
    public String Volumen;
    public String País;
    
    Clase_Revistas(String Edit,String Fe,String ISB,int No,String Vol,String Ps,String ID,String Tí,int Exists,String Aut,String Tem,Boolean Est){
    super(ID,Tí,Exists,Aut,Tem,Est);
    Editorial=Edit;
    Fecha=Fe;
    ISBN=ISB;
    Nodepáginas=No;
    Volumen=Vol;
    País=Ps;
    };
    
void Mostrar2(){
        System.out.println("ID Control: "+ID_Control);
        System.out.println("Título: "+Título);
        System.out.println("Existencia: "+Existencia);
        System.out.println("Autor: "+Autor);
        System.out.println("Tema: "+Tema);
        System.out.println("Estado: "+Estado);
        System.out.println("Editorial: "+Editorial);
        System.out.println("Fecha: "+Fecha);
        System.out.println("ISBN: "+ISBN);
        System.out.println("No. de páginas: "+Nodepáginas);
        System.out.println("Volumen: "+Volumen);
        System.out.println("País: "+País);        
    };
        
}
