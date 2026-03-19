//sobrecarga

public class Calculadora {
    public int somar(int a, int b) {
        return a + b;
    }

    //public double somar(int a, int b) {
    //    return a + b;
    //}

    public int somar(String s1, String s2) {
        int a = Integer.parseInt(s1);
        int b = Integer.parseInt(s2);
        return a + b;
    }

    public int somar(int i, String s) {
        return somar(s, i);
    }

    public int somar(String s, int i) {
        //return somar(s, Integer.toString(i));
        return Integer.parseInt(s) + i;
    }

    public int somar(int a, int b, int c) {
        return somar(somar(a, b),c); 
    }

    public double somar(double d1, double d2) {
        return d1 + d2;
    }
}

