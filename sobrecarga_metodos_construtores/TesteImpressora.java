public class TesteImpressora {
    public static void main(String[] args) {
    Impressora imp = new Impressora();
    imp.exibir(5.5f);
    imp.exibir(3.2f, 7.8f);
    imp.exibir(4.5f, "Java");
    imp.exibir("Java", 5.3f);
    imp.exibir("a", "b", "c");
    imp.exibir(3, 4, "a");
    
 }
}
