import java.util.Random;
import java.lang.reflect.*;
public class JogoV2 {
    public static void main(String[] args) throws Exception{
        var gerador = new Random();
        var pessoa1 = new Personagem("Lebron", 10, 10, 0);
        var pessoa2 = new Personagem();
        var pessoa3 = new Personagem("Soneca", 10, 0, 10);
        //vetor que armazena um array de personagens, os três existentes
        Personagem [] personagens = {pessoa1, pessoa2, pessoa3};
        while(true){
            var quemVaiJogar = gerador.nextInt(personagens.length);
            //1:cacar 
            //2:comer 
            //3:dormir
            //descobre a quantidade de metodos que a classe possui
            //Class<?> clazz = Personagem.class;
            // Method[] metodosPublicos = clazz.getMethods();
            // System.out.println("Numero de metodos publicos:" + metodosPublicos.length);
            // Method [] metodosDeclarados = clazz.getDeclaredMethods();
            // System.out.println("Numero de metodos declarados:" + metodosDeclarados.length);
            var oQueFazer = 1 + gerador.nextInt(3);//[0, 32) -> [1, 3)
            switch(oQueFazer){
                case 1:
                    personagens[quemVaiJogar].cacar();
                    break;
                case 2:
                    personagens[quemVaiJogar].comer();
                    break;
                case 3:
                    personagens[quemVaiJogar].dormir();
                    break;

            }
            System.out.println(personagens[quemVaiJogar]);
            System.out.println("\n**************************\n");
            
            Thread.sleep(2000);
        }

    }
    
}