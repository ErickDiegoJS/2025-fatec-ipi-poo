class LivroDeNotas {

    private String nomeDaDisciplina = null;

<<<<<<< HEAD
    //construtor padrão(lista de parametros vazia)
    public LivroDeNotas(String nomeDaDisciplina){
        this.setNomedaDisciplina(nomeDaDisciplina);
        //System.out.println("Construindo um liro de notas");
=======
    // Construtor padrão (lista de parâmetros vazia)
    public LivroDeNotas(String nomeDaDisciplina) {
        this.setNomedaDisciplina(nomeDaDisciplina);
        //System.out.println("Construindo um livro de notas");
>>>>>>> 835fe188cab877dbe6f42f106f87cdbbab48a5d2
    }

    // Setter
    void setNomedaDisciplina(String nomeDaDisciplina) {
        if (nomeDaDisciplina.length() >= 3) {
            this.nomeDaDisciplina = nomeDaDisciplina;
        }
    }

    // Getter
    public String getNomeDaDisciplina() {
        return nomeDaDisciplina;
    }

    void exibirMensagem() {
        System.out.println("Bem Vindo ao Livro de Notas de " + nomeDaDisciplina);
    }
}