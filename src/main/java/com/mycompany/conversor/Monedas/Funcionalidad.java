package com.mycompany.conversor.Monedas;

import javax.swing.JOptionPane;

public class Funcionalidad {

    ConversorMoneda monedas = new ConversorMoneda();
    ConvertirMonedaInverso pesos = new ConvertirMonedaInverso();

    public void ConvertirMoneda(double MensajeEntrada) {
        String opciones = (JOptionPane.showInputDialog(null, "Seleccione la Moneda a la que Desea Convertir Su Dinero ", "Tipo de Cambio", JOptionPane.PLAIN_MESSAGE, null, new Object[]{"De Pesos a Dolar", "De Pesos a Euro", "De Pesos a Libras", "De Pesos a Yen", "De Pesos a Won Coreano", "De Dolar a Pesos", "De Euro a Pesos", "De Libras a Pesos", "De Yen a Pesos", "De Won Coreano a Pesos"}, "seleccion")).toString();
        switch (opciones) {
            case "De Pesos a Dolar":
                monedas.PesosADolares(MensajeEntrada);
                break;
            case "De Pesos a Euro":
                monedas.PesosAEuro(MensajeEntrada);
                break;
            case "De Pesos a Libras":
                monedas.PesosALibras(MensajeEntrada);
                break;
            case "De Pesos a Yen":
                monedas.PesosAYen(MensajeEntrada);
                break;
            case "De Pesos a Won Coreano":
                monedas.PesosAWon(MensajeEntrada);
                break;
            case "De Dolar a Pesos":
                pesos.DolarAPesos(MensajeEntrada);
                break;
            case "De Euro a Pesos":
                pesos.EuroAPesos(MensajeEntrada);
                break;
            case "De Libras a Pesos":
                pesos.LibrasAPesos(MensajeEntrada);
                break;
            case "De Yen a Pesos":
                pesos.YenesAPesos(MensajeEntrada);
                break;
            case "De Won Coreano a Pesos":
                pesos.WonAPesos(MensajeEntrada);
                break;
        }
    }
}
