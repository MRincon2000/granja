/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package unal.poo.practica;

import becker.robots.City;
import becker.robots.Direction;
import java.awt.Color;


public class Granjero extends becker.robots.Robot {

    public Granjero(City city, int i, int i1, Direction drctn) {
        super(city, i, i1, drctn);
        this.setColor(Color.ORANGE);
    }
    
    
}
