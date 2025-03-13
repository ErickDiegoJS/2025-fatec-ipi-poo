public class Carro{

    private String marcaDoCarro;
    private int numeroDePortas;

    public Carro(String marcaDoCarro, int numeroDePortas){
        this.setMarcaDoCarro(marcaDoCarro);
        this.setNumeroDePortas(numeroDePortas);
    }

    public void setMarcaDoCarro(String marcaDoCarro){
        this.marcaDoCarro = marcaDoCarro;
    }
    public void setNumeroDePortas(int numeroDePortas){
        this.numeroDePortas = numeroDePortas;
    }

    public String getMarcaDoCarro(){
        return this.marcaDoCarro;
    }
    public int getNumeroDePortas(){
        return numeroDePortas;
    }

    public void buzinar(){
        System.out.println("Beep beep!");
    }
    public void acelerar(){
        System.out.println("Vrum vrum!");
    }
}