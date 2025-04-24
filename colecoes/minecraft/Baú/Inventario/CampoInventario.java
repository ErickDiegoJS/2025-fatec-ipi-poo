package colecoes.minecraft.Baú.Inventario;
import javax.swing.JOptionPane;
import colecoes.minecraft.Baú.Itens;

class CampoInventario {
    private static final int LIMIAR_INFERIOR = 8;
    private static final int LIMIAR_SUPERIOR = 32;
    private int contador = 0;
    private String nome;
    private Itens [] itens;
    private int capacidade;
    private int quantidade;

    CampoInventario(String nome){
        this.nome = nome;
        this.capacidade = LIMIAR_INFERIOR;
        this.quantidade = 0;
        // construo novo vetor de itens do tamanho de capacidade
        itens = new Itens[capacidade];
        contador++;
    }

    public String getNome(){
        return nome;
    }

    public int getContador(){
        return contador;
    }

    public void setContador(){
        this.contador = contador-1;
    }

    public boolean estaCheio(){
        return capacidade == quantidade;
    }
    public boolean estaVazio(){
        return quantidade == 0;
    }
    public boolean quaseVazio(){
        if(quantidade <= 8){
            return false;
        }
        int per = quantidade;
        for(per = quantidade; per>16; per=per-8){}
        if(per <= (16/2)-2){
            return true;
        }
        return false;
    }

    public int getQuantidade(){
        return quantidade;
    }

    private void redimensionar(int limiar){
        //construo um novo vetor auxiliar com o tamanho de um limiar previa
        var aux = new Itens[limiar];
        // copio os itens do vetor princpal para o segundario
        for(int i = 0; i<quantidade; i++ ){
            aux[i] = itens[i];
        }
        // defino o tamnho de capacidade com o valor da limiar previa
        capacidade = limiar;
        // passo aux para itens
        itens = aux;
    }

    public void adicionar(Itens coisa){
        // se estiver cheio e capacidade não fr a limial superior, redimensionar com a limial superior
        if(estaCheio() && capacidade != LIMIAR_SUPERIOR){
            redimensionar(capacidade + LIMIAR_SUPERIOR);
        }
        else if(capacidade == LIMIAR_SUPERIOR){
            // se já estiver redimensionado para limial superior, não adicionar iten
            JOptionPane.showMessageDialog(null, "Este campo esta cheio!");
            return;
        }
        // verificar se o iten já está presente no vetor. caso sim, inclementar quantidade
        for(int i=0; i<quantidade; i++){
            // ignora a caixa dos caracteres
            if(coisa. getNome().equalsIgnoreCase(itens[i].getNome())){
                int qtd = itens[i].getQuantidade();
                itens[i].setQuantidade(qtd+1);
                JOptionPane.showMessageDialog(null, "Iten adicionado");
                return;
            }
        }
        //adiciona item novo
        itens[quantidade++] = coisa;
        JOptionPane.showMessageDialog(null, "Iten adicionado");
    }

    public void remover(String coisa){
        // se não estiver proucurar um item com mesmo nome
        for(int i = 0; i<quantidade; i++){
            // se achar, copiar o iten a frente para posição atual ate o fim do vetor
            if(itens[i].getNome().equalsIgnoreCase(coisa)){
                if(itens[i].getQuantidade() > 0){
                    int qtd = itens[i].getQuantidade();
                    itens[i].setQuantidade(qtd -1);
                    JOptionPane.showMessageDialog(null, "Item removido!");
                }
                else{
                    for(;i<quantidade - 1; i++){
                        itens[i] = itens[i+1];
                    }
                    quantidade--;
                    // se apos excluir o iten o vetor estiver quase vazio, redimensionar para limiar inferior
                    if(quaseVazio() && capacidade != LIMIAR_INFERIOR){
                        redimensionar(LIMIAR_INFERIOR);
                    }
                }
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Item não encontrdo!");
    }

    @Override
    public String toString(){
        var sb = new StringBuilder();
        
        if(estaVazio()){
            sb.append("O campo está vazio!");
            return sb.toString();
        }
        for(int i=0; i<quantidade; i++){
            sb.append(itens[i].getNome()).append(" - ").append(itens[i].getQuantidade()).append("\n");
        }
        return sb.toString();
    }
    
    
}