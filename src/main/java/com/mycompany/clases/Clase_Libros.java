package com.mycompany.clases;

public class Clase_Libros extends Clase_MaterialDidactico{
    public String Editorial;
    public String Añodeimpresión;
    public String ISBN;
    public int Nodepáginas;
    public String País;
    
    Clase_Libros(String Edit,String AdI,String ISB,int No,String Ps,String ID,String Tí,int Exists,String Aut,String Tem,Boolean Est){
        super(ID,Tí,Exists,Aut,Tem,Est);
        Editorial=Edit;
        Añodeimpresión=AdI;
        ISBN=ISB;
        Nodepáginas=No;
        País=Ps;
    };
    
void Mostrar1(){
        System.out.println("ID Control: "+ID_Control);
        System.out.println("Título: "+Título);
        System.out.println("Existencia: "+Existencia);
        System.out.println("Autor: "+Autor);
        System.out.println("Tema: "+Tema);    
        System.out.println("Estado: "+Estado);
        System.out.println("Editorial: "+Editorial);
        System.out.println("Año de impresión: "+Añodeimpresión);
        System.out.println("ISBN: "+ISBN);
        System.out.println("No. de páginas: "+Nodepáginas);
};
    
}
