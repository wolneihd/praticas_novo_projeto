package POO_java.model;

public class Funcionario extends Pessoa { 
    
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

}
