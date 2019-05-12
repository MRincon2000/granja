package unal.poo.practica;

import becker.robots.*;
import java.util.*;
import java.awt.Color;
import java.util.Random;
/** 
 * Practica de los conceptos de Programacion Estructurada
 * @author Fabian Andres Giraldo */
public class RobotBase
{    
       //Declaracion de Variables -- Forma temporal - No es buena practica tener
       //variables estaticas
        public static City objetos;
        
	public static void main (String[] args){
            //Declarar la creacion de la ciudad
            objetos = new City("Field.txt");


          Random r = new Random();
       Corral c=new Corral();
      c.nuevoGranjero(objetos);
       c.registrarVaca(objetos, 1);
       
       c.registrarVaca(objetos,2);
       c.registrarVaca(objetos,2);
       
       c.registrarVaca(objetos,3);
         c.registrarVaca(objetos,3);
    for(int i=0;i<1000000;i++){

       for(int s=1;s<=c.getLote1();s++){
        c.getCorral().get(s).setFrec(r.nextDouble()*100+40);
        c.getCorral().get(s).setTemp(r.nextDouble()*45+30);
        if(c.getCorral().get(s).getGestacion()==true){
         c.getCorral().get(s).setTiempo(c.getCorral().get(s).getTiempo()+1);
        }
        if(c.getCorral().get(s).getTiempo()==10){
            c.registrarVaca(objetos,c.getLote1()+1);
        }
        c.getCorral().get(s).cambiarColor();
        
                }
       for(int s=11;s<=c.getLote2()+10;s++){
        c.getCorral().get(s).setFrec(r.nextDouble()*100+50);
        c.getCorral().get(s).setTemp(r.nextDouble()*45+30);
         if(c.getCorral().get(s).getGestacion()==true){
         c.getCorral().get(s).setTiempo(c.getCorral().get(s).getTiempo()+1);
        }
        if(c.getCorral().get(s).getTiempo()==10){
            c.registrarVaca(objetos,11+c.getLote2());
        }
        c.getCorral().get(s).cambiarColor();
                }
       for(int s=21;s<=c.getLote3()+20;s++){
        c.getCorral().get(s).setFrec(r.nextDouble()*100+50);
        c.getCorral().get(s).setTemp(r.nextDouble()*45+30);
        if(c.getCorral().get(s).getGestacion()==true){
         c.getCorral().get(s).setTiempo(c.getCorral().get(s).getTiempo()+1);
        }
        if(c.getCorral().get(s).getTiempo()==10){
            c.registrarVaca(objetos,11+c.getLote2());
        }
        c.getCorral().get(s).cambiarColor();
                }
        System.out.println(i); 
        System.out.println("Bienvenido. Seleccione una función:");
        System.out.println("1.Registrar vaca");
        System.out.println("2.Aplicar tratamiento");
        System.out.println("3.Ordeñar un lote");
        System.out.println("4.Embarazar vaca");
        System.out.println("5. Informacion");
        System.out.println("6.Leche total");
        
        Scanner eleccion=new Scanner(System.in);
        int s =eleccion.nextInt();
        switch(s){
            case 1:
                System.out.println("ingrese el lote: ");
               int w=eleccion.nextInt();
                c.registrarVaca(objetos, w);
                break;
            case 2:
                System.out.println("indique el codigo de la vaca: ");
                int q= eleccion.nextInt();
                c.tratamiento(q);
                break;
            case 3:
                System.out.println("indique cual lote desea ordeñar: ");
                int e=eleccion.nextInt();
                c.ordenar(e);
                break;
            case 4:
                System.out.println("Indique la vaca a embarazar: ");
                int t=eleccion.nextInt();
                c.embarazar(t);
                break;
            case 5:
                System.out.println("indique la vaca que desea consultar: ");
                int y=eleccion.nextInt();
                c.informacion(y);
                break;
            case 6:
                c.leche();
                break;
            
    }
        
        
        esperar(15);
       
}
    
}
        public static void esperar(int segundos){
        try {
            Thread.sleep(segundos * 1000);
         } catch (Exception e) {
            System.out.println(e);
         }
    }   


} 

