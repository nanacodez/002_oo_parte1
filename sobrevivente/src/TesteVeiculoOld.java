public class TesteVeiculoOld {
  public static void main(String[] args) {
    var v1 = VeiculoOld.builder()
    .placa("AAA-1111")
    .modelo("Ka")
    .build();

    System.out.println(v1);

    var v2 = VeiculoOld.builder().modelo("Fusca").placa("BBB-2222").build();

    System.out.println(v2);

    var v3 = new VeiculoOld();

    v3.setModelo("Brasilia");
    v3.setPlaca("CCC-4444");

    System.out.printf("%s %s\n", v3.getModelo(), v3.getPlaca());

    var v4 = new VeiculoOld("HB20", "DDD-5555");

    System.out.printf("%s %s\n", v4.getModelo(), v4.getPlaca());

    System.out.println(v4);


  }  
}
