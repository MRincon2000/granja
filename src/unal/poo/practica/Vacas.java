/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import java.awt.Color;

/**
 *
 * @author Miguel Rincon
 */
public class Vacas extends becker.robots.Robot{

private int Temp;
private int Frec;
private boolean Gestacion;
private int lote;
private double leche;
private int tiempo;


    public Vacas(City city,int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.setColor(Color.BLACK);
        this.Frec=70;
        this.Temp=38;
        this.Gestacion=false;
        this.lote=0;
            this.leche=0;
            this.tiempo=0;
    }

    public int getTiempo() {
        return tiempo;
    }

    public void setTiempo(int tiempo) {
        this.tiempo = tiempo;
    }

    public double getTemp() {
        return Temp;
    }

    public void setTemp(int Temp) {
        this.Temp = Temp;
    }

    public double getFrec() {
        return Frec;
    }

    public void setFrec(int Frec) {
        this.Frec = Frec;
    }

    public boolean getGestacion() {
        return Gestacion;
    }

    public void setGestacion(boolean Gestacion) {
        this.Gestacion = Gestacion;
    }

    public int getLote() {
        return lote;
    }

    public void setLote(int lote) {
        if(lote>0 && lote<4){
          this.lote = lote;   
        }
        else{
            System.out.println("Lote invalido");
        }
    }

    public double getLeche() {
        return leche;
    }

    public void setLeche(double leche) {
        this.leche = leche;
    }
    
public void cambiarColor(){
    if(this.Temp>38.5 || this.Frec>70){
       if( this.Gestacion==false){
           
        this.setColor(Color.RED);
    }
       if( this.Gestacion==true){
           this.setColor(Color.MAGENTA);
       }
    }
   
    if(this.Temp<=38.5 && this.Frec<=70){
        if(this.Gestacion==true){
            this.setColor(Color.BLUE);
        }
        if(this.Gestacion==false){
            this.setColor(Color.BLACK);
        }
}    
}   
    
}
