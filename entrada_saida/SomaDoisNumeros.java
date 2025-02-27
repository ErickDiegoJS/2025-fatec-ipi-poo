import javax.swing.JOptionPane;
public class SomaDoisNumeros{
    static public void main(String [] args){
        //declaração de variáveis
        double a, b;
        double resultado;
        //entrada de dados
        a = Double.parseDouble(JOptionPane.showInputDialog("Digite o primeiro valor:"));
        b = Double.parseDouble(JOptionPane.showInputDialog("Digite o segundo valor:"));
        //processamento
        resultado = a + b;
        //saida
        JOptionPane.showMessageDialog(null, resultado);
    }
}