package colecoes;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.sound.midi.Track;

class trackz{
    private String titulo;
    private int avaliacao;
    public trackz(String titulo, int avaliacao){
        this.titulo = titulo;
        this.avaliacao = avaliacao;
    }
    public trackz(String titulo){
        this.titulo = titulo;
    }
    public String toString(){
        return String.format("Titulo %s, Avaliação %d",titulo, avaliacao);
    }
}

public class MyTrackz {
    public static void main(String[] args) {
        var minhasTrackz = new ArrayList<trackz>();
        var menu = "1-cadastrar\n2-remover\n3-atualizar\n4-listar ordenado por nome\n5-listar ordenado por avaliacao\n6-avaliar\n0-sair\n";
        int op;
        do{
            op = Integer.parseInt(JOptionPane.showInputDialog(menu));
            switch(op){
                case 1:
                    var titulo = JOptionPane.showInputDialog("titulo: ");
                    var trackz = new trackz(menu);
                    minhasTrackz.add(trackz);
                    JOptionPane.showMessageDialog(null, "Track adicionada");
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:

                    break;
                case 6:
                    break;
                case 0:
                    break;
                default:
                    break;

            }

        }while(op != 0);
    }
}
