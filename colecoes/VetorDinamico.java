
package colecoes;

//polimorfismo parametrico
public class VetorDinamico<Type>{
    //LIMIAR_INFERIOR representa a quantidade minima de tamanho do vetor
  private static final int LIMIAR_INFERIOR = 4;
  private Type [] elementos;
  private int quantidade;
  private int capacidade;

  VetorDinamico(){
    quantidade = 0;
    capacidade = LIMIAR_INFERIOR;
    //elementos =  new int[capacidade];
    elementos = (Type[]) new Object[capacidade];
  }

  public boolean estaCheio(){
    //ternario: return quantidade == capacidade ? true : false;
    return quantidade == capacidade;
  }

  public boolean estaVazio(){
    return quantidade == 0;
  }

  private void redimencionar(double fator){
    //alocando um vetor com a capacidade apropiada
    //int [] aux = new int[(int)(capacidade*fator)];
    Type [] aux = (Type[]) new Object[capacidade];
    //copiar todos os elementos de um vetor para outro
    for(int i=0; i<quantidade; i++){
        aux[i] = elementos[i];
    }
    //atualizar a capacidade
    capacidade =(int)(capacidade*fator);
    //fazer o ponteiro elementos apontar para aux
    elementos = aux;
  }

  public void adicionar(Type e){
    if(estaCheio()){
        redimencionar(2);
    }
    elementos[quantidade++] = e;
  }

  public void remover(){
    if(!estaVazio()){
        quantidade --;
        if(quantidade == capacidade/4 && capacidade > LIMIAR_INFERIOR){
            redimencionar(0.5);
        }
    } 
  }

  public String toString(){
    // String s = "a" + "b";
    //qtde: 3
    //cap: 4
    //1 2 3
    // return String.format(
    // );
    var sb = new StringBuilder("");
    sb.append("Qtde: ").append(quantidade).append("\n");
    sb.append("Cap: ").append(capacidade).append("\n");
    for(int i = 0; i < quantidade; ++i){
      sb.append(elementos[i]).append( i != quantidade - 1 ? " " : "");  
    }
    return sb.toString();
  }
}
