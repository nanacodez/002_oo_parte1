public class TesteLivroDeNotas {
    public static void main(String[] args){
        LivroDeNotas livro1 = new LivroDeNotas ("POO"); 
        //declaração de variavel e 
        //livro1.setNomeDisciplina("POO");

        livro1.exibirMensagem(); //"." é operador de acesso ao membro

        //faze um novo livro e exibir a sua mensagem
        var livro2 = new LivroDeNotas("engenharia de software");
        //livro2.setNomeDisciplina("engenharia de software");
        //atribuir o nome Engenharia de Software
        livro2.exibirMensagem();
        System.out.println(livro1.getNomeDisciplina());
        System.out.println(livro2.getNomeDisciplina());
    }
}