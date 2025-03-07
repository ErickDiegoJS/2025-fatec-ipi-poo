public class TesteLivroDeNotas{
    public static void main(String... args){
        //1. construir um livro de notas
        LivroDeNotas livroDeNotas = new LivroDeNotas();
        //livroDeNotas.nomeDaDisciplina = "POO";
        livroDeNotas.setNomedaDisciplina("POO");

        LivroDeNotas livro2 = new LivroDeNotas();
        //livro2.nomeDaDisciplina = "BD";
        livro2.setNomedaDisciplina("BD");

        //2. acionar comportamento de exibir mensagem de boas vindas
        livroDeNotas.exibirMensagem();
        livro2.exibirMensagem();
    }
}
