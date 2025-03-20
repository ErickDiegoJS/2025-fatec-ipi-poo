public class TesteCarro {
    public static void main(String[] args) {
        Carro carro1 = new Carro("Fiat", 2022);

        System.out.println("Marca: " + carro1.marca);
        System.out.println("Ano: " + carro1.ano);

        carro1.LigarAr();
    }
}