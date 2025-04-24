package colecoes.minecraft.Baú.Inventario;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import colecoes.minecraft.Baú.Itens;

public class TesteInventario {
    public static void main(String[] args) {
        var invetario = new ArrayList<CampoInventario>();
        int opcao;
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("1- adicionar item a um campo\n2 - Remover item de um campo\n3 - listar um campo\n4 - criar campo\n0 - sair"));
            switch (opcao) {
                case 1:{
                    var nome = new String();
                    nome = JOptionPane.showInputDialog("Nome do campo: ");
                    
                    int indice = invetario.get(0).getContador();
                    for(int i=0; i<indice; i++){
                        if(invetario.get(i).getNome().equalsIgnoreCase(nome)){
                            var nomeItem = new Itens(JOptionPane.showInputDialog("Nome do objeto: "));
                            invetario.get(i).adicionar(nomeItem);
                        }
                    }
                    if (invetario.get(0).getContador() == indice) {
                        JOptionPane.showMessageDialog(null, "Campo não encontrado!");
                    }
                    break;
                }
                case 4:{
                    var nome = new String();
                    nome = JOptionPane.showInputDialog("Nome do campo(o que o campo armazena, ex: armas, objetos, comidas...)?");
                    var inventario = new CampoInventario(nome);
                    JOptionPane.showMessageDialog(null,"Campo '" + nome + "' criado!");
                    break;
                }
                default:
                    break;
            }
        } while (opcao != 0);
    }
}
