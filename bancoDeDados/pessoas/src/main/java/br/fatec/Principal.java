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
                    try{
                        var nome = JOptionPane.showInputDialog("nome: ");
                        var fone = JOptionPane.showInputDialog("fone: ");
                        var email = JOptionPane.showInputDialog("e-mail: ");
                        var pessoa = new Pessoa(nome, fone, email);
                        var dao = new PessosaDAO();
                        dao.cadastrar(pessoa);
                        JOptionPane.showMessageDialog(null, "Cadastro ok!");
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Tente novamente mais tarde");
                    }
                    break;
                }
                case 2:{
                    try{
                        var nome = JOptionPane.showInputDialog("Nome: ");
                        var fone = JOptionPane.showInputDialog("Fone: ");
                        var email = JOptionPane.showInputDialog("Email: ");
                        var codigo = Integer.parseInt(JOptionPane.showInputDialog("Codigo: "));
                        var pessoa = new Pessoa(codigo, nome, fone, email);
                        var dao = new PessosaDAO();
                        JOptionPane.showMessageDialog(null, "Atualização ok!");
                    }
                    catch(Exception e){
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Sistema indisponivel");
                    }
                    break;
                }
                case 3:{
                    //fazer...
                }
                case 4:{
                    try {
                        var sb = new StringBuilder();
                        for(Pessoa p: new PessosaDAO().listar()){
                            sb.append(p).append("\n");
                        }
                        JOptionPane.showMessageDialog(null, new PessosaDAO().listar());
                    } catch (Exception e) {
                        e.printStackTrace();
                        JOptionPane.showMessageDialog(null, "Sistema indisponivel");
                    }
                }
            }
        } while (op != 0);
    }
}
