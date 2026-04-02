import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        //1. caçar
        //2. comer
        //3. dormir

        var gerador = new Random();
        var p1 = new Personagem("Diego");
        //p1.nome = "Diego";



        var p2 = new Personagem("Nala", 5, 9, 2);
        //p2.nome = "Nala";
        //p2.setEnergia(5);
        //p2.setFome(9);
        //p2.setSono(2);

        var p3 = new Personagem();
        p3.nome = "Mike";
        p2.setEnergia(5);
        p2.setFome(5);
        p2.setSono(5);

        //incluir novo personagem com nome 
        //desempenha as seguintes tarefas:
        //60% de probabilidade de comer
        //20% de probabilidade de caçar
        //20% de probabilidade de dormir
        //seu inicial é:
        //5, 9 e 2
        while(true){
            var oQueFazer = gerador.nextInt(1, 4);
            switch (oQueFazer) {
                case 1:
                    p1.cacar();
                    break;
                case 2:
                    p1.comer();
                    break;
                case 3:
                    p1.dormir();
                    break;
            }
            
            oQueFazer = gerador.nextInt(1, 11);
            switch (oQueFazer) {
                case 1, 2, 3, 4, 5, 6:
                    p2.comer();
                    break;
                case 7: 
                case 8: 
                p2.cacar();
                break;
                case 9, 10: 
                p2.dormir();
                break;
            }
            System.out.println(p1);
            System.out.println(p2);
            System.out.println("==========================");
            Thread.sleep(8000);
        }

    
    }    
     
}

//to string entrega a representacao textual do objeto