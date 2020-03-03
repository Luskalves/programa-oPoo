package com.company;

public class Heroi {

    private String nome;
    private double peso;
    private double forcaAtaque;
    double atacar(){
        if(this.peso > 100){
            return 50;
        }
        else{
            return 10.2;
        }
    }

    Heroi(){
        System.out.println("> Criando um objeto atrvés do Construtor não parametrizado");
    }

    Heroi(String nome, double peso, double forca){
        this.setNome(nome);
        this.setPeso(peso);
        this.setForcaAtaque(forca);

    }

    void imprimirAtributos(){
        System.out.println("###################");
        System.out.println("Nome: "+ this.nome);
        System.out.println("Peso: "+ this.peso);
        System.out.println("Força de ataque: " + this.forcaAtaque);

    }

    public void setNome(String nome){
        if(nome.length() > 1 && nome.length() <= 100){
            this.nome = nome;
        }
        else{
            System.err.println("Erro! Nome inválido precisa conter no mínimo um caracter e no maximo 100");
            System.exit(0);//encerra o programa"!
        }
    }
    public String getNome(){
        return this.nome;
    }

    public void setPeso(double peso){
        if(peso > 0){
            this.peso = peso;
        }
        else{
            System.err.println("Erro! o peso tem que ser maior que zero!");
            System.exit(0);
        }
    }

    public double getPeso(){
        return this.peso;
    }

    public void setForcaAtaque(double forcaAtaque){
        if(forcaAtaque > 0){
            this.forcaAtaque = forcaAtaque;
        }
        else{
            System.err.println("Erro! A força precisa ser maior que zero!");
        }
    }

    public double getForcaAtaque(){
        return forcaAtaque;
    }
}
