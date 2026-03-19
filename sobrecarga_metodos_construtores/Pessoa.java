//sobrecarga de construtores

public class Pessoa {
    private String nome;
    private int idade;
    private double altura;

    Pessoa(){

    }

    Pessoa(String nome){
        this(nome, 0, 0);
        //this.nome = nome;
    }

    Pessoa(String nome, int idade){
        this(nome, idade, 0);
        //this(nome);
        //this.idade = idade;
    }

    Pessoa(int idade, String nome){
        this(nome, idade, 0);
        //this(nome, idade);
        //this.idade = idade;
        //this.nome = nome;
    }

    Pessoa(String nome, int idade, double altura){
        this.nome = nome;
        this.idade = idade;
        this.altura = altura;
    }
}

