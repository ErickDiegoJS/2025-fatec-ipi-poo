import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var pessoa2 = new Personagem();

        pessoa2.nome= "Mario";
        while(true){
            //1:cacar 
            //2:comer 
            //3:dormir
            var oQueFazer = 1 + gerador.nextInt(3);//[0, 32) -> [1, 3)
            switch(oQueFazer){
                case 1:
                    pessoa2.cacar();
                    break;
                case 2:
                    pessoa2.comer();
                    break;
                case 3:
                    pessoa2.dormir();
                    break;

            }
            System.out.println(pessoa2);
            System.out.println("\n**************************\n");
            
            Thread.sleep(2000);
        }
    }
    
}
