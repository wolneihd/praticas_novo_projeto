package POO_java.model;

import POO_java.interfaces.Metodos;

public class Pessoa implements Metodos {

    private String nome;
    private int idade;

    public Pessoa() { }

    public Pessoa(String nome, int idade) {
        this.nome = nome;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String mostrarDados() {
        return "Pessoa: nome, idade: " + getNome() + " " + getIdade();
    }

}
