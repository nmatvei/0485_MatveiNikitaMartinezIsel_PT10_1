/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._matveinikitamartinezisel_pt10_1;

/**
 *
 * @author nikit
 */
public class Caixa {
    /*Declaració d'atributs*/
    protected double amplada;
    protected double altura;
    protected double fondaria;
    protected String etiqueta;
    protected String unitats;
    
    /**
     * Constructor de la classe
     * 
     * @param ample
     * @param alt
     * @param fons
     * @param etiqueta
     * @param unitats 
     */
    public Caixa(double ample, double alt, double fons, String etiqueta, String unitats){
        this.amplada = ample;
        this.altura = alt;
        this.fondaria = fons;
        this.etiqueta = etiqueta;
        this.unitats = unitats;
    }
    /**
     * Mètode Volum per retornar el volum de la caixa en cc, el mètode té en compte si
     * les unitats amb les que s'han guardat l'objete són centimetres o metres.
     * 
     * @return 
     */
    public double Volum(){
        /*Declarem la variable volum per guardar el resultat del volum de la caixa*/
        double volum = 0;
        
        /*Comprovem amb quines unitats està declarat l'objecte que estem tractant*/
        if (this.unitats == "m"){
            volum = (this.amplada * 100) + (this.altura * 100) + (this.fondaria * 100);
        }
        else{
            volum = this.amplada + this.altura + this.fondaria;
        }
        
        /*Retornem el volum*/
        return volum;
    }
    
    /**
     * Mètode SET per canviar l'etiqueta de la caixa
     * 
     * @param etiqueta 
     */
    public void setEtiqueta(String etiqueta){
        this.etiqueta = etiqueta;
    }
    
    /**
     * 
     * @return 
     */
    public double getAmplada(){
        return amplada;
    }
    
    public double getAltura(){
        return altura;
    }
    
    public double getFondaria(){
        return fondaria;
    }
    
}
