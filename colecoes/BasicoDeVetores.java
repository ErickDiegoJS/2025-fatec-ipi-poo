package colecoes;

public class BasicoDeVetores {
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
