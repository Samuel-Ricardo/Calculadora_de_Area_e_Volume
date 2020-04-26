/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller.helpers;

import model.ModelCalcArea;
import view.CalcArea;

/**
 *
 * @author Samuel
 */
public class HelperCalcArea {

    private final CalcArea view;
    private final ModelCalcArea areaM;

    public HelperCalcArea(CalcArea view) {  // constructor  //  construtor
        this.view = view;
        this.areaM = new ModelCalcArea();

    }

    public float buscarTb() {  // returns the values of TextField b  //  retorna os valores do TextField b

        String b = this.view.getjTextFieldBaseb().getText();
        System.out.println(b);

        float bas = Float.parseFloat(b);
        System.out.println(bas);
        return bas;

    }

    public float buscarTh() { //returns the values of TextField h  //  retorna os valores do TextField h

        String h = this.view.getjTextFieldHaltura().getText();
        System.out.println(h);

        float ha = Float.parseFloat(h);
        System.out.println(ha);
        return ha;

    }

    public float buscarTB() {  //returns the values of TextField B  //  retorna os valores do TextField B
        String B = this.view.getjTextFieldBaseB().getText();

        float ba = Float.parseFloat(B);

        return ba;

    }

    public float buscarTR() {  //returns the values of TextField R  //  retorna os valores do TextField R
        String r = this.view.getjTextFieldRaio().getText();

        float ra = Float.parseFloat(r);

        return ra;
    }

}
