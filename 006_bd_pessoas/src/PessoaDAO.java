import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.*;

public class PessoaDAO {

    public void cadastrar(Pessoa p){

        // 1. Pega uma conexão com o banco
        Connection conn = ConnectionFactory.obterConexao();

        try {
            // 2. Cria o SQL com parâmetros (?)
            String sql = "INSERT INTO tb_pessoa (nome, fone, email) VALUES (?, ?, ?)";

            // 3. Prepara o comando SQL
            PreparedStatement ps = conn.prepareStatement(sql); 

            // 4. Substitui os ? pelos dados da pessoa
            ps.setString(1, p.getNome());   // nome
            ps.setString(2, p.getFone());   // fone
            ps.setString(3, p.getEmail());  // email

            // 5. Executa o INSERT
            ps.executeUpdate();

            // 6. Fecha tudo
            ps.close();
            conn.close();

            System.out.println("Cadastrado com sucesso!");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public List <Pessoa> listar() throws Exception{
        // 1 - construir lista de pessoas
        List <Pessoa> pessoas = new ArrayList<>();
        // 2 - definir comando sql
        var sql = "SELECT * FROM tb_pessoa";
        // 3 - estabelecer um conexao com o banco
        // 4 - preparar o comando 
        //try-with-resources
        // 5 - substituir os eventos placeholders
        // 6 - executar comando 
        try (
            var conexao = ConnectionFactory.obterConexao();
            var ps = conexao.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
        ){
        // 7 - tratar o resultado 
        rs.next();
        int codigo = rs.getInt("cod_pessoa");
        String nome = rs.getString("nome");
        String fone = rs.getString("fone");
        String email = rs.getString("email");
        var pessoa = 
        Pessoa.builder()
        .codigo(codigo).nome(nome).fone(fone).email(email).build();
        pessoas.add(pessoa);
        
        }

    }
}
