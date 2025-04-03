package colecoes;

class Veiculo(
    String placa;
    int ano;
)

Veiculo(String placa, int ano){
    this.placa = placa;
    this.ano = ano;
}

public class BasicosDeVetores3 {
    public static void main(String[] args) {
        // Veiculo [] veiculos = new Veiculo[4];
        Veiculo veiculos [] = new Veiculo[4];
        veiculos[0] = new Veiculo("abc-123", 2002); 
    }

    static void trocaValor(Veiculo [] veiculos){
        veiculos[0].ano = 2001;
    }
    
}
