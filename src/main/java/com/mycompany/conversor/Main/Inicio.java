package com.mycompany.conversor.Main;

import javax.swing.JOptionPane;
import com.mycompany.conversor.Monedas.Funcionalidad;
import com.mycompany.conversor.Distancia.FuncionalidadDistancia;

public class Inicio {

    public static void main(String[] args) {

        Funcionalidad moneda = new Funcionalidad();
        FuncionalidadDistancia Distancia = new FuncionalidadDistancia();

        while (true) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione Una Opcion De Conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Distancia"}, "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingrese la Cantidad de Dinero que Deseas Convertir: ");
                    if (ValidarNumero(input) == true) {
                        double DatoEntrada = Double.parseDouble(input);
                        moneda.ConvertirMoneda(DatoEntrada);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas Realizar Otra Conversion?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("OK, Afirmativo");
                        } else {
                            System.out.println("Programa Terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor Invalido, Por Favor Digite Numeros");
                    }
                    break;

                case "Conversor de Distancia":
                    input = JOptionPane.showInputDialog(null, "Ingrese el Valor de la Distancia que Desea Convertir");
                    if (ValidarNumero(input) == true) {
                        double MensajeEntrada = Double.parseDouble(input);
                        Distancia.ConvertirDistancia(MensajeEntrada);

                        int respuesta = 0;
                        respuesta = JOptionPane.showConfirmDialog(null, "¿Desea Continuar?");
                        if ((respuesta == 0) && (ValidarNumero(input) == true)) {
                        } else {
                            JOptionPane.showMessageDialog(null, "Programa Terminado");
                        }
                    } else {
                        JOptionPane.showMessageDialog(null, "Valor Invalido");
                    }
                    break;
            }
        }
    }

    public static boolean ValidarNumero(String input) {
        try {
            double x = Double.parseDouble(input);
            if (x >= 0 || x < 0);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }
}
