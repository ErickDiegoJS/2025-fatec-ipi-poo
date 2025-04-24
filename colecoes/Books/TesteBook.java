package colecoes.Books;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class TesteBook {
    public static void main(String[] args) {
        var biblioteca = new ArrayList<Book>();
        int opcao;
        var menu = "1 - Adicionar livro\n2 - Remover livro\n3 - Alterar livro\n4 - Listar biblioteca\n5 - Buscar livro\n0 - Sair";

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(opcao){
                    case 1:{
                        String possuiIlustrador = JOptionPane.showInputDialog("O livro possui ilustrador");
                        if(possuiIlustrador.equalsIgnoreCase("SIM")){
                            var titulo = JOptionPane.showInputDialog("Titulo:");
                            var autor = JOptionPane.showInputDialog("Autor:");
                            var ilustrador = JOptionPane.showInputDialog("Ilustrador:");
                            var genero = JOptionPane.showInputDialog("Genero:");
                            var anoDePublicacao = Integer.parseInt(JOptionPane.showInputDialog("Ano de publicação:"));
                            var qtdPaginas = Integer.parseInt(JOptionPane.showInputDialog("Numero de paginas:"));
                            var sinopse = JOptionPane.showInputDialog("Escreva uma breve descrição da história:");
                            var book = new Book(titulo, autor, ilustrador, genero, anoDePublicacao, qtdPaginas, sinopse);
                            biblioteca.add(book);
                        }
                        else if(possuiIlustrador.equalsIgnoreCase("NAO") || possuiIlustrador.equalsIgnoreCase("NÃO")){
                            var titulo = JOptionPane.showInputDialog("Titulo:");
                            var autor = JOptionPane.showInputDialog("Autor:");
                            var genero = JOptionPane.showInputDialog("Genero:");
                            var anoDePublicacao = Integer.parseInt(JOptionPane.showInputDialog("Ano de publicação:"));
                            var qtdPaginas = Integer.parseInt(JOptionPane.showInputDialog("Numero de paginas:"));
                            var sinopse = JOptionPane.showInputDialog("Escreva uma breve descrição da história:");
                            var book = new Book(titulo, autor, genero, anoDePublicacao, qtdPaginas, sinopse);
                            biblioteca.add(book);
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Não foi possivel adicionar o livro!");
                        }
                        break;
                    }
                    case 2:{
                        var titulo = JOptionPane.showInputDialog("Titulo: ");
                        var book = new Book(titulo);

                        if(biblioteca.contains(book)){
                            biblioteca.remove(book);
                            JOptionPane.showMessageDialog(null, "Livro removido da biblioteca");
                        }
                        else{
                            JOptionPane.showMessageDialog(null, "Não foi possivel encontrar esse livro");
                        }

                        break;
                    }
                    case 3:{
                        var titulo = JOptionPane.showInputDialog("Titulo: ");
                        var book = new Book(titulo);
                        var indice = biblioteca.indexOf(book);
                        if (indice < 0) { // Verifica se o livro não foi encontrado
                            JOptionPane.showMessageDialog(null, "Livro não encontrado na biblioteca.");
                        } else {
                            var livroExistente = biblioteca.get(indice); // Obtém o livro da lista
                            JOptionPane.showMessageDialog(null, "Se necessário, altere os campos. Caso contrário, deixe em branco.");
                    
                            var novoTitulo = JOptionPane.showInputDialog("Alterar o título ('" + livroExistente.getTitulo() + "'): ");
                            if (!novoTitulo.isBlank()) {
                                livroExistente.setTitulo(novoTitulo);
                            }
                    
                            var novoAutor = JOptionPane.showInputDialog("Alterar o autor ('" + livroExistente.getAutor() + "'): ");
                            if (!novoAutor.isBlank()) {
                                livroExistente.setAutor(novoAutor);
                            }var novoGenero = JOptionPane.showInputDialog("Alterar o gênero ('" + livroExistente.getGenero() + "'): ");
                            if (!novoGenero.isBlank()) {
                                livroExistente.setGenero(novoGenero);
                            }
                    
                            var novoAno = JOptionPane.showInputDialog("Alterar o ano de publicação ('" + livroExistente.getAnoDePublicacao() + "'): ");
                            if (!novoAno.isBlank()) {
                                livroExistente.setAnoDePublicacao(Integer.parseInt(novoAno));
                            }
                    
                            var novaQtdPaginas = JOptionPane.showInputDialog("Alterar o número de páginas ('" + livroExistente.getQtdPaginas() + "'): ");
                            if (!novaQtdPaginas.isBlank()) {
                                livroExistente.setQtdPaginas(Integer.parseInt(novaQtdPaginas));
                            }
                    
                            var novaSinopse = JOptionPane.showInputDialog("Alterar a sinopse ('" + livroExistente.getSinopse() + "'): ");
                            if (!novaSinopse.isBlank()) {
                                livroExistente.setSinopse(novaSinopse);
                            }
                    
                            JOptionPane.showMessageDialog(null, "Livro atualizado com sucesso!");
                        
                            break;
                        }
                    }
                    case 4:{
                        var ordenacao = Integer.parseInt(JOptionPane.showInputDialog("Escolha a forma de ordenação :\n1 - titulo\n2 - autor\n3 - ano\n4 - genero\n5 - tamanho\n"));
                        if(biblioteca.isEmpty()){
                            JOptionPane.showMessageDialog(null, "Não há livro na biblioteca");
                        }
                        else{
                            switch (ordenacao){
                                case 1:{
                                    Collections.sort(biblioteca);
                                    JOptionPane.showMessageDialog(null, biblioteca);
                                    break;
                                }
                                case 2:{
                                    Collections.sort(biblioteca, new AutorComparator());
                                    JOptionPane.showMessageDialog(null, biblioteca);
                                    break;
                                }
                                case 3:{
                                    Collections.sort(biblioteca, new AnoComparator());
                                    JOptionPane.showMessageDialog(null, biblioteca);
                                    break;
                                }
                                case 4: {
                                    Collections.sort(biblioteca, new GeneroComparator());
                                    JOptionPane.showMessageDialog(null, biblioteca);
                                    break;
                                }
                                case 5:{
                                    Collections.sort(biblioteca, new QtdPaginasComparator());
                                    JOptionPane.showMessageDialog(null, biblioteca);
                                    break;
                                }
                                default:
                                    break;
                            }
                        }
                        break;
                    }
                    case 5:{
                        var titulo = JOptionPane.showInputDialog("Titulo: ");
                        var book = new Book(titulo);
                        if(biblioteca.contains(book)){
                            
                            int indice = biblioteca.indexOf(book);
                            Book livroEncontrado = biblioteca.get(indice);
                            JOptionPane.showMessageDialog(null, livroEncontrado.toString());
                        } else {
                            JOptionPane.showMessageDialog(null, "Livro não encontrado.");
                        }
                        break;
                    }
                    case 0:
                        JOptionPane.showMessageDialog(null, "Até logo!");
                        break;
                    default:
                        JOptionPane.showMessageDialog(null, "Opção invalida!");
                        break;
            }
        } while (opcao != 0);
        
    }
}
