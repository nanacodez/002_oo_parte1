public record Veiculo(String modelo, double nivelCombustivel) {
  public Veiculo{
    //podemos usar para validar
  }

  public static Veiculo criar(String modelo){
    return new Veiculo(modelo, 100);
  }

  Veiculo acelerar(){
    System.out.println(modelo + " acelerando");
    return new Veiculo(modelo, nivelCombustivel - 1);
  }
}
