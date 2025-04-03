public class TesteLivroDeNotas {
    public static void main(String... args) {
        // 1. construir um livro de notas
        LivroDeNotas livroDeNotas = new LivroDeNotas("POO");
        //livroDeNotas.nomeDaDisciplina = "POO";
        //jaclivroDeNotas.setNomedaDisciplina("POO");

<<<<<<< HEAD
        System.out.println(livroDeNotas.getClass());
=======
        System.out.println(livroDeNotas.getNomeDaDisciplina());
>>>>>>> 835fe188cab877dbe6f42f106f87cdbbab48a5d2

        //LivroDeNotas livro2 = new LivroDeNotas();
        //livro2.nomeDaDisciplina = "BD";
        //livro2.setNomedaDisciplina("BD");

        // 2. acionar comportamento de exibir mensagem de boas vindas
        livroDeNotas.exibirMensagem();
        //livro2.exibirMensagem();
    }
}