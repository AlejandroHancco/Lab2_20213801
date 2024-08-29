package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@Controller
public class HomeController {
    @GetMapping("/formulario")
    public String formulario() {
        return "formulario";
    }
    @PostMapping("/formulario/jugar")
    public String formularioJugar(@RequestParam("intento") String intento,@RequestParam("longitud") int longitud,@RequestParam("tema") String tema, Model model) {
        String palabra= elegirPalabra(longitud,tema);
        String palabraEnc=palabra.replaceAll("[^ ]", "-");
        model.addAttribute("palabra",palabraEnc);
        model.addAttribute("intento", intento );

        return "formularioJugar";
    }


    public String elegirPalabra ( int longitud, String tipo ){
        String palabra="";
        List<String> listaElecciones = Arrays.asList();

        String [] animales = {"leon", "elefante", "tigre", "cebra", "jirafa", "delfin", "ballena", "gorila", "panda",
                "aguila", "hipopotamo", "koala", "lobo", "oso", "canguro"};


        List<String> listaAnimales = Arrays.asList(animales);
        String [] frutas = {"manzana", "platano", "kiwi", "mango", "pera", "uva", "fresa", "naranja", "piña", "sandía",
                "cereza", "melon", "papaya", "limon", "higo"};

        List<String> listaFrutas = Arrays.asList(frutas);
        String [] paises = {"Mexico", "Canada", "Brasil", "España", "Francia", "Italia", "Alemania", "Japon",
                "Australia", "Argentina", "Chile", "Peru", "EstadosUnidos", "China", "India"};


        List<String> listaPaises = Arrays.asList(paises);

        switch (tipo){
            case "animales":
                for (String animal: listaAnimales){
                    if (animal.length()==longitud){
                        palabra=animal;

                    }
                }

            case "frutas":
                for (String fruta: listaFrutas){
                    if (fruta.length()==longitud){
                        palabra=fruta;

                    }
                }
            case "paises":
                for (String pais: listaPaises){
                    if (pais.length()==longitud){
                        palabra=pais;

                    }
                }
        }
        return palabra;
    }


}





