import java.util.Random;
public class Personagem{
    //caso não seja atribuido valor, será atribuido null ou 0 automaticamente
    private String nome = null;
    private String [] possiveisNomes = {"Steve", "Alex", "Mark"};
    private int energia;
    private int fome;
    private int sono;

    //construdor padrão
    public Personagem(){
        nome = obterNomeAleatorio();
        energia = 10;
        fome = 0;
        sono = 0;
    }

    //gerador de nomes randomicos
    private String obterNomeAleatorio(){
        var gerador = new Random();
        return possiveisNomes[gerador.nextInt(possiveisNomes.length)];
    }

    //deve ser possivel construir um personagem passado pela classe cliente
    //se um dado for invalido , usar aquele que é padra para respectiva propiedade
    //se nome tiver mais de quatro letras, utilizar nome randomico
    public Personagem(String nome, int enegia, int fome, int sono){
        this.nome = nome.length() >= 4 ? nome: obterNomeAleatorio();
        this.energia = enegia >=0 && enegia <= 10? energia:10;
        this.fome = fome >=0 && energia <=10? fome:0;
        this.sono = sono >=0 && energia <=10? sono:0;

    }
    

    void exibirAtributos(){
        System.out.printf("E = %d | F = %d | S = %d\n\n", energia, fome, sono);
    }

    void mensagemInicial(){
        System.out.printf("Marcos esta na ilha! seus niveis atuais sao:\n");
        //exibirAtributos();
    }

    public void cacar(){
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

    public void comer(){
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

    public void dormir(){
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
    
    @Override
    public String toString(){
        return String.format("%s e %d; f: %d; s: %d\n", nome, energia, fome, sono);
    }
}