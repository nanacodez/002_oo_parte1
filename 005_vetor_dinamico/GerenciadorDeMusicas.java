import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import javax.swing.JOptionPane;


public class GerenciadorDeMusicas {
    public static void main(String[] args) {
        //tipo base e um tipo paramétrico
        //generics java 5+
        List <Musica> musicas = new ArrayList<>(); 
        int opcao;
        String menu = "0 - sair\n1 - cadastrar musica\n2 - avaliar musica\n3 - ver a lista de musicas em ordem alfabetica\n4 - ver a lista de musicas em ordem numerica";

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao){
                case 1: {
                    var titulo = JOptionPane.showInputDialog("titulo?");
                    var musica = new Musica(titulo); 
                    musicas.add(musica);
                    break;
                }

                case 2: {
                    var titulo = JOptionPane.showInputDialog("titulo: ");
                    var avaliacao = 
                        Integer.parseInt(JOptionPane.showInputDialog("nota: "));
                    for(int i = 0; i < musicas.size(); i++){
                                                    //equals compara se dois objetos sao equivalentes e retorna true ou false
                        if(musicas.get(i).getTitulo().equals(titulo)){ 
                            musicas.get(i).setAvaliacao(avaliacao);
                            JOptionPane.showMessageDialog(null, "musica avaliada!");
                            break;
                        }
                    }
                    break;
                }

                case 3: {
                    //exibir a lista ordenada pelo titulo
                    //para tal, será necessario implementar 
                    //uma interface chamada comparable na classe musica
                    Collections.sort(musicas);
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }

                case 4: {
                    //Colletions.sort(musicas, new CriterioAvaliacaoComparator());
                    musicas.sort(Comparator.comparingInt(Musica::getAvaliacao).thenComparing(Musica::getTitulo));
                    JOptionPane.showMessageDialog(null, musicas);
                    break;
                }
            }
        }
        while(opcao != 0);
    }
}

