package EDDinJava;

import javax.swing.JOptionPane;

public class Estacionamento {
    private Integer capacidade;
    private Integer quantidade;
    private Carro [] carro;
    //implementar funções adicionar, remover, estaCheio, estaVazio, exibirVetor
    //apos isso implementar o vetor dinamico
    //usar Math.min para impedir que ultrapasse o valor da pilha

    Estacionamento(){
        capacidade = 10;
        quantidade = 0;
        carro = (Carro[]) new Carro[capacidade];
    }

    public boolean estaCheio(){
        return capacidade == quantidade;
    }

    public boolean estaVazio(){
        return quantidade == 0;
    }
    
    public void adicionarCarro(Carro novoCarro){
        if (estaCheio()) {
            JOptionPane.showMessageDialog(null, "Não foi possível estacionar, estacionamento cheio!");
        } else {
            carro[quantidade++] = novoCarro;
        }
    }

    public void excluirCarro(String cmpPlaca){
        if(estaVazio()){
            JOptionPane.showMessageDialog(null, "O estacionamento está vazio!");
        }
        else{
            boolean encontrado = false;
            for(int i = 0; i<quantidade; i++){
                if(cmpPlaca.equals(carro[i].getPlaca())){
                    encontrado = true;
                    for(int j = i; j>0; j--){
                        carro[j-1].setManobra();
                    }
                    JOptionPane.showMessageDialog(null, "Carro com placa " + cmpPlaca + " removido tendo feito " + carro[i].getManobra() +" manobras");
                    for(; i<quantidade-1; i++){
                        carro[i] = carro[i+1];
                    }
                    carro[--quantidade] = null;
                    
                    i++;
                }
            }
            if(!encontrado){
                JOptionPane.showMessageDialog(null, "O carro de placa " + cmpPlaca + " não foi encontrada");
            }
        }
    }

    @Override
    public String toString(){
        var saida = new StringBuilder();

        saida.append("ESTACIONAMENTO: \n");
        for(int i = 0; i<quantidade; i++){
            saida.append(carro[i].getMarca()).append(" ").append(carro[i].getNome()).append(" placa: ").append(carro[i].getPlaca()).append(" qtdMan: ").append(carro[i].getManobra()).append("\n");
        }
        return saida.toString();
    }

}
