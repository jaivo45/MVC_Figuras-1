/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

/**
 *
 * @author DRAGKOZ
 */
public class ModelPerimetro {
    private double perimetro = 0.0;
    private double base = 0.0;
    private double altura = 0.0;

    /**
     * @return the perimetro
     */
    public double getPerimetro() {
        return perimetro;
    }

    /**
     * @param perimetro the perimetro to set
     */
    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }

    /**
     * @return the base
     */
    public double getBase() {
        return base;
    }

    /**
     * @param base the base to set
     */
    public void setBase(double base) {
        this.base = base;
    }

    /**
     * @return the altura
     */
    public double getAltura() {
        return altura;
    }

    /**
     * @param altura the altura to set
     */
    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public void pCuadrado (){
        perimetro = base * 4;
    }
    
    public void pRectangulo (){
        perimetro = 2*(base + altura);
    }
    
    public void pTrianguloEquilatero (){
        perimetro = 3*base;
    }
}
