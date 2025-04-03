package colecoes;
public class BasicoDeVetores2 {
    public static void main(String[] args) {
        // passagem deparametros, por valor ou rreferencia
        // int b = 3;
        // manipulaValor(b);
        // System.out.println(b);

        int [] v = {1, 2};
        manipulavetor(v);
        System.out.println(v[0]);
        System.out.println(v[1]);
    }
    // com um vetr a variavel foi passada por referencia;
    static void manipulavetor(int [] x){
        x[0] = 10;
        x[1] = 20;
    }
    // passagem por copia
    // o metodo cria uma copia da variavel e trabalha nessa copia, o valor da variavel não
    static void manipulaValor(int a){
        a = 2;
    }
    
}
