/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Samuel
 */
public class ModelCalcVolume extends Calculadora {

    public float calcCilindro(float r, float h) {  // Calculates cylinder volume  //  Calcula o volume do cilindo
        v = (pi * (r * r)) * h;
        return v;
    }

    public float calcCone(float r, float h) {  // Calculates the volume of the cone  //  Calcula o volume do cone
        v = ((pi * (r * r)) / 3) * h;
        return v;
    }

    public float calcEsfera(float r) {  // Calculates the volume of the cylinder   //  Calcula o volume do cone
        v = (4 / 3) * pi * (r * r * r);
        return v;
    }

}
