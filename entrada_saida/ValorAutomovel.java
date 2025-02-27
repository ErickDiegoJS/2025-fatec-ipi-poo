import javax.swing.JOptionPane;
public class ValorAutomovel{
    public static void main(String[] args){
        //declaração de variaveis
        double a, resultado;
        //entrada e saida
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor de fabrica do automovel:"));
        //processamento
        resultado = a + ((a/100) * 45) + ((a/100) * 28);
        //saida
        JOptionPane.showMessageDialog(null, resultado);
    }
}