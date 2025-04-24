package colecoes.Books;

import java.util.Comparator;
public class Book implements Comparable<Book>{
    private String titulo;
    private String sinopse;
    private String autor;
    private String ilustrador;
    private String genero;
    private int anoDePublicacao;
    private int qtdPaginas;

    public Book(String titulo){
        this.titulo = titulo;
    }

    public String getTitulo() {
        return titulo;
    }
    
    public String getSinopse() {
        return sinopse;
    }
    
    public String getAutor() {
        return autor;
    }
    
    public String getIlustrador() {
        return ilustrador;
    }
    
    public String getGenero() {
        return genero;
    }
    
    public int getAnoDePublicacao() {
        return anoDePublicacao;
    }
    
    public int getQtdPaginas() {
        return qtdPaginas;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
    
    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }
    
    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    public void setIlustrador(String ilustrador) {
        this.ilustrador = ilustrador;
    }
    
    public void setGenero(String genero) {
        this.genero = genero;
    }
    
    public void setAnoDePublicacao(int anoDePublicacao) {
        this.anoDePublicacao = anoDePublicacao;
    }
    
    public void setQtdPaginas(int qtdPaginas) {
        this.qtdPaginas = qtdPaginas;
    }

    public Book(String titulo, String autor, String ilustrador, String genero, int anoDePublicacao, int qtdPaginas, String sinopse){
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("O título não pode ser vazio.");
        if (autor == null || autor.isBlank()) throw new IllegalArgumentException("O autor não pode ser vazio.");
        if (ilustrador == null || ilustrador.isBlank()) throw new IllegalArgumentException("O ilustrador não pode ser vazio");
        if (genero == null || genero.isBlank()) throw new IllegalArgumentException("O gênero não pode ser vazio.");
        if (anoDePublicacao <= 0) throw new IllegalArgumentException("O ano de publicação deve ser positivo.");
        if (qtdPaginas <= 0) throw new IllegalArgumentException("A quantidade de páginas deve ser positiva.");
        this.titulo = titulo;
        this.autor = autor;
        this.ilustrador = ilustrador;
        this.genero = genero;
        this.anoDePublicacao = anoDePublicacao;
        this.qtdPaginas = qtdPaginas;
        this.sinopse = sinopse;
    }

    public Book(String titulo, String autor, String genero, int anoDePublicacao, int qtdPaginas, String sinopse){
        if (titulo == null || titulo.isBlank()) throw new IllegalArgumentException("O título não pode ser vazio.");
        if (autor == null || autor.isBlank()) throw new IllegalArgumentException("O autor não pode ser vazio.");
        if (genero == null || genero.isBlank()) throw new IllegalArgumentException("O gênero não pode ser vazio.");
        if (anoDePublicacao <= 0) throw new IllegalArgumentException("O ano de publicação deve ser positivo.");
        if (qtdPaginas <= 0) throw new IllegalArgumentException("A quantidade de páginas deve ser positiva.");
        this.titulo = titulo;
        this.autor = autor;
        this.ilustrador = null;
        this.genero = genero;
        this.anoDePublicacao = anoDePublicacao;
        this.qtdPaginas = qtdPaginas;
        this.sinopse = sinopse;
    }

    @Override
    public String toString(){
        var saida = new StringBuilder("\nLivro: ");
        saida.append(titulo);
        if(ilustrador == null){
            saida.append("\nAutor: ").append(autor).append("\nGenero: ").append(genero).append("\nAno de publicação: ").append(anoDePublicacao).append("\nPaginas: ").append(qtdPaginas).append("\nDescrição:\n").append(sinopse).append("\n");
        }
        else{
            saida.append("\nAutor: ").append(autor).append("\nIlustrador: ").append(ilustrador).append("\nGenero: ").append(genero).append("\nAno de publicação: ").append(anoDePublicacao).append("\nPaginas: ").append(qtdPaginas).append("\nDescrição:\n").append(sinopse);
        }
        return saida.toString();
    }

    @Override
    public int compareTo(Book livro){
        return this.titulo.compareTo(livro.titulo);
    }

    @Override
    public boolean equals(Object obj){
        var nova = (Book) obj;
        return this.titulo.equals(nova.titulo);
    }
}

class AnoComparator implements Comparator<Book>{
    @Override
    public int compare (Book livro1, Book livro2){
        if(livro1.getAnoDePublicacao() > livro2.getAnoDePublicacao()){
            return -1;}
        if(livro1.getAnoDePublicacao() == livro2.getAnoDePublicacao()){
            return livro1.compareTo(livro2);}
        return 1;
    }
}

class AutorComparator implements Comparator<Book> {
    @Override
    public int compare(Book livro1, Book livro2) {
        // Compara os autores em ordem alfabética
        int resultado = livro1.getAutor().compareTo(livro2.getAutor());
        
        // Se os autores forem iguais, compara os títulos
        if (resultado == 0) {
            return livro1.getTitulo().compareTo(livro2.getTitulo());
        }
        
        return resultado;
    }
}

class QtdPaginasComparator implements Comparator<Book>{
    @Override
    public int compare (Book livro1, Book livro2){
        if(livro1.getQtdPaginas() > livro2.getQtdPaginas()){
            return 1;
        }
        if(livro1.getQtdPaginas() == livro2.getQtdPaginas()){
            return livro1.compareTo(livro2);
        }
        return -1;
    }
}

class GeneroComparator implements Comparator<Book>{
    @Override
    public int compare(Book livro1, Book livro2) {
        // Compara os autores em ordem alfabética
        int resultado = livro1.getGenero().compareTo(livro2.getGenero());
        
        // Se os autores forem iguais, compara os títulos
        if (resultado == 0) {
            return livro1.getTitulo().compareTo(livro2.getTitulo());
        }
        
        return resultado;
    }
}
