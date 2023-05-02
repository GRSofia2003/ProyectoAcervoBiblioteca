package com.mycompany.clases;

public class Clase_RepositoriosDigitales extends Clase_MaterialDidactico{
    public String URL;
    public String Contraseña;
    
    Clase_RepositoriosDigitales(String U,String Contra,String ID,String Tí,int Exists,String Aut,String Tem,Boolean Est){
        super(ID,Tí,Exists,Aut,Tem,Est);
        URL=U;
        Contraseña=Contra;
    };
    
    void Mostrar5(){
        System.out.println("ID Control: "+ID_Control);
        System.out.println("Título: "+Título);
        System.out.println("Existencia: "+Existencia);
        System.out.println("Autor: "+Autor);
        System.out.println("Tema: "+Tema);
        System.out.println("Estado: "+Estado);
        System.out.println("URL: "+URL);
        System.out.println("Contraseña: "+Contraseña);
};
}
