package POO_java;

import POO_java.model.Funcionario;
import POO_java.model.Pessoa;

public class Programa {
    public static void main(String[] args) {
        
        Pessoa pessoa = new Pessoa("João", 31);
        Funcionario funcionario = new Funcionario("Pedro", 28, "Metalúrgico");

        System.out.println(funcionario.getCargo());
        System.out.println(pessoa.mostrarDados());

    }
}
