package com.aluracursos.conversorDeMonedas.Principal;

import com.aluracursos.conversorDeMonedas.Consultas.ConsultaAPI;
import com.aluracursos.conversorDeMonedas.Menu.Menu;
import com.aluracursos.conversorDeMonedas.Modelos.Moneda;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Menu menu = new Menu();
        String tipoDeCambioOrigen = null;
        String tipoDeCambioDestino = null;

        System.out.println(menu.getSaludo());
        int opcionUsuario = 0;

        while (opcionUsuario != 7){

            System.out.println(menu.getMenuOpciones());
            opcionUsuario = Integer.valueOf(lectura.nextLine());

            switch (opcionUsuario){
                case 1:
                    tipoDeCambioOrigen = "USD";
                    tipoDeCambioDestino = "COP";
                    break;
                case 2:
                    tipoDeCambioOrigen = "COP";
                    tipoDeCambioDestino = "USD";
                    break;
                case 3:
                    tipoDeCambioOrigen = "USD";
                    tipoDeCambioDestino = "ARS";
                    break;
                case 4:
                    tipoDeCambioOrigen = "ARS";
                    tipoDeCambioDestino = "USD";
                    break;
                case 5:
                    tipoDeCambioOrigen = "USD";
                    tipoDeCambioDestino = "BRL";
                    break;
                case 6:
                    tipoDeCambioOrigen = "BRL";
                    tipoDeCambioDestino = "USD";
                    break;
            }

            if (opcionUsuario >= 1 && opcionUsuario < 7){
                System.out.println("Ingrese la cantidad que desea convertir: ");
                double montoAConvertir = Double.valueOf(lectura.nextLine());

                ConsultaAPI consulta = new ConsultaAPI();

                Moneda moneda = consulta.consultaTipoDeCambio(tipoDeCambioOrigen, tipoDeCambioDestino, montoAConvertir);

                System.out.println("\n");
                // System.out.println(moneda);
                System.out.println("El valor: "+ montoAConvertir + " [" +tipoDeCambioOrigen + "] " + "corresponde al valor final de: " + moneda.conversion_result() + " ["+ tipoDeCambioDestino + "]");
                System.out.println("\n");

            } else if (opcionUsuario == 7) {
                System.out.println("Gracias por usar nuestro sistema.");

            } else {
                System.out.println("Ingrese una opción válida");
            }

            List<Moneda> historial = new ArrayList<>();



        }

    }
}
