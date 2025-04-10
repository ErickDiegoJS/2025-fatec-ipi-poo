package colecoes;

public class BasicoDeVetores {
<<<<<<< HEAD
    public static void main(String[] args) {
        // declaração de vetores
        // todo vetor é um objeto
        // int [] vetor1 = new int[4]; // inicializado por padrão
        // [0, 0, 0, 0]
        // var vetor1 = new int[10];
        // vetor1[0] = 1;
        // vetor1[1] = 2;
        // ...

        int [] vetor1 = {5, 7, 2, 2};
        System.out.println(vetor1.length);
        // calcular a media dos vetores;
        var media = 0d;// a meida é uma viavel do tipo double
        for(int i = 0; i < vetor1.length; i++){
            media += vetor1[i]; // media = media + vetor1[i]
        }
        //divisão da media pelo tamanho do vetor
        media /= vetor1.length;
        System.out.println(media);

    }
    
}
=======
  public static void main(String[] args) {
    //declaração de vetores
    // int v1 [10];
    // int [] v1 = new int[10];  
    // [0, 0, 0, 0]
    // var v1 = new int[4]; //inicializado com zero por padrão
    // v1[0] = 5;
    // v1[1] = 7;
    // v1[2] = 2;
    // v1[3] = 2;
    int [] v1 = {5, 7, 2, 2};
    System.out.println(v1.length);
    //calcular a média desse vetor
    var media = 0d;
    for(int i = 0; i <= v1.length; i++){
      // System.out.println(v1[i]);  
      media += v1[i]; //media = media + v1[i];
    }
    media /= v1.length;
    System.out.println(media);
  } 
}
>>>>>>> d546de6fe40cc4e324a3cdd3107a9701748db685
