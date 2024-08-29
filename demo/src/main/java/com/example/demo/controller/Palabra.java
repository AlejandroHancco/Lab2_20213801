package com.example.demo.controller;


public class Palabra {

    //public Palabra (int  longitud, int intentos, String tema){
      //  this.longitud = nombre;
        //this.intentos = intentos;
        //this.tema = tema;
    //}

    public int getLongitud() {
        return longitud;
    }

    public void setLongitud(int longitud) {
        this.longitud = longitud;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    private int longitud;
    private int intentos;
    private String tema;

}
