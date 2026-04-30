import javax.swing.JOptionPane;

public class App {
    public static void main(String[] args) {
        var menu = "1 - cadastrar\n2 - visualizar\n3 - atualizar\n4 - remover\n0 - sair";
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            try {
                switch (opcao) {
                    case 1: {
                        var nome = JOptionPane.showInputDialog("nome?");
                        var fone = JOptionPane.showInputDialog("fone?");
                        var email = JOptionPane.showInputDialog("email?");
                        var pessoa = Pessoa.builder()
                                .nome(nome)
                                .fone(fone)
                                .email(email)
                                .build();

                        PessoaDAO dao = new PessoaDAO();
                        dao.cadastrar(pessoa);

                        JOptionPane.showMessageDialog(null, "Pessoa cadastrada!");

                        break;
                    }
                    case 2:
                        break;
                }
            } catch (Exception e) {
                e.printStackTrace();
                JOptionPane.showMessageDialog(null, "tente novamente mais tarde");
            }

        } while (opcao != 0);
    }
}
