package com.company;

public class Crianca {

    Crianca(){

    }

    double nadar;
    double correr;
    int idade;
    String sorrir;
    String nome;

    void nome(String name){
        System.out.println("Olá " +name);
    }

    void correr(double m){
        System.out.println("Você correu " + m + " metros!");
    }

    void nadar(double m){
        System.out.println("Você nadou " + m + " metros!");
    }

    void idade(int i){
        System.out.println("Você tem "+ i + " anos!");
    }


}
