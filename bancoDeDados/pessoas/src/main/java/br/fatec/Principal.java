package br.fatec;

import javax.swing.JOptionPane;

public class Principal {
    public static void main(String[] args) {
        var menu = "1-Cadastrar\n2-Atualizar\n3-Remover\n4-Listar\n0-sair\n";
        int op;
        do {
            op = Integer.parseInt(JOptionPane.showInputDialog("Escolha uma das opções"));

            switch(op){
                case 1:{
                    
                    break;
                }
            }
        } while (op != 0);
    }
}
