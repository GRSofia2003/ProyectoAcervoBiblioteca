package com.mycompany.clases;

public class Clase_MaterialDidactico {
    public String ID_Control;
    public String Título;
    public int Existencia;
    public String Autor;
    public String Tema;
    public Boolean Estado;
    
    Clase_MaterialDidactico(String ID,String Tí,int Exists,String Aut,String Tem,Boolean Est){
        ID_Control=ID;
        Título=Tí;
        Existencia=Exists;
        Autor=Aut;
        Tema=Tem;
        Estado=Est;
    };
    
    void Mostrar0(){
        System.out.println("ID Control: "+ID_Control);
        System.out.println("Título: "+Título);
        System.out.println("Existencia: "+Existencia);
        System.out.println("Autor: "+Autor);
        System.out.println("Tema: "+Tema);
        System.out.println("Estado: "+Estado);
};
        
}
