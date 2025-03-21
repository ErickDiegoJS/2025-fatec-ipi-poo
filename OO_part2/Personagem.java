public class Personagem{
    //caso não seja atribuido valor, será atribuido null ou 0 automaticamente
    String nome = null;
    int energia = 10;
    int fome = 0;
    int sono = 0;

    void exibirAtributos(){
        System.out.printf("E = %d | F = %d | S = %d\n\n", energia, fome, sono);
    }

    void mensagemInicial(){
        System.out.printf("Marcos esta na ilha! seus niveis atuais sao:\n");
        //exibirAtributos();
    }

    void cacar(){
        if(energia>=2){
            System.out.println(nome + " cacando");
            energia -=2;

        }
        else{
            System.out.println(nome + " sem enegia para cacar, durma!");
        }
        fome = fome <10 ? fome +1 : fome;
        sono = Math.min(sono + 1, 10);
        //exibirAtributos();
    }

    void comer(){
        if(fome>=1){
            System.out.print(nome + " comendo \n");
            energia +=1;
            fome -=1;
            energia = energia<10? energia++ : energia;
            //exibirAtributos();
        }
        else{
            System.out.println(nome + " nao esta com fome ");
        }
    }

    void dormir(){
        if(sono>=1){
            System.out.printf("%s dormindo \n", nome);
            sono -=1;
            energia +=1;
            switch(energia){
                case 1, 2, 3, 4, 5, 6, 7, 8, 9:
                ++energia;
                    break;
                    
            }
            //exibirAtributos();
        }
        else{
            System.out.printf("%s nao esta com sono\n", nome);
        }
    }
    
    public String toString(){
        return String.format("%s e %d; f: %d; s: %d\n", nome, energia, fome, sono);
    }
}