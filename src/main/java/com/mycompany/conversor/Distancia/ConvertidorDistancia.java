package com.mycompany.conversor.Distancia;

import javax.swing.JOptionPane;

public class ConvertidorDistancia {

    public void MetrosACentimetros(double Medida) {
        double centimetros = Medida * 100;
        centimetros = (double) Math.round(centimetros * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La Medida es Equivalente a " + centimetros + " Centimetros");
    }

    public void KilometroAMetros(double Medida) {
        double metros = Medida * 1000;
        metros = (double) Math.round(metros * 100d) / 100;
        JOptionPane.showMessageDialog(null, "La Medida Equivale a " + metros + " Metros");
    }
}
