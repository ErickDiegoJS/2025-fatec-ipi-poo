package colecoes.minecraft.Baú;

import javax.swing.JOptionPane;

public class TesteBau {
    public static void main(String[] args) {
        //chamar adicionar item, remover item e exibir baú
        var bau = new Bau();
        int opcao;

        do{
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1 - Adicionar item ao baú\n2 - Remover item do baú\n3 - Visualizar baú\n0 - Sair"));
            switch (opcao) {
                case 1:{
                    var nome = new String();
                    nome = JOptionPane.showInputDialog("Nome do item: ");
                    var item = new Itens(nome);
                    bau.adicionar(item);
                    break;
                }
                case 2:{
                    if(bau.estaVazio()){
                        JOptionPane.showMessageDialog(null, "O baú está vazio!");
                        break;
                    }
                    var nome = new String();
                    nome = JOptionPane.showInputDialog("Nome do item: ");
                    bau.remover(nome);
                    break;
                }
                case 3:
                    JOptionPane.showMessageDialog(null, bau.toString());
                    break;
                case 0:
                    JOptionPane.showMessageDialog(null, "Fechando baú...");
                    break;
                default:
                    break;
            }
        }while(opcao != 0 );
    }
}
