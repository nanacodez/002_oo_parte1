public class PersonagemOld {
  String nome;
  //encapsulamento com private 
  private int energia;
  private int fome;
  private int sono;

  //definicao de multiplos construtores
  //construtor 1
  public PersonagemOld(){
    energia = 10;
    fome = 0;
    sono = 0;
  }

  //construtor 2
  public PersonagemOld(String nome){
    this(); //um construtor pode pedir ajudar de outro construtor utilizando o this
    this.nome = nome;
  }

  //construtor 3 que recebe todos os parametros
  public PersonagemOld(String nome, int energia, int fome, int sono){
    this.nome = nome;
    setEnergia(energia);
    setFome(fome);
    setSono(sono);
  }
  
  //setter = atribui valores com acesso indireto com setter
  public void setEnergia(int e){
    if(e >= 0 && e <= 10)
      energia = e;
  }

  public void setFome(int fome){
    if(fome >= 0 && fome <= 10)
      this.fome = fome;
  }

  public void setSono(int sono) {
    if(sono >= 0 && sono <= 10)
      this.sono = sono;
  }

  public int getSono(){
    return this.sono;
  }

  void cacar(){
    if(energia >= 2){
      energia = energia - 2;
      System.out.println(nome + " caçando...");
    }else{
      System.out.println (nome + " sem energia para caçar...");
    }
    if (fome < 10) fome++;
    sono = Math.min(sono + 1, 10);
  }

  void comer(){
    if(fome > 0){
      System.out.printf("%s comendo...\n", nome);
      --fome;
      energia = energia < 10 ? energia + 1 : energia;
    }
    else{
      System.out.printf("%s sem fome...\n", nome);
    }
  }

  void dormir(){
    switch(sono){
      case 0:
        System.out.printf("%s sem sono\n", nome);
        break;
      default:
        System.out.print(nome + " dormindo...\n");
        sono--;
        energia = Math.min(energia + 1, 10);
        break;
    }
  }

  @Override
  public String toString() {
    return String.format(
      "%s: e: %d, f: %d, s: %d",
      nome, energia, fome, sono
    );
  }
  // void exibirEstado(){
  //   System.out.printf(
  //     "%s: e: %d, f: %d, s: %d\n",
  //     nome, energia, fome, sono
  //   );
  // }
}
