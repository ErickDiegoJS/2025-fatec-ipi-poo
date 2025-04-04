public class JogoV1 {

    public static void main(String[] args) {
        //compilador de inferencia de tipo
        //var(feito pelo compilador)
        var pessoa1 = new Personagem();
        //pessoa1.nome = "Marcos";
        pessoa1.mensagemInicial();
        //10, 0, 0
        pessoa1.cacar();
        //8, 1, 1
        pessoa1.comer();
        //9, 0, 1
        pessoa1.dormir();
        //10, 0, 0
        
    }
}
