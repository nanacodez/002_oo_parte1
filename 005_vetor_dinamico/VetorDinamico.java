public class VetorDinamico {
    private int quantidade;
    private int capacidade; 
    private int [] elementos;
    private static final int CAP_MINIMA = 4;

    public VetorDinamico(){
        //estado 
        quantidade = 0; 
        capacidade = 4;
        elementos =  new int[capacidade];        
    }

    public void adicionar(int e){
        if(estaCheia()){
            redimensionar(2.0);
        }
        elementos[quantidade] = e;
        quantidade++;
    }

    public void remover(){
        if(!estaVazio()){
            quantidade--;
            if(capacidade > CAP_MINIMA && quantidade == capacidade / 4){
                redimensionar(0.5);
            }
        }
    }

    private void redimensionar(double fator){
        var novo = new int [(int)(capacidade * fator)];
        for(int i = 0; i < quantidade; i++){
            novo[i] = elementos[i];
        }
        capacidade = novo.length;
        elementos = novo;
    }
    
    private void reduzirCapacidade(){
        var novo = new int [capacidade/2];
        for(int i = 0; i < quantidade; i ++){
            novo[i] = elementos[i];
        }
        capacidade = novo.length;
        elementos = novo;
    }

    private void aumentarCapacidade(){
        var novo = new int [capacidade * 2];
        for (int i = 0; i < quantidade; i ++){
            novo[i] = elementos[i];
        }
        capacidade = novo.length;
        elementos = novo;
    }

    public boolean estaVazio(){
        //operador ternario x == 3 ? true : false ;
        return quantidade == 0;
    }

    public boolean estaCheia(){
        //ternario eh desnecessario quando o valor eh boolean
        return quantidade == capacidade;
    }

    @Override
    public String toString() {
        //qtde: 2
        //capacidade: 4
        //2, 7
        //StringBuilder faz concatencao 
        //s.append (melhor que +)
        var sb = new StringBuilder("");
        sb.append("qtde: ").append(quantidade);
        sb.append("\n").append("cap: ").append(capacidade);
        sb.append("\n");
        if(!estaVazio()) {
            sb.append("\n");
            for(int i = 0; i < quantidade; i ++){
                sb.append(elementos[i]).append(" ");
            }
        }
        //retorna representacao textual do StringBuilder
        return sb.toString();
    }
}

