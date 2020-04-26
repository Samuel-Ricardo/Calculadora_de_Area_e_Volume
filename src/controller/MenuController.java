/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import view.CalcArea;
import view.CalcVolume;
import view.Menu;

/**
 *
 * @author Samuel
 */
public class MenuController {

    private final Menu view;
    private final CalcArea calc = new CalcArea(); 
    private final CalcVolume volum = new CalcVolume();

    public MenuController(Menu view) {
        this.view = view;
    }

   

    public void abrirCalcArea() {// opens the window to calculate the area  //  abre a janela para calcular a área
   
     this.calc.setVisible(true);
       
        
    }

    public void abrirCalcVolume() {// opens the window to calculate the volume  //  abre a janela para calcular o volume
     this.volum.setVisible(true);
    }
    
    
    
    
}
