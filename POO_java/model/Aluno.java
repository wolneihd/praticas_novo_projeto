package POO_java.model;

import POO_java.interfaces.Metodos;

public class Aluno extends Pessoa implements Metodos {
    
    private String escola;

    public Aluno(String escola) {
        this.escola = escola;
    }

    public Aluno(String nome, int idade, String escola) {
        super(nome, idade);
        this.escola = escola;
    }

    public String getEscola() {
        return escola;
    }

    public void setEscola(String escola) {
        this.escola = escola;
    }

    @Override
    public String apresentar() {
        return "nome: " + getNome() + " idade: " + getIdade() + " escola: " + getEscola();
    }

    @Override
    public String verificarMaioridade() {
        if (getIdade() >= 18 ) {
            return "maior de idade!";
        } else {
            return "menor de idade!";
        }
    }

}
