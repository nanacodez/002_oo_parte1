public class TesteCalculadoraCientifica {
    public static void main(String [] args) {
        var calc = new CalculadoraCientifica();
        System.out.println(calc.raiz(6));
        System.out.println(calc.raiz(1.2));
        System.out.println(calc.raiz("6"));
        System.out.println(calc.potencia((byte)3, (byte)5));
        System.out.println(calc.potencia("8", "4"));
        System.out.println(calc.potencia(2, 4.3));
    
    }
}
