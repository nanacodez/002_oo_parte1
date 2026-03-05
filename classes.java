import java.util.List;

class Aluno{
    String nome;
    String cpf;

}

class Professor{
    String nome;
    String cpf;
    String disciplina;
}

class Disciplina{
    String nome;
    String sigla;
    int codigo;
    List<Professor> professores;

}

class Veiculo{
    String placa;
    String modelo;
    double valor;
    String marca;
    String renavam;
    String cor;
}
