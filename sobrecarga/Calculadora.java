package Sobrecarga;

public class Calculadora {
    public long somar(long a, long b){
        return a + b;
    }

    public long somar(String s1, String s2){
        return Long.parseLong(s1) + Long.parseLong(s2);
    }

    public long somar(long a, long b, long c){
        return a + b + c;
    }

    public long somar(String s1, long l1){
        return Long.parseLong(s1) + l1;
    }

    public long somar(long l1, String s1){
        return somar(s1, l1);
    }
}
