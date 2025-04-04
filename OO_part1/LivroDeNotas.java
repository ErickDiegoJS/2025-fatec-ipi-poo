class LivroDeNotas {

    private String nomeDaDisciplina = null;

    // Construtor padrão (lista de parâmetros vazia)
    public LivroDeNotas(String nomeDaDisciplina) {
        this.setNomedaDisciplina(nomeDaDisciplina);
        //System.out.println("Construindo um livro de notas");
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