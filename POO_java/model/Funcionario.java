package POO_java.model;

import POO_java.interfaces.Metodos;

public class Funcionario extends Pessoa implements Metodos { 
    
    private String cargo;

    public Funcionario(String cargo) {
        this.cargo = cargo;
    }

    public Funcionario(String nome, int idade, String cargo) {
        super(nome, idade);
        this.cargo = cargo;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    @Override
    public String apresentar() {
        return "nome: " + getNome() + " idade: " + getIdade() + " cargo: " + getCargo();
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
