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
public class ModelCalcArea extends Calculadora {

    public float calcCirculo(float r) {  // calculates the area of the circle  //  calcula a area do criculo
        a = pi * (r * r);
        return a;
    }

    public float calcTriangulo(float b, float h) {  // calculates the area of the triangle  //  calcula a area do triangulo
        a = (b * h) / 2;
        return a;
    }

    public float calcTrapezio(float b, float B, float h) {  // calculates the trapezoid area  //  calcula a area do Trapezio
        a = ((b + B) / 2) * h;
        return a;
    }
}
