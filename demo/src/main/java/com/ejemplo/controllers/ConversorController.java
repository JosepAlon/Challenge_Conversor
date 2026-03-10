package com.ejemplo.controllers;

//Swing, cuando mostrás algo en un JLabel, necesita texto (String), no números.
import com.ejemplo.service.CallApi;


public class ConversorController {

    private CallApi api = new CallApi();

    public double convertir(String moneda1, String moneda2, double value) {
        double rate = api.obtenerConversion(moneda1, moneda2);
        System.out.println("Valor de la mondeda: " + rate);
        return value * rate;
    }



}
