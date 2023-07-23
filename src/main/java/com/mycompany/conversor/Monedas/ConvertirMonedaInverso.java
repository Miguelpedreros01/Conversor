package com.mycompany.conversor.Monedas;

import javax.swing.JOptionPane;

public class ConvertirMonedaInverso {

    public void DolarAPesos(double valor) {
        double MonedaDolar = valor * 3975.00;
        MonedaDolar = (double) Math.round(MonedaDolar * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + MonedaDolar + " Pesos Colombianos");
    }

    public void EuroAPesos(double valor) {
        double MonedaEuro = valor * 4424.00;
        MonedaEuro = (double) Math.round(MonedaEuro * 100d) / 100;
        JOptionPane.showMessageDialog(null, "Tienes " + MonedaEuro + " Pesos Colombianos");
    }
    
    public void LibrasAPesos(double valor){
        double MonedaLibra = valor * 5111.00;
        MonedaLibra = (double) Math.round(MonedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + MonedaLibra + " Pesos Comolbianos");
    }
    
    public void YenesAPesos(double valor){
        double MonedaYen = valor * 28.00;
        MonedaYen = (double) Math.round(MonedaYen *100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + MonedaYen + " Pesos Colombianos");
    }
    
    public void WonAPesos(double valor){
        double MonedaWon = valor * 3.00;
        MonedaWon = (double) Math.round(MonedaWon *100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + MonedaWon + "Pesos Colombianos");
    }
}
