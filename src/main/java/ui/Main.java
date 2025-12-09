package ui;

import data.GestorUnidades;
import model.CentroCultivo;
import model.PlantaProceso;
import model.UnidadOperativa;

import java.sql.SQLOutput;

//Clase principal
public class Main {
    public static void main(String[] args) {
        GestorUnidades gestor = new GestorUnidades();

        //Inicio
        System.out.println("+++++Bienvenido a la base de datos Salmontt++++");
        System.out.println("++++++++++++++Unidades Operativas++++++++++++++\n");

        //Mostrar informacion por pantalla
        for (UnidadOperativa uo : gestor.getUnidades()) {
            System.out.println(uo.mostrarInformacion());
            System.out.println("++++++++++++++++++++++++++++++++++++++++++");


        }
    }
}