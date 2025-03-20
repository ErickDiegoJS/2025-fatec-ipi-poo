class Carro{

    private String placaDoCarro;
    private int anoDoVeiculo;

    public Carro(String placaDoCarro){
        setplacaDoCarro(placaDoCarro);
    }

    public Carro(int anoDoVeiculo){
        setanoDoVeiculo(anoDoVeiculo);
    }

    void setplacaDoCarro(String placaDoCarro){
        placaDoCarro = placaDoCarro;
    }
    void setanoDoVeiculo(int anoDoVeiculo){
        anoDoVeiculo = anoDoVeiculo;
    }

    public String getplacaDoCarro(){
        return placaDoCarro;
    }

    public int getanoDoVeiculo(){
        return anoDoVeiculo;
    }

    public void abrirPortaMalas(){
        System.out.println("abrindo porta malas");
    }

    public void abrirJanelas(){
        System.out.println("abrindo janelas");
    }

}
======================================================
public class TesteExercicio1{
    public static void main(String... args){
        carro1 = new carro("fusca");
        carro2 = new carro("gol");

        carro1.abrirJanelas();
        carro2.abrirPortaMalas();

        System.out.println("Ano do carro: " + carro1.getanoDoVeiculo());
        System.out.println("Placa do carro: " + carro2.getplacaDoCarro());
    }
}
