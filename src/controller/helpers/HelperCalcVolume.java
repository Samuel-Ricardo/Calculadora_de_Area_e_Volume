/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helpers;

import view.CalcVolume;

/**
 *
 * @author Samuel
 */
public class HelperCalcVolume {

    private final CalcVolume view;

    public HelperCalcVolume(CalcVolume view) {
        this.view = view;
    }

    public float getRaio() {   // returns the values of TextField  Radius  //  retorna os valores do TextField Raios
        float R = Float.parseFloat(this.view.getjTextFieldRaio().getText());

        return R;
    }

    public float getHaltura() {   // returns the values of TextField Height  //  retorna os valores do TextField Haltura
        float H = Float.parseFloat(this.view.getjTextFieldHaltura().getText());

        return H;
    }

}
