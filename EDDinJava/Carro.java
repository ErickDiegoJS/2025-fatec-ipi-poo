package EDDinJava;

public class Carro <carro>{
    private String nome;
    private String marca;
    private String placa;
    private Integer manobra;

    Carro(String nome, String marca, String placa, Integer manobra){
        this.marca = marca;
        this.nome = nome;
        this.placa = placa;
        this.manobra = manobra;
    }

    public String getNome(){
        return nome;
    }
    public String getPlaca(){
        return placa;
    }
    public String getMarca(){
        return marca;
    }
    public Integer getManobra(){
        return manobra;
    }

    public void setManobra(){
        this.manobra +=1;
    }


}
