public record Personagem (String nome, int energia, int fome, int sono){
  
  public Personagem {
      
  }
  //método fábrica
  public static Personagem criar(String nome){
    return new Personagem(nome, 10, 0, 0);
  }

  public Personagem cacar(){
    System.out.println(nome + " caçando...");
    return new Personagem(nome, energia - 2, 0, 0);
  }
}
