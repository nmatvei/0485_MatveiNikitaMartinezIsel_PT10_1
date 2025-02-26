/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany._matveinikitamartinezisel_pt10_1;

import java.util.Scanner;

/**
 * Classe Caixa
 *
 * @author nikita i isel
 */
public class Caixa {
    /*Declaració d'atributs i variables*/
    protected double amplada;
    protected double altura;
    protected double fondaria;
    protected String etiqueta;
    protected String unitats;
    final static int PASAR_CC_A_MC = 1000000;
    final static int LLARGADA_MAX_ETIQUETA = 30;
    
    /**
     * Constructor de la classe Caixa
     * @param ample
     * @param alt
     * @param fons
     * @param etiqueta
     * @param unitats 
     */
    public Caixa(double ample, double alt, double fons, String etiqueta, String unitats){
        /*Declaració de variables i scanner*/
        Scanner sc = new Scanner(System.in);
        boolean demanarDades = false;
        
        /*Bucle While per demanar dades, si es que no cumpleixen certes condicions*/
        while (!demanarDades){
            try{
                if (ample <= 0){
                    System.out.println("ERROR: Has Introduït una amplada erronea");
                    System.out.print("Introdueix un altre cop l'amplada: ");
                    ample = sc.nextDouble();
                }
                else if (alt <= 0){
                    System.out.println("ERROR: Has Introduït una altura erronea");
                    System.out.print("Introdueix un altre cop l'altura: ");
                    alt = sc.nextDouble();
                }
                else if (fons <= 0){
                    System.out.println("ERROR: Has Introduït una fondaria erronea");
                    System.out.print("Introdueix un altre cop fondaria: ");
                    fons = sc.nextDouble();
                }
                else if (etiqueta.length() > LLARGADA_MAX_ETIQUETA){
                    System.out.println("ERROR: Has Introduït una etiqueta massa llarga, torna a introduïrla");
                    System.out.print("Introdueix un altre cop l'etiqueta: ");
                    etiqueta = sc.next();
                }
                else {
                    demanarDades = true;
                }
            } catch(Exception e){
                sc.nextLine();
                System.out.println("Has introduït una dada en format incorrecte.");
            }
            
        }
        
        /*Donem valor als atributs del objecte*/
        this.amplada = ample;
        this.altura = alt;
        this.fondaria = fons;
        this.etiqueta = etiqueta;
        this.unitats = unitats;
    }
    
    /**
     * Mètode Volum per retornar el volum de la caixa en cc, el mètode té en compte si
     * les unitats amb les que s'han guardat l'objete són centimetres o metres.
     * @return 
     */
    public double Volum(){
        /*Declarem la variable volum per guardar el resultat del volum de la caixa*/
        double volum= this.amplada + this.altura + this.fondaria;
        
        /*Comprovem si el volum està en metres per passar el volum a centimentres 
        cúbics*/
        if (this.unitats.equalsIgnoreCase("m") || 
                this.unitats.equalsIgnoreCase("metres")){
            volum *= PASAR_CC_A_MC;
        }
        
        /*Retornem el volum*/
        return volum;
    }
    
    /**
     * Mètode SET per canviar l'etiqueta de la caixa
     * @param etiqueta 
     */
    public void setEtiqueta(String etiqueta){
        /*Comprovem que la etiqueta no supera la llargada màxima*/
        if (etiqueta.length() > LLARGADA_MAX_ETIQUETA){
            
            /*Declaració de variables i Scanner*/
            boolean demanarEtiqueta = false;
            Scanner sc = new Scanner(System.in);
            
            /*Estructura WHILE per demanar la etiqueta les vegades que fagi falta*/
            while(!demanarEtiqueta){
                System.out.println("ERROR: Has Introduït una etiqueta massa "
                        + "llarga, torna a introduïrla ");
                System.out.print("Introdueix un altre cop l'etiqueta: ");
                etiqueta = sc.next();
                
                if (etiqueta.length() <= LLARGADA_MAX_ETIQUETA){
                    demanarEtiqueta = true;
                }
            }
        }
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
     * @return 
     */
    public String toString() {
        return "Caixa{" + "amplada = " + amplada + ", altura = " + altura + ", "
                + "fondaria = " + fondaria + ", etiqueta = " + etiqueta + ", "
                + "unitats = " + unitats + '}';
    }
}
