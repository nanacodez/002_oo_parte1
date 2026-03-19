public class CalculadoraCientifica{
    public double raiz(int n) {
        return Math.sqrt(n);
    }

    public double raiz(double n) {
        return Math.sqrt(n);
    }

    public double raiz(String n) {
        double valor = Double.parseDouble(n);
        return Math.sqrt(valor);
    }

    public double potencia(byte a, byte b){
        return Math.pow(a, b);
    }

    public double potencia(String s1, String s2) {
        double sa = Double.parseDouble(s1);
        double sb = Double.parseDouble(s2);
        return Math.pow(sa, sb);
    }

    public double potencia(int a, double b) {
        return Math.pow(a, b);
    }
}
