package POO_java;

import POO_java.model.Aluno;
import POO_java.model.Funcionario;

public class Programa {
    public static void main(String[] args) {
        
        Funcionario funcionario = new Funcionario("Pedro", 28, "Metalúrgico");
        Aluno aluno = new Aluno("João", 15, "SENAI");

        System.out.println(funcionario.apresentar());
        System.out.println(aluno.apresentar());

        System.out.println(funcionario.verificarMaioridade());
        System.out.println(aluno.verificarMaioridade());

    }
}
