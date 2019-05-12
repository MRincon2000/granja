/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;
import becker.robots.*;
import java.awt.Color;

import java.util.*;
import java.util.Random;
/**
 *
 * @author Miguel Rincon
 */
public class Corral {

private HashMap<Integer,Vacas>corral;
private int lote1;
private int lote2;
private int lote3;
private Granjero granjero;

public Corral(){
    
    this.corral= new HashMap<>();
    this.lote1=0;
    this.lote2=0;
    this.lote3=0;
    
}

    public int getLote1() {
        return lote1;
    }

    public int getLote2() {
        return lote2;
    }

    public int getLote3() {
        return lote3;
    }

    public HashMap<Integer, Vacas> getCorral() {
        return corral;
    }


public void registrarVaca(City city, int i){

    int o=0;
    int n=2;

    if(i==1){
    o=this.lote1+1;

    }
    if(i==2){
    o=this.lote2+11;

    }
    if(i==3){
    o=this.lote3+21;

    }
    Vacas vaca=new Vacas(city,n,o, Direction.SOUTH);
    
    this.corral.put(o, vaca);
    if (i==1){
       if(lote1<11){
          vaca.setLote(i);  
          lote1++;
       }
       else{
           System.out.println("No se puede asignar al lote");
       }
    }
    if (i==2){
        if(lote2<11){
            vaca.setLote(i);
            lote2++;
        }
        else{
            System.out.println("No se puede asignar al lote");
        }
    }
    if (i==3){
        if(lote3<11){
            vaca.setLote(i);
            lote3++;
        }
        else{
            System.out.println("No se puede asignar al lote");
        }
    }
}
public void ordenar(int lote){
    Random r=new Random();
  if (lote==1){
      for(int i=1;i<=this.lote1;i++){
      for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
      if(corral.get(i).getAvenue()<5){
          this.corral.get(i).turnLeft();
          int w=5-corral.get(i).getAvenue();
          for(int y=0;y<w;y++){
          this.corral.get(i).move();
          }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }

       for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      }
       this.corral.get(i).setLeche(r.nextDouble()*20+5);
          System.out.println(i+": "+this.corral.get(i).getLeche());

           for(int d=0;d<3;d++){
         this.corral.get(i).move();
           }
         this.corral.get(i).turnLeft(); 
         for(int d=0;d<w;d++){
         this.corral.get(i).move(); 
      }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
 for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      }
      }
      else{
          for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
         int w=-(5-corral.get(i).getAvenue());
          for(int y=0;y<w;y++){
          this.corral.get(i).move();
      }
         this.corral.get(i).turnLeft();
         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }
          for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
          }
         this.corral.get(i).setLeche(r.nextDouble()*20+5);
          System.out.println(i+": "+this.corral.get(i).getLeche());

         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
     for(int d=0;d<w;d++){
         this.corral.get(i).move(); 
      }   
          this.corral.get(i).turnLeft();
          for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
         for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      } 
      }
       
  }
}
  if (lote==2){
      for(int i=11;i<=this.lote2+10;i++){
      for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
      if(corral.get(i).getAvenue()<15){
          this.corral.get(i).turnLeft();
          int w=15-corral.get(i).getAvenue();
          for(int y=0;y<w;y++){
          this.corral.get(i).move();
          }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }

       for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      }
       this.corral.get(i).setLeche(r.nextDouble()*20+5);
          System.out.println(i+": "+this.corral.get(i).getLeche());

           for(int d=0;d<3;d++){
         this.corral.get(i).move();
           }
         this.corral.get(i).turnLeft(); 
         for(int d=0;d<w;d++){
         this.corral.get(i).move(); 
      }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
 for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      }
      }
      else{
          for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
         int w=-(15-corral.get(i).getAvenue());
          for(int y=0;y<w;y++){
          this.corral.get(i).move();
      }
         this.corral.get(i).turnLeft();
         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }
          for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
          }
         this.corral.get(i).setLeche(r.nextDouble()*20+5);
          System.out.println(i+": "+this.corral.get(i).getLeche());

         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
     for(int d=0;d<w;d++){
         this.corral.get(i).move(); 
      }   
          this.corral.get(i).turnLeft();
          for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
         for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      } 
      }
       
  }
}
  if (lote==3){
      for(int i=21;i<=this.lote3+20;i++){
      for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
      if(corral.get(i).getAvenue()<25){
          this.corral.get(i).turnLeft();
          int w=25-corral.get(i).getAvenue();
          for(int y=0;y<w;y++){
          this.corral.get(i).move();
          }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }

       for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      }
       this.corral.get(i).setLeche(r.nextDouble()*20+5);
          System.out.println(i+": "+this.corral.get(i).getLeche());

           for(int d=0;d<3;d++){
         this.corral.get(i).move();
           }
         this.corral.get(i).turnLeft(); 
         for(int d=0;d<w;d++){
         this.corral.get(i).move(); 
      }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
 for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      }
      }
      else{
          for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
         int w=-(25-corral.get(i).getAvenue());
          for(int y=0;y<w;y++){
          this.corral.get(i).move();
      }
         this.corral.get(i).turnLeft();
         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }
          for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
          }
         this.corral.get(i).setLeche(r.nextDouble()*20+5);
          System.out.println(i+": "+this.corral.get(i).getLeche());

         for(int d=0;d<3;d++){
         this.corral.get(i).move(); 
      }
         for(int d=0;d<3;d++){
          this.corral.get(i).turnLeft();
      }
     for(int d=0;d<w;d++){
         this.corral.get(i).move(); 
      }   
          this.corral.get(i).turnLeft();
          for(int s=0;s<17;s++){
          this.corral.get(i).move();
  }
         for(int d=0;d<2;d++){
         this.corral.get(i).turnLeft(); 
      } 
      }
       
  }
}
}
public void nuevoGranjero(City city){
    granjero=new Granjero(city,0,15,Direction.SOUTH);
}
public void tratamiento(int ID){
    if(this.corral.get(ID).getFrec()>70 ||this.corral.get(ID).getTemp()>38.5){
    Random r= new Random();
    double prob=r.nextDouble()*100+0;
    if (ID<=10){
for(int d=0;d<3;d++){
          granjero.turnLeft();
      }
for(int s=0;s<10;s++){
          granjero.move();
  }
granjero.turnLeft();

          granjero.move();

if( this.corral.get(ID).getAvenue()<5){
    for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
    int w=5-this.corral.get(ID).getAvenue();
      for(int s=0;s<w;s++){
       granjero.move();
      }
      granjero.turnLeft();
 
  if (0<prob && prob<=70){
      this.corral.get(ID).setFrec(70);
      this.corral.get(ID).setTemp(38.5);
      System.out.println("Tratamiento exitoso");
             corral.get(ID).cambiarColor();
  }
         granjero.turnLeft(); 
  for(int s=0;s<w;s++){
       granjero.move();
      }
  granjero.turnLeft();
}
else{

          granjero.turnLeft();
    int w=-(5-this.corral.get(ID).getAvenue());
      for(int s=0;s<w;s++){
       granjero.move();
      }
     for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
 
  if (0<prob && prob<=70){
      this.corral.get(ID).setFrec(70);
      this.corral.get(ID).setTemp(38.5);
      System.out.println("Tratamiento exitoso");
      corral.get(ID).cambiarColor();
  }
         for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
  for(int s=0;s<w;s++){
       granjero.move();
      }
  for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
}

          granjero.move();

  for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
for(int s=0;s<10;s++){
          granjero.move();
  }
for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
}
if (ID>10 && ID<=20){
          granjero.move();
if( this.corral.get(ID).getAvenue()<15){
    for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
    int w=15-this.corral.get(ID).getAvenue();
      for(int s=0;s<w;s++){
       granjero.move();
      }
      granjero.turnLeft();
 
  if (0<prob && prob<=70){
      this.corral.get(ID).setFrec(70);
      this.corral.get(ID).setTemp(38.5);
      System.out.println("Tratamiento exitoso");
      corral.get(ID).cambiarColor();
  }
        granjero.turnLeft(); 
  for(int s=0;s<w;s++){
       granjero.move();
      }
  granjero.turnLeft();
  granjero.move();
}
else{

          granjero.turnLeft();
    int w=-(15-this.corral.get(ID).getAvenue());
      for(int s=0;s<w;s++){
       granjero.move();
      }
     for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
 
  if (0<prob && prob<=70){
      this.corral.get(ID).setFrec(70);
      this.corral.get(ID).setTemp(38.5);
      System.out.println("Tratamiento exitoso");
      corral.get(ID).cambiarColor();
  }
         for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
  for(int s=0;s<w;s++){
       granjero.move();
      }
  for(int d=0;d<3;d++){
          granjero.turnLeft();
    }

          granjero.move();
  }
  for(int d=0;d<2;d++){
          granjero.turnLeft();
    }

}
if (ID>20){
    granjero.turnLeft();      
for(int s=0;s<10;s++){
          granjero.move();
  }
 for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
 granjero.move();
if( this.corral.get(ID).getAvenue()<25){
    for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
    int w=25-this.corral.get(ID).getAvenue();
      for(int s=0;s<w;s++){
       granjero.move();
      }
      granjero.turnLeft();
 
  if (0<prob && prob<=70){
      this.corral.get(ID).setFrec(70);
      this.corral.get(ID).setTemp(38.5);
      System.out.println("Tratamiento exitoso");
      corral.get(ID).cambiarColor();
  }
        granjero.turnLeft(); 
  for(int s=0;s<w;s++){
       granjero.move();
      }
  granjero.turnLeft();
  granjero.move();
}
else{

          granjero.turnLeft();
    int w=-(25-this.corral.get(ID).getAvenue());
      for(int s=0;s<w;s++){
       granjero.move();
      }
     for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
 
  if (0<prob && prob<=70){
      this.corral.get(ID).setFrec(70);
      this.corral.get(ID).setTemp(38.5);
      System.out.println("Tratamiento exitoso");
      corral.get(ID).cambiarColor();
  }
         for(int d=0;d<3;d++){
          granjero.turnLeft();
    }
  for(int s=0;s<w;s++){
       granjero.move();
      }
  for(int d=0;d<3;d++){
          granjero.turnLeft();
    }

          granjero.move();
  }
 granjero.turnLeft();
 for(int s=0;s<10;s++){
          granjero.move();
  }

          granjero.turnLeft();
    }
}
}
public void embarazar(int i){
    corral.get(i).setGestacion(true);
    corral.get(i).cambiarColor();
}
public void informacion(int i){
    System.out.println("Frecuencia:  "+  corral.get(i).getFrec());
    System.out.println("Temperatura:  "+  corral.get(i).getTemp());
    System.out.println("Leche:  "+  corral.get(i).getLeche()); 
    System.out.println("Gestacion:  "+  corral.get(i).getGestacion());
   System.out.println("Tiempo de Gestacion:  "+  corral.get(i).getTiempo());
}
public void leche(){
double w=0;
    for(int s=11;s<=this.getLote2()+10;s++){
        w=w+this.corral.get(s).getLeche();
}
    for(int s=1;s<=this.getLote1();s++){
        w=w+this.corral.get(s).getLeche();
}
    for(int s=21;s<=this.getLote3();s++){
        w=w+this.corral.get(s).getLeche();
}
    System.out.println("Leche total:  "+w);
}
}



   

   






