/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany._matveinikitamartinezisel_pt10_1;

/**
 * Scrip on es demostra el funcionament de la classe Caixa i la classe Subcaixa
 *
 * @author nikita i isel
 */
public class Principal {

    public static void main(String[] args) {
        System.out.println("PROVES DE LA CLASSE CAIXA I LA SUBCLASSE CAIXACARTRO");
        System.out.println("\nDeclarem dues caixes");
        System.out.println("\n\t1ª Caixa on les mesures són en mentres");
        Caixa caixaCentimetres = new Caixa(4.0,9.0,7.0,"Remitent: Correos, Receptor: Joan Jimenez","m");
        System.out.println("\t\tAmplada de la caixa: " + caixaCentimetres.getAmplada());
        System.out.println("\t\tAltura de la caixa: " + caixaCentimetres.getAltura());
        System.out.println("\t\tFondaria de la caixa: " + caixaCentimetres.getFondaria());
        System.out.println("\t\tVolum de la caixa (en c.c.): " + caixaCentimetres.Volum());
        /*System.out.println("\t\tCanviem l'etiqueta de la caixa (en c.c.): " 
                + caixaCentimetres.setEtiqueta("Remitent: Correos, Receptor: Joan López"));*/
        System.out.println("\t\tConseguim totes les dades de la caixa amb el toString: " 
                + caixaCentimetres.toString());
        
        System.out.println("\n2ª Caixa on les mesures són en centimetres");
        Caixa caixaMetres = new Caixa(2.5,7.5,8.75,"Remitent: Correos, Receptor: Julia Alvarez","cm");
        System.out.println("\t\tAmplada de la caixa: " + caixaMetres.getAmplada());
        System.out.println("\t\tAltura de la caixa: " + caixaMetres.getAltura());
        System.out.println("\t\tFondaria de la caixa: " + caixaMetres.getFondaria());
        System.out.println("\t\tVolum de la caixa (en c.c.): " + caixaMetres.Volum());
        /*System.out.println("\t\tCanviem l'etiqueta de la caixa (en c.c.): " 
                + caixaMetres.setEtiqueta("Remitent: Correos, Receptor: Joan López"));*/
        System.out.println("\t\tConseguim totes les dades de la caixa amb el toString: " 
                + caixaMetres.toString());
    }
}
