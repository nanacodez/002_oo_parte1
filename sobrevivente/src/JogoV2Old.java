import java.util.Random;
public class JogoV2Old {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    // var p1 = new Personagem("Breno", 10, 0, 0);
    var p1 = new PersonagemOld("Breno");
    var p4 = new PersonagemOld();
    //incluir novo personagem como nome, claro
    //ele desempenha tarefas da seguinte forma:
    //60% de prob de comer
    //%20% de prob de caçar
    //20% de prob de dormir
    //seu estado inicial é 5, 9, 2

    var p2 = new PersonagemOld("Gustavo", 5, 9, 2);
    
    var p3 = new PersonagemOld("Matilde", 5, 5, 5);
   
    while(true){
      var oQueFazer = gerador.nextInt(1, 4);
      switch(oQueFazer){
        case 1:
          p1.cacar();
          break;
        case 2:
          p1.comer();
          break;
        case 3:
          p1.dormir();
          System.out.printf("nível %d de sono\n", p1.getSono());
          break;
      }
     
      oQueFazer = gerador.nextInt(1, 11);
      switch(oQueFazer){
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
