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
        this.placaDoCarro = placaDoCarro;
    }
    void setanoDoVeiculo(int anoDoVeiculo){
        this.anoDoVeiculo = anoDoVeiculo;
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

