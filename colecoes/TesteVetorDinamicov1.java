package colecoes;
import java.util.Random;
public class TesteVetorDinamicov1 {
  public static void main(String[] args) throws Exception {
    var gerador = new Random();
    var v = new VetorDinamico();
    while(true){
      //o metodo possui um intervalo de 0 a 1 automatico
      var oQueFazer = gerador.nextDouble();
      if(oQueFazer <= 0.5){
        var numero = gerador.nextInt(1, 7);//[1, 7)
        v.adicionar(numero);
      }
      else{
        v.remover();
      }
      System.out.println(v);
      System.out.println("**************************");
      Thread.sleep(5000);
    }
  }
}
