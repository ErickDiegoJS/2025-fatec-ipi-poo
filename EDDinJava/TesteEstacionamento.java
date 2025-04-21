package EDDinJava;

import java.util.ArrayList;

import javax.swing.JOptionPane;

public class TesteEstacionamento {
    public static void main(String[] args) {
        var estacionamento = new Estacionamento();
        int opcao;
        
        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite uma opção:\n1 - Estacionar carro\n2 - Retirar carro\n3 - Listar estacionamento\n0 - Sair"));
            switch (opcao) {
            case 1:{
                var nome = JOptionPane.showInputDialog("Nome: ");
                var marca = JOptionPane.showInputDialog("Marca: ");
                var placa = JOptionPane.showInputDialog("Placa: ");
                var carro = new Carro(nome, marca, placa, 0);
                estacionamento.adicionarCarro(carro);
                break;
            }
            case 2:{
                var placa = JOptionPane.showInputDialog("Placa: ");
                estacionamento.excluirCarro(placa);
                break;
            }
            case 3:{
                if(estacionamento.estaVazio()){
                    JOptionPane.showMessageDialog(null, "O estacionamento está vazio no momento");
                }
                else{
                    JOptionPane.showMessageDialog(null, estacionamento.toString());
                }
                break;
            }
            case 0:{
                JOptionPane.showMessageDialog(null, "Até a proxima!");
                break;
            }
            default:
                JOptionPane.showMessageDialog(null, "Opção invalide!");
                break;
        }
        } while (opcao != 0);
    }
}
