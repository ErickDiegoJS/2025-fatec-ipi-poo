public class TesteExercicio1{
    public static void main(String... args){
        carro1 = new Carro("fusca");
        carro2 = new Carro("gol");

        carro1.abrirJanelas();
        carro2.abrirPortaMalas();

        System.out.println("Ano do carro: " + carro1.getanoDoVeiculo());
        System.out.println("Placa do carro: " + carro2.getplacaDoCarro());
    }
}