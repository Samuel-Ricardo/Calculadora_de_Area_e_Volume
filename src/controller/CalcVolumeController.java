/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import controller.helpers.HelperCalcVolume;
import model.ModelCalcVolume;
import view.CalcVolume;

/**
 *
 * @author Samuel
 */
public class CalcVolumeController {

    private final CalcVolume view;
    private final ModelCalcVolume volume;
    private final HelperCalcVolume helper;

    public CalcVolumeController(CalcVolume view) {
        this.view = view;
        this.volume = new ModelCalcVolume();
        this.helper = new HelperCalcVolume(view);
    }

    public void limpar() {  // Cleans the screen  //Limpa a tela

        this.view.getjButtonCo().setVisible(false);
        this.view.getjButtonEsfe().setVisible(false);
        this.view.getjButtonCil().setVisible(false);
        this.view.getjLabelH().setVisible(false);
        this.view.getjLabelR().setVisible(false);
        this.view.getjTextFieldHaltura().setVisible(false);
        this.view.getjTextFieldRaio().setVisible(false);
        this.view.getjTextFieldResposta().setVisible(false);

        this.view.getjTextFieldHaltura().setText("");
        this.view.getjTextFieldRaio().setText("");
        this.view.getjTextFieldResposta().setText("");

    }

    public void mostrarCone() { // Starts/shows the components needed to calculate  //  Inicia/mostra os componentes nescessários para calcular

        this.view.getjButtonCo().setVisible(true);
        this.view.getjLabelH().setVisible(true);
        this.view.getjLabelR().setVisible(true);
        this.view.getjTextFieldHaltura().setVisible(true);
        this.view.getjTextFieldRaio().setVisible(true);

    }

    public void volumeCone() {    // Calculates  //  Calcula 
        this.view.getjTextFieldResposta().setVisible(true);
        float r = this.volume.calcCone(this.helper.getRaio(), this.helper.getHaltura());

        String res = (r + "");

        this.view.getjTextFieldResposta().setText(res);

    }

    public void mostrarCilindro() {  // Starts/shows the components needed to calculate  //  Inicia/mostra os componentes nescessários para calcular

        this.view.getjButtonCil().setVisible(true);
        this.view.getjLabelH().setVisible(true);
        this.view.getjLabelR().setVisible(true);
        this.view.getjTextFieldHaltura().setVisible(true);
        this.view.getjTextFieldRaio().setVisible(true);

    }

    public void volumeCilindro() {    // Calculates  //  Calcula 
        this.view.getjTextFieldResposta().setVisible(true);
        float r = this.volume.calcCilindro(this.helper.getRaio(), this.helper.getHaltura());

        String res = (r + "");

        this.view.getjTextFieldResposta().setText(res);

    }

    public void mostrarEsfera() { // Starts/shows the components needed to calculate  //  Inicia/mostra os componentes nescessários para calcular

        this.view.getjButtonEsfe().setVisible(true);
        this.view.getjLabelR().setVisible(true);
        this.view.getjTextFieldRaio().setVisible(true);

    }

    public void volumeEsfera() {   // Calculates  //  Calcula 
        this.view.getjTextFieldResposta().setVisible(true);
        float r = this.volume.calcEsfera(this.helper.getRaio());

        String res = (r + "");

        this.view.getjTextFieldResposta().setText(res);

    }

}
