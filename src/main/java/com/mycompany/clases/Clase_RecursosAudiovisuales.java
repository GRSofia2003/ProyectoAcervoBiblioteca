package com.mycompany.clases;

public class Clase_RecursosAudiovisuales extends Clase_MaterialDidactico{
    public String Productora;
    public String Año;
    public int Duración;
    public String Clasificación;
    public String País;
    
    Clase_RecursosAudiovisuales(String Product,String Añ,int Dur,String Clas,String Ps,String ID,String Tí,int Exists,String Aut,String Tem,Boolean Est){
        super(ID,Tí,Exists,Aut,Tem,Est);
        Productora=Product;
        Año=Añ;
        Duración=Dur;
        Clasificación=Clas;
        País=Ps;
    };
    
    void Mostrar4(){
        System.out.println("ID Control: "+ID_Control);
        System.out.println("Título: "+Título);
        System.out.println("Existencia: "+Existencia);
        System.out.println("Autor: "+Autor);
        System.out.println("Tema: "+Tema);
        System.out.println("Estado: "+Estado);
        System.out.println("Productora: "+Productora);
        System.out.println("Año: "+Año);
        System.out.println("Duración: "+Duración);
        System.out.println("Clasificación: "+Clasificación);
        System.out.println("País: "+País);
};
    
}
