/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._matveinikitamartinezisel_pt10_1;

/**
 * Classe Caixa
 *
 * @author nikita i isel
 */
public class Caixa {
    /*Declaració d'atributs*/
    protected double amplada;
    protected double altura;
    protected double fondaria;
    protected String etiqueta;
    protected String unitats;
    
    /**
     * Constructor de la classe Caixa
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
        double volum= this.amplada + this.altura + this.fondaria;
        
        /*Comprovem si el volum està en metres per passar el volum a centimentres 
        cúbics*/
        if (this.unitats.equalsIgnoreCase("m") || 
                this.unitats.equalsIgnoreCase("metres")){
            volum *= 1000000;
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
     * Mètode GET per conseguir l'amplada
     * @return 
     */
    public double getAmplada(){
        return amplada;
    }
    
    /**
     * Mètode GET per conseguir l'altura
     * @return 
     */
    public double getAltura(){
        return altura;
    }
    
    /**
     * Mètode GET per conseguir la fondaria
     * @return 
     */
    public double getFondaria(){
        return fondaria;
    }

    /**
     * Mètode toString per mostrar la informació del objecte
     * 
     * @return 
     */
    public String toString() {
        return "Caixa{" + "amplada = " + amplada + ", altura = " + altura + ", "
                + "fondaria = " + fondaria + ", etiqueta = " + etiqueta + ", "
                + "unitats = " + unitats + '}';
    }
}
