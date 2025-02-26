/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._matveinikitamartinezisel_pt10_1;

/**
 * Subclasse CaixaCartro de la classe Caixa
 *
 * @author nikita i isel
 */
public class CaixaCartro extends Caixa{
    /*Declaració de variables*/
    final static int NUM_CARES = 2;
    final static int PASAR_M_A_CM = 100;
    
    /**
     * Constructor de la classe CaixaCartro
     * @param ample
     * @param alt
     * @param fons
     * @param etiqueta
     * @param unitats 
     */
    public CaixaCartro (double ample, double alt, double fons, String etiqueta, String unitats){
        
        /*Truquem al contructor de la classe*/
        super(ample, alt, fons, etiqueta, unitats);
        
        /*Comprovem si les unitats estàn en metres, si ho estam, les canviem a
        centimetres*/
        if (this.unitats.equalsIgnoreCase("m")){
            this.unitats = "cm";
            this.altura *= PASAR_M_A_CM;
            this.amplada *= PASAR_M_A_CM;
            this.fondaria *= PASAR_M_A_CM;
        }
    }
        
    /**
     * Mètode Volum sobrescrit
     * @return 
     */
    @Override
    public double Volum() {
        /*Declarem una variable volum on guardarem el 80% del volum d'un
        objecte Caixa*/
        double volum = 0.8 * super.Volum();
        return volum;
    }
    
    /**
     * Mètode superficie per calcular l'àrea de cartro necessari per la caixa
     * @return 
     */
    public double superficie(){
        double superficie = NUM_CARES * (this.altura * this.amplada) 
                + NUM_CARES * (this.amplada * this.fondaria) 
                + NUM_CARES * (this.altura * this.fondaria);
        return superficie;
    }
}