package com.mycompany.conversor.Main;

import javax.swing.JOptionPane;
import com.mycompany.conversor.Monedas.ConversorMoneda;
import com.mycompany.conversor.Monedas.Funcionalidad;
import com.mycompany.conversor.Monedas.Funcionalidad;

public class Inicio {

    public static void main(String[] args) {

        Funcionalidad moneda = new Funcionalidad();

        while (true) {

            String opciones = (JOptionPane.showInputDialog(null, "Seleccione Una Opcion De Conversion", "Menu", JOptionPane.QUESTION_MESSAGE, null, new Object[]{"Conversor de Moneda", "Conversor de Distancia"}, "Seleccion")).toString();

            switch (opciones) {
                case "Conversor de Moneda":
                    String input = JOptionPane.showInputDialog("Ingrese la Cantidad de Dinero que Deseas Convertir: ");
                    //if (validarNumero(input) == true) {
                        double DatoEntrada = Double.parseDouble(input);
                        moneda.ConvertirMoneda(DatoEntrada);

                        int respuesta = JOptionPane.showConfirmDialog(null, "¿Deseas Realizar Otra Conversion?");
                        if (JOptionPane.OK_OPTION == respuesta) {
                            System.out.println("OK, Afirmativo");
                        } else if(JOptionPane.NO_OPTION == respuesta) {
                            System.out.println("Programa Terminado");  
                        } else {
                            System.out.println("Cerrando Programa");
                        }
                    //} else {
                       //JOptionPane.showMessageDialog(null, "Valor Invalido, Por Favor Digite Numeros");
                    }
                    //break;

               // case "Conversor de Distancia":

                   //break;
            }
        }
    }

   // public static boolean ValidarNumero(String input) {
    //    try {
      //    if (x >= 0 || x < 0);
        //    return true;
        //} catch (NumberFormatException e) {
          //  return false;
        //}
    //}
//}
