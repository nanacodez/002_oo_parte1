public class TesteVeiculo {
  public static void main(String[] args) throws Exception{
    
    var v1 = Veiculo.criar("Fusca");
    while(v1.nivelCombustivel() > 0){
      //acelerar
      v1 = v1.acelerar();
      System.out.println("Combustível atual: " + v1.nivelCombustivel());
      System.out.println("==============");
      Thread.sleep(200);
    }
    //aqui acaba
    System.out.println("Acabou o combustível");
  }
}
