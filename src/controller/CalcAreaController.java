/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helpers.HelperCalcArea;
import model.ModelCalcArea;
import view.CalcArea;

/**
 *
 * @author Samuel
 */
public class CalcAreaController {

    private final CalcArea view;
    private final HelperCalcArea helper;
    private final ModelCalcArea areaM;

    public CalcAreaController(CalcArea view) {
        this.view = view;
        this.helper = new HelperCalcArea(view);
        this.areaM = new ModelCalcArea();
    }

    public void mostrarTriganulo() {  // Starts/shows the components needed to calculate the triangle  //  Inicia/mostra os componentes nescessários para calcular o triangulo

        this.view.getjTextFieldBaseb().setVisible(true);
        this.view.getjTextFieldHaltura().setVisible(true);
        this.view.getjButtonCalcularT().setVisible(true);

        this.view.getjLabelb().setVisible(true);

        this.view.getjLabelh().setVisible(true);

    }

    public void limpar() { // Cleans the screen  //Limpa a tela

        this.view.getjTextFieldBaseb().setVisible(false);
        this.view.getjTextFieldHaltura().setVisible(false);
        this.view.getjButtonCalcularT().setVisible(false);
        this.view.getjTextFieldBaseB().setVisible(false);
        this.view.getjTextFieldResultado().setVisible(false);
        this.view.getjTextFieldRaio().setVisible(false);
        this.view.getjLabelB().setVisible(false);
        this.view.getjLabelb().setVisible(false);
        this.view.getjLabelr().setVisible(false);
        this.view.getjLabelh().setVisible(false);

        this.view.getjTextFieldBaseb().setText("");
        this.view.getjTextFieldHaltura().setText("");
        this.view.getjTextFieldBaseB().setText("");
        this.view.getjTextFieldResultado().setText("");
        this.view.getjTextFieldRaio().setText("");

    }

    public void calcTriganulo() {  // Calculates  //  Calcula 

        float a = this.areaM.calcTriangulo(this.helper.buscarTb(), this.helper.buscarTh());
        String re = (a + "");
        System.out.println(re);
        this.view.getjTextFieldResultado().setVisible(true);
        this.view.getjTextFieldResultado().setText(re);

    }

    public void mostrarTrapezio() { // Starts/shows the components needed to calculate //  Inicia/mostra os componentes nescessários para calcular 

        this.view.getjTextFieldBaseB().setVisible(true);
        this.view.getjTextFieldBaseb().setVisible(true);
        this.view.getjTextFieldHaltura().setVisible(true);
        this.view.getjButtonCalcularT2().setVisible(true);
        this.view.getjLabelB().setVisible(true);
        this.view.getjLabelb().setVisible(true);

        this.view.getjLabelh().setVisible(true);

    }

    public void calcTrapezio() {  // Calculates  //  Calcula 

        float r = this.areaM.calcTrapezio(this.helper.buscarTb(), this.helper.buscarTB(), this.helper.buscarTh());
        String re = (r + "");

        this.view.getjTextFieldResultado().setText(re);

        this.view.getjTextFieldResultado().setVisible(true);

    }

    public void calcCirculo() {  // Calculates  //  Calcula 
        float a = this.areaM.calcCirculo(this.helper.buscarTR());
        String re = (a + "");

        this.view.getjTextFieldResultado().setText(re);
        this.view.getjTextFieldResultado().setVisible(true);

    }

    public void mostrarCirculo() {  // Starts/shows the components needed to calculate  //  Inicia/mostra os componentes nescessários para calcular

        this.view.getjButtonCalcularR().setVisible(true);
        this.view.getjLabelr().setVisible(true);
        this.view.getjTextFieldRaio().setVisible(true);

    }

}
