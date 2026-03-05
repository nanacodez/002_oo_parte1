public class LivroDeNotas{
    private String nomeDisciplina;
    LivroDeNotas (String n){
        setNomeDisciplina(n);
    }

    public void setNomeDisciplina(String n){
        if(n.length() >=3 )
        nomeDisciplina = n;
    }
    public String getNomeDisciplina(){
        return nomeDisciplina;
    }

    void exibirMensagem() {
        System.out.printf("Bem vindo ao livro de notas de %s\n!", nomeDisciplina);
    }
}

//fazer um novo livro e exibir a sua mensagem
