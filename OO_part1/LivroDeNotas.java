class LivroDeNotas{

    private String nomeDaDisciplina = null;

    void setNomedaDisciplina(String nomeDaDisciplina){
        this.nomeDaDisciplina = nomeDaDisciplina;
    }

    void exibirMensagem(){
        System.out.println("Bem Vindo ao Livro de Notas de " + nomeDaDisciplina);
    }
}