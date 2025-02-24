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
    /**
     * Constructor de la classe CaixaCartro
     * 
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
            this.altura *= 100;
            this.amplada *= 100;
            this.fondaria *= 100;
        }
    }
        
    /*Mètode Volum() sobrescrit*/
    @Override
    public double Volum() {
        /*Declarem una variable volum on guardarem el 80% del volum d'un
        objecte Caixa*/
        double volum = 0.8 * super.Volum();
        return volum;
    }
}