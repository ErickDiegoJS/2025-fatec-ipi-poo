
package colecoes;

public class VetorDinamico{
    //LIMIAR_INFERIOR representa a quantidade minima de tamanho do vetor
  private static final int LIMIAR_INFERIOR = 4;
  private int [] elementos;
  private int quantidade;
  private int capacidade;

  VetorDinamico(){
    quantidade = 0;
    capacidade = LIMIAR_INFERIOR;
    elementos =  new int[capacidade];
  }

  public boolean estaCheio(){
    //ternario: return quantidade == capacidade ? true : false;
    return quantidade == capacidade;
  }

  public boolean estaVazio(){
    return quantidade == 0;
  }



  public void adicionar(int e){
    if(estaCheio()){
        //redimencionar o vetor
        int [] aux = new int [capacidade*=2];
        //copia elementos de um vetor para outro
        for(int i=0; i<quantidade; i++){
            aux[i] = elementos[i];

            capacidade*=2;
            elementos = aux;
        }
    }
    elementos[quantidade++] = e;
  }

  public void remover(){
    if(!estaVazio()){
        quantidade --;
        if(quantidade == capacidade/4 && capacidade > LIMIAR_INFERIOR){
            int [] aux = new int [capacidade/2];
            for(int i=0; i<quantidade; i++){
                aux[i] = elementos[i];
                capacidade/=2;

                elementos = aux;
            }
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
