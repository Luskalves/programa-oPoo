package com.company;

public class Heroi2 {

    String nomeHeroi;
    String superPoder;
    String sexo;
    int pessoas;

    Heroi2(String nomeHeroi, String superPoder, String sexo){
        this.nomeHeroi = nomeHeroi;
        this.superPoder = superPoder;
        this.sexo = sexo;
    }

    void pessoas(int p){
        System.out.println("O " + nomeHeroi + " já salvou " + p + " pessoas");
    }

}
