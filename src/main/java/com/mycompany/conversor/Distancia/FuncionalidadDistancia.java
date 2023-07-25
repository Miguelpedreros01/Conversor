package com.mycompany.conversor.Distancia;

import javax.swing.JOptionPane;

public class FuncionalidadDistancia {
    
    ConvertidorDistancia Distancia = new ConvertidorDistancia();
    
    public void ConvertirDistancia(double MedEntrada) {
        String opcion = (JOptionPane.showInputDialog(null, "Seleccione la Opcion a Convertir", "Longitud", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"Metros a Centimetros", "Kilometros a Metros"}, "Seleccion")).toString();
        switch (opcion) {
            case "Metros a Centimetros":
                Distancia.MetrosACentimetros(MedEntrada);
                break;
            case "Kilometros a Metros":
                Distancia.KilometroAMetros(MedEntrada);
                break;
        }
        
    }
}
