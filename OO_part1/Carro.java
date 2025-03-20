class Carro{
    String marca;
    int ano;

    Carro(String marca, int ano){
        this.marca = marca;
        this.ano = ano;
    }

    void LigarAr() {
        System.out.println("Ligando Ar");
    }

    void AbrirPorta() {
        System.out.println("Abrindo porta");
    }
}