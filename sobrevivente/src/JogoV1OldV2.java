public class JogoV1OldV2 {
  public static void main(String[] args) {
    var p1 = PersonagemOldV2.builder()
    .nome("John")
    .energia(7)
    .fome(10)
    .sono(5)
    .build();

    System.out.println(p1);
  }
}

// var p1 = new Personagem();
// p1.setNome("Ana");
// p1.setEnergia(10);
// p1.setFome(5);
// p1.setSono(4);
// System.out.println(p1);