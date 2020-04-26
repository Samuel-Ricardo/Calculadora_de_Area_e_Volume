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
public abstract class Calculadora {

    protected final float pi = 3.14f; // PI value  //  valor de PI
    protected float a, v; // Area and Volume respectively  //  Area e Volume respectivamente  

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getV() {
        return v;
    }

    public void setV(float v) {
        this.v = v;
    }

}
