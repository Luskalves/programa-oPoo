package com.company;


public class Main {

    public static void main(String[] args) {
	// write your code here

        /*Heroi2 h1 = new Heroi2("Superman","Super Força","Masculino");

        System.out.println(h1.nomeHeroi);
        System.out.println(h1.superPoder);
        System.out.println(h1.sexo);

        h1.pessoas(10);
        */
        Heroi batman = new Heroi();
        batman.setNome("Batman");
        batman.setPeso(85.1);
        batman.setForcaAtaque(100);
        batman.imprimirAtributos();

//        Heroi superman = new Heroi("",-79.6, -900);
//        superman.getNome();
//        superman.getPeso();
//        superman.getForcaAtaque();

    }
}
