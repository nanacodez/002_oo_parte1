public class JogoV1 {
  public static void main(String[] args) throws Exception {
    var cacador = Personagem.criar("John");

    while(true){
      cacador = cacador.cacar();
      System.out.printf("%s: %d", cacador.nome(), cacador.energia());
      System.out.println("=======================================");
      Thread.sleep(5000);;
    }
  }  
}
