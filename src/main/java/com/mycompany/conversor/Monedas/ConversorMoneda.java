package com.mycompany.conversor.Monedas;

import javax.swing.JOptionPane;
 public class ConversorMoneda {
    
     public void PesosADolares(double valor){
        double monedaDolar = valor/3975.00;
        monedaDolar = (double) Math.round(monedaDolar *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaDolar + " Dolares");
    }
    
    public void PesosAEuro(double valor){
        double monedaEuro = valor/4424.00;
        monedaEuro = (double) Math.round(monedaEuro *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaEuro + " Euros");
    }
    
    public void PesosALibras(double valor){
        double monedaLibra = valor/5111.00;
        monedaLibra = (double) Math.round(monedaLibra *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaLibra + " Libras Esterlinas");
    }
    
    public void PesosAYen(double valor){
        double monedaYen = valor/28.00;
        monedaYen = (double) Math.round(monedaYen *100d)/100;
        JOptionPane.showMessageDialog(null, "Tienes " + monedaYen + " Yenes Japoneses");
    }
    
    public void PesosAWon(double valor){
        double monedaWon = valor/3.00;
        monedaWon = (double) Math.round(monedaWon *100d)/100;
        JOptionPane.showMessageDialog(null,"Tienes " + monedaWon + " Won Coreano");
    }
}
